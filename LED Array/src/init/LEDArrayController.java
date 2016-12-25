package init;

import java.util.Timer;
import java.util.TimerTask;

import array7.Array7x7;
import characters.Characters;

public class LEDArrayController {
	private LEDArrayView view;
	private String stringToPrint;
	private int characterColor,
				printingFrequency;
	private WritingDirection direction;
	private boolean programRunning;
	private int displayLength;
	private int[][][] representation;
	private Array7x7[] characters;
	
	public LEDArrayController(LEDArrayView view){
		this.view = view;
		this.stringToPrint = "";
		this.characterColor = android.Color.BLACK;
		this.programRunning = false;
		this.printingFrequency = 1;
		this.direction = WritingDirection.LEFT;
		this.displayLength = 5;
		this.representation = new int[this.displayLength][7][7];
		
		this.stringToPrint = "Hello World!";
		
		this.createCharacters();
	}
	
	private void createCharacters(){
		this.characters = new Array7x7[this.stringToPrint.length() + 5];
		
		if(this.direction == WritingDirection.LEFT){
			for(int i = 0; i < characters.length; i++){
				if(i < 5){
					characters[i] = Characters.getChar(' ');
				}
				else if(i >= 5){
					characters[i] = Characters.getChar(this.stringToPrint.charAt(i - 5));
				}
			}
		}
		
		for(int i = 0; i < representation.length; i++){
			this.representation[i] = characters[i].getRepresentation();
		}
		
		this.applyColorToRepresentation();
		
		view.writeToDisplay(this.representation);
		this.runTimer();
	}
	
	private void runTimer(){
		Timer t = new Timer();
		t.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				
			}
		}, 1000, 1000/this.printingFrequency);
	}
	
	public void shiftCharacters(){
		if(this.direction == WritingDirection.LEFT){
			
		}
	}
	
	private void applyColorToRepresentation(){
		for(int i = 0; i < this.representation.length; i++){
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



















