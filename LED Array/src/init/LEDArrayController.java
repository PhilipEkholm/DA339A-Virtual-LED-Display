package init;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

import array7.Array7;
import array7.Array7x7;
import characters.Characters;

/**
 *	This is where the final product will be built, combining all the code
 *	into the exclusive product! 
 *	
 *	@author Carl Weiwert, Oliver Josefsson, Lucas Borg, Björn Sjölund, Sebastian Andersson, Hampus Holst, Philip Ekholm
 *	@version 1.05
 */

public class LEDArrayController{
	private LEDArrayView view;
	private String stringToPrint;
	private int characterColor,
				printingFrequency;
	private WritingDirection direction;
	private boolean programRunning;
	private int runningCounter;
	private int displayLength;
	private int[][][] representation;
	private Array7x7[] characters;
	public static Timer t = new Timer();
	
	/**
	 * Construct a controller which can make changes in a window
	 * @param The controlled part
	 */
	public LEDArrayController(LEDArrayView view){
		
		this.view = view;
		this.stringToPrint = "";
		this.characterColor = android.Color.BLACK;
		this.programRunning = false;
		this.printingFrequency = 5; //Max 50Hz
		this.direction = WritingDirection.LEFT;
		this.displayLength = 5;
		this.representation = new int[this.displayLength][7][7];
		
		this.stringToPrint = "";
	}
	
	/**
	 * Creates and moves characters in the window.
	 */
	public void createCharacters(){
		
		this.characters = new Array7x7[this.stringToPrint.length() + 5];
		this.runningCounter = this.characters.length * 7;
		
	
//		if(this.direction == WritingDirection.LEFT){
			for(int i = 0; i < characters.length; i++){
				if(i < 5){
					characters[i] = Characters.getChar(' ');
				}
				else if(i >= 5){
					characters[i] = Characters.getChar(this.stringToPrint.charAt(i - 5));
				}
			}
//		}
		
		if(!this.programRunning){
			t.scheduleAtFixedRate(new TimerTask(){
				public void run(){
					LEDArrayController ref = LEDArrayController.this; //Instance to the outer class, the key to solving the reference problem!
					
					ref.runningCounter--;
					
					ref.shiftCharacters();
					ref.copyCurrentCharsToRepresentation();
						
					ref.view.writeToDisplay(ref.representation);
					
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
	 * Shifts the characters the desired direction
	 */
	private void shiftCharacters(){
		Array7 tempPart = new Array7();
		
		if(this.direction == WritingDirection.LEFT){
			for(int i = this.characters.length - 1; i >= 0; i--){
				
				tempPart = this.characters[i].shiftLeft(tempPart);
			}
		}
	}
	
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
	 * Clears the display
	 */
	public void clearDisplay(){
		this.view.clearDisplay();
	}

	/**
	 * 
	 * @return The frequency which the characters moves
	 */
	public int getPrintingFrequency() {
		return printingFrequency;
	}

	/**
	 * Sets the length of the display
	 * @param The length of the display
	 */
	public void setDisplayLength(int displayLength) {
		this.displayLength = displayLength;
	}

	/**
	 * Sets which String shall be printed
	 * @param The String wich shall be printed
	 */
	public void setStringToPrint(String stringToPrint) {
		this.stringToPrint = stringToPrint;
	}

	/**
	 * Sets the color of the characters
	 * @param The color
	 * @param The transparency
	 */
	public void setCharacterColor(Object option, int transparency){
		switch((String)option){
			case "Svart":
				this.characterColor = android.Color.argb(transparency, Color.BLACK.getRed(), Color.BLACK.getGreen(), Color.BLACK.getBlue());
				break;
			case "Grå":
				this.characterColor = android.Color.argb(transparency, Color.GRAY.getRed(), Color.GRAY.getGreen(), Color.GRAY.getBlue());
				break;
			case "Vit":
				this.characterColor = android.Color.argb(transparency, Color.WHITE.getRed(), Color.WHITE.getGreen(), Color.WHITE.getBlue());
				break;
			case "Röd":
				this.characterColor = android.Color.argb(transparency, Color.RED.getRed(), Color.RED.getGreen(), Color.RED.getBlue());
				break;
			case "Grön":
				this.characterColor = android.Color.argb(transparency, Color.GREEN.getRed(), Color.GREEN.getGreen(), Color.GREEN.getBlue());
				break;
			case "Blå":
				this.characterColor = android.Color.argb(transparency, Color.BLUE.getRed(), Color.BLUE.getGreen(), Color.BLUE.getBlue());
				break;
			case "Gul":
				this.characterColor = android.Color.argb(transparency, Color.YELLOW.getRed(), Color.YELLOW.getGreen(), Color.YELLOW.getBlue());
				break;
			case "Cyan":
				this.characterColor = android.Color.argb(transparency, Color.CYAN.getRed(), Color.CYAN.getGreen(), Color.CYAN.getBlue());
				break;
			default:
				this.characterColor = android.Color.argb(transparency, Color.BLACK.getRed(), Color.BLACK.getGreen(), Color.BLACK.getBlue());
		}
	}

	/**
	 * Sets the speed which the characters moves
	 * @param The frequency which the characters moves
	 */
	public void setPrintingFrequency(int printingFrequency) {
		this.printingFrequency = printingFrequency;
	}

	/**
	 * Sets the writing direction
	 * @param Direction the characters moves
	 */
	public void setDirection(WritingDirection direction) {
		this.direction = direction;
	}

	/**
	 * Starts/stops the program
	 * @param true/false
	 */
	public void setProgramRunning(boolean programRunning) {
		this.programRunning = programRunning;
	}
	
}
