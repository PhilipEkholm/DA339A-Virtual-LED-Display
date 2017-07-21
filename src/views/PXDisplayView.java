package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import components.ColorDisplay;

public class PXDisplayView extends JPanel{
	private static final long serialVersionUID = 1L;
	private ColorDisplay display;
	
	/**
	 *	Start the display window 
	 */
	
	public PXDisplayView(){
		this.setLayout(new GridLayout(1, 1));
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(990, 210));
		
		this.display = new ColorDisplay(1, 5, android.Color.WHITE, android.Color.BLACK, 1, 1);
		
		this.add(display);
	}
	
	/**
	 *	Clears the display 
	 */
	
	public void clearDisplay(){
		display.clearDisplay();
	}
	
	/**
	 *	Write the arrays to the display 
	 *	@param colors colors passed as a 3D-Array
	 */
	
	public void writeToDisplay(int[][][] colors){
		int colPages = display.getHorizontalPages();
		
		for(int i = 0; i < colPages; i++){
			display.setDisplay(colors[i], 0, i);
		}
		
		display.updateDisplay();
	}
	
	/**
	 * 	Set grid color from controller, not implemented
	 * 	@param color color to set grid to
	 */
	
	public void setGridColor(int color){
		display.setGridColor(color);
	}
	
	/**
	 * 	Change the bg-color, method for controller to access
	 *	Note that the background color will only be changed AFTER clearDisplay is called 
	 *	@param color color to set bg to
	 */
	public void setBackgroundColor(int color){
		display.setBackgroundColor(color);
	}
}
