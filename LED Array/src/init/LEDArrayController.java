package init;

import java.util.Timer;
import java.util.TimerTask;

import array7.Array7;
import array7.Array7x7;
import characters.Characters;

public class LEDArrayController extends TimerTask{
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
		
		this.createCharacters();
	}
	
	public void createCharacters(){
		Timer t = new Timer();
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
		
		t.scheduleAtFixedRate(this, 1000, 1000/this.printingFrequency);
	}
	
	@Override
	public void run() {
		this.programRunning = true;
		this.runningCounter--;
		
		this.shiftCharacters();
		this.copyCurrentCharsToRepresentation();
		
		view.writeToDisplay(this.representation);
		
		if(this.runningCounter <= 0){
			this.cancel();
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



















