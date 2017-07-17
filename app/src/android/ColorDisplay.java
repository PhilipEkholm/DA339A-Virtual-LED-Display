/**package android;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by tsroax on 2014-11-14.

public class ColorDisplay extends View {
    private final int PAGE_SIZE = 7;
//    private int NO_COLOR = Color.argb(0,255,255,255);
    private int[][] systemPaint;
    private int[][] userPaint;
    private int background = Color.LTGRAY;
    private int grid = Color.BLACK;
    private int gridStroke = 2;
    private int sideSize = 40;
    private int horizontalPages = 1;
    private int verticalPages = 1;
    private Paint paint;
//    private Context context;

    public ColorDisplay(Context context) {
        super(context);
        init(context,null);
    }

    public ColorDisplay(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public ColorDisplay(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
//        this.context = context;
        if(attrs!=null) {
            TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ColorDisplay, 0, 0);
            try {
                background = a.getInteger(R.styleable.ColorDisplay_cd_background, Color.LTGRAY);
                grid = a.getInteger(R.styleable.ColorDisplay_cd_grid,Color.BLACK);
                horizontalPages = Math.max(a.getInteger(R.styleable.ColorDisplay_cd_horizontalPages, 1), 1);
                verticalPages = Math.max(a.getInteger(R.styleable.ColorDisplay_cd_verticalPages, 1), 1);
                gridStroke = Math.max(a.getInteger(R.styleable.ColorDisplay_cd_gridStroke, 2), 0);
                sideSize = Math.max(a.getInteger(R.styleable.ColorDisplay_cd_sideSize, 40), 1);
            } finally {
                a.recycle();
            }
        }
        paint = new Paint();
        systemPaint = new int[verticalPages* PAGE_SIZE][horizontalPages* PAGE_SIZE];
        userPaint = new int[verticalPages* PAGE_SIZE][horizontalPages* PAGE_SIZE];
        for(int row = 0; row < systemPaint.length; row++) {
            for(int col = 0; col < systemPaint[row].length; col++) {
                systemPaint[row][col] = background;
                userPaint[row][col] = background;
            }
        }

//        paint.setColor(color);
    }

    public void setBackgroundColor(int background) {
        this.background = background;
        invalidateDisplay();
    }

    public void setGridColor(int grid) {
        this.grid = grid;
        invalidateDisplay();
    }

    public void setGridStroke(int gridStroke) {
        this.gridStroke = gridStroke;
        invalidateDisplay();
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
        invalidateDisplay();
    }

    public int getBackgroundColor() {
        return background;
    }

    public int getGridColor() {
        return grid;
    }

    public int getGridStroke() {
        return gridStroke;
    }

    public int getSideSize() {
        return sideSize;
    }

    public int getHorizontalPages() {
        return horizontalPages;
    }

    public int getVerticalPages() {
        return verticalPages;
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
        if(userPaint!=null && systemPaint!=null) {
            for(int row = 0; row < systemPaint.length; row++) {
                for(int col = 0; col < systemPaint[row].length; col++) {
                    userPaint[row][col] = background;
//                    Log.d("update","row="+row+", col="+col+", color="+systemPaint[row][col]);
                }
            }
            updateDisplay();
        }
    }

    public void invalidate() {
        updateDisplay();
    }

    public void updateDisplay() {
        if(userPaint!=null && systemPaint!=null) {
            for(int row = 0; row < systemPaint.length; row++) {
                for(int col = 0; col < systemPaint[row].length; col++) {
                    systemPaint[row][col] = userPaint[row][col];
//                    Log.d("update","row="+row+", col="+col+", color="+systemPaint[row][col]);
                }
            }
            invalidateDisplay();
        }
    }

    public void setDisplay(int[][] colors) {
        setDisplay(colors,0,0);
    }

    public void setDisplay(int[][] colors, int verticalPage, int horizontalPage) {
        Log.d("update","colors.length="+colors.length+", PAGE_SIZE="+PAGE_SIZE);
        Log.d("update","colors[0].length="+colors[0].length+", PAGE_SIZE="+PAGE_SIZE);
        Log.d("update","verticalPage="+verticalPage+", verticalPages="+verticalPages);
        Log.d("update","horizontalPage="+horizontalPage+", horizontalPages="+horizontalPages);
        if(colors.length== PAGE_SIZE && colors[0].length== PAGE_SIZE &&
                verticalPage>=0 && verticalPage<verticalPages &&
                horizontalPage>=0 && horizontalPage<horizontalPages) {
            int rowOffset = verticalPage* PAGE_SIZE;
            int colOffset = horizontalPage* PAGE_SIZE;
            for(int row = 0; row < colors.length; row++) {
                for(int col = 0; col < colors[row].length; col++) {
                    userPaint[rowOffset + row][colOffset + col] = colors[row][col];
//                    Log.d("set","row="+row+", col="+col+", color="+userPaint[row][col]);
                }
            }
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int side = Math.min((MeasureSpec.getSize(widthMeasureSpec) - gridStroke)/(horizontalPages* PAGE_SIZE) - gridStroke,
        (MeasureSpec.getSize(heightMeasureSpec) - gridStroke)/(verticalPages*PAGE_SIZE) - gridStroke);
        side = Math.min(side,sideSize);

        int desiredWidth = horizontalPages*PAGE_SIZE * (side+ gridStroke) + gridStroke;
        int desiredHeight = verticalPages*PAGE_SIZE * (side+ gridStroke) + gridStroke;
//        int desiredWidth = horizontalPages*PAGE_SIZE * (sideSize+ gridStroke) + gridStroke;
//        int desiredHeight = verticalPages*PAGE_SIZE * (sideSize+ gridStroke) + gridStroke;

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
        int side = Math.min((getWidth()- gridStroke)/(horizontalPages* PAGE_SIZE)- gridStroke, (getHeight()- gridStroke)/(verticalPages*PAGE_SIZE)- gridStroke);
        Log.d("onDraw","side="+side);
        int offsetX = (getWidth()-systemPaint[0].length*(gridStroke+side)-gridStroke)/2; // beräknas för centrering
        int offsetY = (getHeight()-systemPaint.length*(gridStroke+side)-gridStroke)/2; // beräknas för centrering

        paint.setColor(grid);
        canvas.drawRect(0,0,getWidth(),getHeight(),paint);
        for(int row = 0; row < systemPaint.length; row++) {
            for(int col = 0; col < systemPaint[row].length; col++) {
//                Log.d("background","color="+background);
                paint.setColor(background);
                canvas.drawRect(offsetX + gridStroke + col * (side + gridStroke), offsetY + gridStroke + row * (side + gridStroke), offsetX + (1 + col) * (side + gridStroke), offsetY + (1 + row) * (side + gridStroke), paint);
//                canvas.drawRect(offsetX + gridStroke + col * (side + gridStroke), offsetY + gridStroke + row * (side + gridStroke), offsetX + gridStroke + col * (side + gridStroke) + side, offsetY + gridStroke + row * (side + gridStroke) + side, paint);
//                Log.d("user","color="+systemPaint[row][col]);
                paint.setColor(systemPaint[row][col]);
                canvas.drawRect(offsetX + gridStroke + col * (side + gridStroke), offsetY + gridStroke + row * (side + gridStroke), offsetX + (1 + col) * (side + gridStroke), offsetY + (1 + row) * (side + gridStroke), paint);
            }
        }
    }

    public static void pause(long ms) {
        try {
            Thread.sleep(ms);
        }catch(InterruptedException e) {}
    }


}*
*/
