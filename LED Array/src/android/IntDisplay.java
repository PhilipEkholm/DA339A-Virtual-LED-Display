/*package se.mah.tsroax.da339aproject;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by tsroax on 2014-11-27.

public class IntDisplay extends View {
    private final int PAGE_SIZE = 7;

    private int[][] systemValues;
    private int[][] userValues;
    private int mode = 1;
    private int textColor = Color.BLACK;
    private int background = Color.WHITE;
    private int grid = Color.BLACK;
    private int gridStroke = 4;
    private int gridWidth = 90;
    private int gridHeight = 40;
    private int horizontalPages = 1;
    private int verticalPages = 1;
    private Paint paint;
    private Typeface typeface;

    public IntDisplay(Context context) {
        super(context);
        init(context,null);
    }

    public IntDisplay(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public IntDisplay(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        Rect rect = new Rect();
        if(attrs!=null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.IntDisplay, 0, 0);
            try {
                background = a.getInteger(R.styleable.IntDisplay_id_background, Color.WHITE);
                textColor = a.getInteger(R.styleable.IntDisplay_id_textColor, Color.BLACK);
                grid = a.getInteger(R.styleable.IntDisplay_id_grid,Color.BLACK);
                mode = a.getInteger(R.styleable.IntDisplay_id_mode,1);
            } finally {
                a.recycle();
            }
        }
        paint = new Paint();
        typeface = Typeface.create(Typeface.MONOSPACE,Typeface.NORMAL);
        paint.setTypeface(typeface);
        paint.setTextSize(28);
        paint.getTextBounds("123,123",0,7,rect);
        gridWidth = rect.width()+16;
        gridHeight = 2*rect.height()+16;
        systemValues = new int[PAGE_SIZE][PAGE_SIZE];
        userValues = new int[PAGE_SIZE][PAGE_SIZE];

            for(int row = 0; row < systemValues.length; row++) {
                for(int col = 0; col < systemValues[row].length; col++) {
                    userValues[row][col] = -row*30000 + col *100;
                    systemValues[row][col] = -row*30000 + col *100;
                }
            }
    }

    public void setTextColor(int color) {
        this.textColor = color;
        invalidateDisplay();
    }

    public void setBackground(int background) {
        this.background = background;
        invalidateDisplay();
    }

    public void setGrid(int grid) {
        this.grid = grid;
        invalidateDisplay();
    }

    public void setMode(int mode) {
        if(mode==0 || mode==1) {
            this.mode = mode;
            invalidateDisplay();
        }
    }

    public int getBackgroundColor() {
        return background;
    }

    public int getGridColor() {
        return grid;
    }

    private void invalidateDisplay() {
        this.post(new Runnable() {
            public void run() {
                superInvalidate();
            }
        });
    }

    private void superInvalidate() {
        super.invalidate();
    }

    public void clearDisplay() {
        if(userValues !=null && systemValues !=null) {
            for(int row = 0; row < systemValues.length; row++) {
                for(int col = 0; col < systemValues[row].length; col++) {
                    userValues[row][col] = 0;
                }
            }
            updateDisplay();
        }
    }

    public void invalidate() {
        updateDisplay();
    }

    public void updateDisplay() {
        if(userValues !=null && systemValues !=null) {
            for(int row = 0; row < systemValues.length; row++) {
                for(int col = 0; col < systemValues[row].length; col++) {
                    systemValues[row][col] = userValues[row][col];
                }
            }
            invalidateDisplay();
        }
    }

    public void setDisplay(int[][] values) {
        if(values.length== PAGE_SIZE && values[0].length== PAGE_SIZE) {
            for(int row = 0; row < values.length; row++) {
                for(int col = 0; col < values[row].length; col++) {
                    userValues[row][col] = values[row][col];
                }
            }
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int desiredWidth = PAGE_SIZE * (gridWidth + gridStroke) + gridStroke;
        int desiredHeight = PAGE_SIZE * (gridHeight + gridStroke) + gridStroke;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width;
        int height;

        //Measure Width
        if (widthMode == MeasureSpec.EXACTLY) {
            //Must be this size
            width = widthSize;
        } else if (widthMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
            width = Math.min(desiredWidth, widthSize);
        } else {
            //Be whatever you want
            width = desiredWidth;
        }

        //Measure Height
        if (heightMode == MeasureSpec.EXACTLY) {
            //Must be this size
            height = heightSize;
        } else if (heightMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than...
            height = Math.min(desiredHeight, heightSize);
        } else {
            //Be whatever you want
            height = desiredHeight;
        }

        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        String part1="", part2="";
        int alpha, red, green, blue;
        int width = (getWidth()- gridStroke)/(PAGE_SIZE)- gridStroke;
        int height = (getHeight()- gridStroke)/(PAGE_SIZE)- gridStroke;
        int textX, textY;
        int offsetX = (getWidth()- systemValues[0].length*(gridStroke+width)-gridStroke)/2; // beräknas för centrering
        int offsetY = (getHeight()- systemValues.length*(gridStroke+height)-gridStroke)/2; // beräknas för centrering
        paint.setColor(grid);
        canvas.drawRect(0,0,getWidth(),getHeight(),paint);
        for(int row = 0; row < systemValues.length; row++) {
            for(int col = 0; col < systemValues[row].length; col++) {
                paint.setColor(background);
                canvas.drawRect(offsetX + gridStroke + col * (width + gridStroke), offsetY + gridStroke + row * (height + gridStroke), offsetX + (1 + col) * (width + gridStroke), offsetY + (1 + row) * (height + gridStroke), paint);
                textX = offsetX + gridStroke + 4 + col*(width+gridStroke);
                textY = offsetY + gridStroke + height/2 - 4 + row*(height+gridStroke);
                paint.setColor(textColor);
                paint.setTypeface(typeface);
                paint.setTextSize(28);
                if(mode==0) {
                    alpha = Color.alpha(systemValues[row][col]);
                    red = Color.red(systemValues[row][col]);
                    green = Color.green(systemValues[row][col]);
                    blue = Color.blue(systemValues[row][col]);
                    part1=String.format("%3d,%3d",alpha,red);
                    part2=String.format("%3d,%3d",green,blue);
                } else if(mode==1) {
                    part1 = String.valueOf(systemValues[row][col]);
                    if(part1.length()>5) {
                        part2 = " "+part1.substring(5,part1.length());
                        part1 = " "+part1.substring(0,5);
                    } else {
                        part2 = "";
                    }
  /*                  if(systemValues[row][col]<0)
                        part1="-";
                    else
                        part1="+";
                    int part1Value = Math.abs(systemValues[row][col]/100000);
                    if(part1Value==0)
                        part1 = part1 + "    ";
                    else
                        part1 = part1 + String.format(" %4d",part1Value);
                    part2 = String.format(" %5d",Math.abs(systemValues[row][col]%100000)); 
                }
                canvas.drawText(part1, textX, textY, paint);
                canvas.drawText(part2, textX, textY + height / 2, paint);
//                paint.setColor(systemValues[row][col]);
//                canvas.drawRect(offsetX + gridStroke + col * (width + gridStroke), offsetY + gridStroke + row * (width + gridStroke), offsetX + (1 + col) * (width + gridStroke), offsetY + (1 + row) * (width + gridStroke), paint);
            }
        }
    }

    public static void pause(long ms) {
        try {
            Thread.sleep(ms);
        }catch(InterruptedException e) {}
    }


}*/
