package controllers;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import characters.Array7;
import characters.Array7x7;
import characters.Characters;
import views.PXDisplayView;
import views.PXInputView;

public class PXDisplayController {
	private PXDisplayView dView;
	private PXInputView iView;
	private String stringToPrint = "";
	private int characterColor,
				printingFrequency;
	private boolean programRunning;
	private int runningCounter;
	private int displayLength;
	private int[][][] representation;
	private Array7x7[] characters;
	public static Timer t = new Timer();
	
	/**
	 * Construct a controller which can make changes in a window
	 */
	
	public PXDisplayController(){
		this.dView = new PXDisplayView();
		this.iView = new PXInputView(this);
		this.characterColor = android.Color.BLACK;
		this.programRunning = false;
		this.printingFrequency = 5; //Max 50Hz
		this.displayLength = 5;
		this.representation = new int[this.displayLength][7][7];
		
		this.setupDisplayFrame();
		this.setupInputFrame();
	}
	
	private void setupDisplayFrame(){
		JFrame frame = new JFrame("Display");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//To avoid closing the whole program
		frame.setLocation(300, 70);
		frame.setResizable(true);
		
		frame.add(dView);
		frame.pack();
		frame.setVisible(true);
	}
	
	private void setupInputFrame(){
		JFrame frame = new JFrame("Inputs");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setLocation(40, 70);
		frame.setResizable(true);
		
		frame.add(iView);
		frame.pack();
		frame.setVisible(true);
	}
	
	/**
	 * Shifts the characters the desired direction
	 */
	private void shiftCharacters(){
		Array7 tempPart = new Array7();
		
		for(int i = this.characters.length - 1; i >= 0; i--){
			tempPart = this.characters[i].shiftLeft(tempPart);
		}
	}
	
	/**
	 *	Copy the chars to the display 
	 */
	
	private void copyCurrentCharsToRepresentation(){
		
		for(int i = 0; i < this.representation.length; i++){
			this.representation[i] = characters[i].getRepresentation();
			
			//Apply color to the representation
			for(int j = 0; j < this.representation[i].length; j++){
				for(int k = 0; k < this.representation[i][j].length; k++){
					if(this.representation[i][j][k] == 1){
						this.representation[i][j][k] = this.characterColor;
					}
				}
			}
		}
	}
	
	/**
	 * Creates and moves characters in the window.
	 */
	public void createCharacters(){
		
		this.characters = new Array7x7[this.stringToPrint.length() + 5];
		this.runningCounter = this.characters.length * 7;
		
	
		for(int i = 0; i < characters.length; i++){
			if(i < 5){
				characters[i] = Characters.getChar(' ');
			}
			else if(i >= 5){
				characters[i] = Characters.getChar(this.stringToPrint.charAt(i - 5));
			}
		}
		
		if(!this.programRunning){
			t.scheduleAtFixedRate(new TimerTask(){
				public void run(){
					PXDisplayController ref = PXDisplayController.this; //Instance to the outer class, the key to solving the reference problem!
					
					ref.runningCounter--;
					
					ref.shiftCharacters();
					ref.copyCurrentCharsToRepresentation();
						
					ref.dView.writeToDisplay(ref.representation);
					
					if(ref.runningCounter <= 0 || !ref.programRunning){
						ref.programRunning = false;
						ref.clearDisplay();
						this.cancel();
					}
				}
			}, 1000, 1000/printingFrequency);
			this.programRunning = true;
		}
	}
	
	/**
	 * Clears the display
	 */
	public void clearDisplay(){
		this.dView.clearDisplay();
	}
	
	/**
	 * @return The frequency which the characters moves
	 */
	public int getPrintingFrequency() {
		return printingFrequency;
	}
	
	/**
	 * Sets the length of the display
	 * @param displayLength the length in display units to be passed
	 */
	public void setDisplayLength(int displayLength) {
		this.displayLength = displayLength;
	}
	
	/**
	 * Sets which String shall be printed
	 * @param stringToPrint the string to be printed
	 */
	public void setStringToPrint(String stringToPrint) {
		this.stringToPrint = stringToPrint;
	}
	
	/**
	 * Sets the color of the characters
	 * @param option the combobox option passed as an object (will be typecasted)
	 * @param opacity opacity to be passed from slider 
	 */
	public void setCharacterColor(Object option, int opacity){
		switch((String)option){
			case "Svart":
				this.characterColor = android.Color.argb(opacity, Color.BLACK.getRed(), Color.BLACK.getGreen(), Color.BLACK.getBlue());
				break;
			case "Grå":
				this.characterColor = android.Color.argb(opacity, Color.GRAY.getRed(), Color.GRAY.getGreen(), Color.GRAY.getBlue());
				break;
			case "Vit":
				this.characterColor = android.Color.argb(opacity, Color.WHITE.getRed(), Color.WHITE.getGreen(), Color.WHITE.getBlue());
				break;
			case "Röd":
				this.characterColor = android.Color.argb(opacity, Color.RED.getRed(), Color.RED.getGreen(), Color.RED.getBlue());
				break;
			case "Grön":
				this.characterColor = android.Color.argb(opacity, Color.GREEN.getRed(), Color.GREEN.getGreen(), Color.GREEN.getBlue());
				break;
			case "Blå":
				this.characterColor = android.Color.argb(opacity, Color.BLUE.getRed(), Color.BLUE.getGreen(), Color.BLUE.getBlue());
				break;
			case "Gul":
				this.characterColor = android.Color.argb(opacity, Color.YELLOW.getRed(), Color.YELLOW.getGreen(), Color.YELLOW.getBlue());
				break;
			case "Cyan":
				this.characterColor = android.Color.argb(opacity, Color.CYAN.getRed(), Color.CYAN.getGreen(), Color.CYAN.getBlue());
				break;
			default:
				this.characterColor = android.Color.argb(opacity, Color.BLACK.getRed(), Color.BLACK.getGreen(), Color.BLACK.getBlue());
		}
	}
	
	/**
	 * Sets the speed which the characters moves
	 * @param printingFrequency which the characters will move by (inverse of period time)
	 */
	public void setPrintingFrequency(int printingFrequency) {
		this.printingFrequency = printingFrequency;
	}
	
	/**
	 * Starts/stops the program
	 * @param programRunning global boolean regulated in system
	 */
	public void setProgramRunning(boolean programRunning) {
		this.programRunning = programRunning;
	}

}
