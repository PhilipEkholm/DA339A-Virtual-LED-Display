package init;

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
 *	@version 1.0
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
	
	public LEDArrayController(LEDArrayView view){
		
		this.view = view;
		this.stringToPrint = "";
		this.characterColor = android.Color.BLACK;
		this.programRunning = false;
		this.printingFrequency = 5; //Max 50Hz
		this.direction = WritingDirection.RIGHT;
		this.displayLength = 5;
		this.representation = new int[this.displayLength][7][7];
		
		this.stringToPrint = "";
	}
	
	public void createCharacters(){
		
		this.characters = new Array7x7[this.stringToPrint.length() + 5];
		this.runningCounter = this.characters.length * 7;
		
		if(this.direction == WritingDirection.RIGHT){
			for(int i = 0; i < characters.length; i++){
				if(i < 5){
					characters[i] = Characters.getChar(' ');
				}
				else if(i >= 5){
					characters[i] = Characters.getChar(this.stringToPrint.charAt(i - 5));
				}
			}
		}
		
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
	
	private void shiftCharacters(){
		Array7 tempPart = new Array7();
		
		if(this.direction == WritingDirection.RIGHT){
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
	
	public void clearDisplay(){
		this.view.clearDisplay();
	}

	public int getPrintingFrequency() {
		return printingFrequency;
	}

	public void setDisplayLength(int displayLength) {
		this.displayLength = displayLength;
	}

	public void setStringToPrint(String stringToPrint) {
		this.stringToPrint = stringToPrint;
	}

	public void setCharacterColor(Object option){
		switch((String)option){
			case "Svart":
				this.characterColor = android.Color.BLACK;
				break;
			case "Grå":
				this.characterColor = android.Color.GRAY;
				break;
			case "Vit":
				this.characterColor = android.Color.WHITE;
				break;
			case "Röd":
				this.characterColor = android.Color.RED;
				break;
			case "Grön":
				this.characterColor = android.Color.GREEN;
				break;
			case "Blå":
				this.characterColor = android.Color.BLUE;
				break;
			case "Gul":
				this.characterColor = android.Color.YELLOW;
				break;
			case "Cyan":
				this.characterColor = android.Color.CYAN;
				break;
			default:
				this.characterColor = android.Color.BLACK;
		}
	}

	public void setPrintingFrequency(int printingFrequency) {
		this.printingFrequency = printingFrequency;
	}

	public void setDirection(WritingDirection direction) {
		this.direction = direction;
	}

	public void setProgramRunning(boolean programRunning) {
		this.programRunning = programRunning;
	}
	
	
}



















