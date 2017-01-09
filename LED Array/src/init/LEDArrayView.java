package init;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import array7.Array7;
import array7.Array7x7;
import arrays.ArraySupporter2D;
import arrays.ArraySupporter3D;

import java.util.Timer;
import java.util.TimerTask;

import javadisplay.ColorDisplay;

/**
 *	This is where the final product will be built, combining all the code
 *	into the exclusive product! 
 *	
 *	@author Carl Weiwert, Oliver Josefsson, Lucas Borg, Björn Sjölund, Sebastian Andersson, Hampus Holst, Philip Ekholm
 *	@version 1.0
 */

/*
 *	To Add:
 *	Being able to change background color of the display
 *	Being able to change color grid
 *	Flow text up/down/right
 *	Text on different Rows?
 *	Add transparency slider
 *	Show images in colordisplay
 */

public class LEDArrayView extends JPanel{
	private static final long serialVersionUID = 1L;
	private ColorDisplay display;
	
	/**
	 *	Start the display window 
	 */
	
	public LEDArrayView(){
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















