package testsuites;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import array7.Array7;
import array7.Array7x7;
import arrays.ArraySupporter2D;
import characters.Characters;
import javadisplay.ColorDisplay;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *	A test program for parsing a string and printing them out based on
 *	the input.
 *
 *	@author Philip Ekholm
 */

public class StringToColorDisplayParser extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JPanel 	westPanel = new JPanel(null),
					centerPanel = new JPanel(new FlowLayout());
	private JLabel 	lblText = new JLabel("Text: "),
					lblColor = new JLabel("Färg: "),
					lblFrequency = new JLabel("Frekvens: 1Hz");
	private JButton 	btnStart = new JButton("Starta"),
						btnAbort = new JButton("Avbryt");
	private JTextField 	fieldInput = new JTextField();
	private JSlider sliderFreq = new JSlider(1, 20);
	private JComboBox comboBoxColor = new JComboBox(new String[] {
		"Svart",
		"Grå",
		"Vit",
		"Röd",
		"Grön",
		"Blå",
		"Gul",
		"Cyan"
	});
	public ColorDisplay display = new ColorDisplay(1, 1, android.Color.WHITE, android.Color.BLACK, 1, 10);
	public char[] inputCharacters;
	private Array7x7 currentChar;
	private int[][] representation;
	public int selectedColor;
	private Timer timer = new Timer();
	private static boolean globalTimerFlag = false;
	
	public StringToColorDisplayParser(){
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(430, 350));
		
		westPanel.setBackground(Color.WHITE);
		centerPanel.setBackground(Color.WHITE);
		comboBoxColor.setSelectedIndex(0);
		
		this.setPositions();
		this.addListeners();
		this.addComponents();
		
		this.changeSelectedColor();
	}
	
	/**
	 *	Set the dimensions for all components 
	 */
	
	private void setPositions(){
		westPanel.setPreferredSize(new Dimension(225, 800));
		
		lblText.setBounds(15, 10, 50, 50);
		fieldInput.setBounds(50, 25, 150, 25);
		lblColor.setBounds(15, 50, 50, 50);
		comboBoxColor.setBounds(50, 50, 100, 50);
		lblFrequency.setBounds(15, 85, 100, 50);
		btnStart.setBounds(10, 250, 60, 25);
		btnAbort.setBounds(70, 250, 75, 25);
		
		display.setPreferredSize(new Dimension(200, 200));
	}
	
	private void addListeners(){
		btnStart.addActionListener(this);
		btnAbort.addActionListener(this);
		comboBoxColor.addActionListener(this);
	}
	
	private void addComponents(){
		westPanel.add(lblText);
		westPanel.add(fieldInput);
		westPanel.add(comboBoxColor);
		westPanel.add(lblColor);
		westPanel.add(lblFrequency);
		westPanel.add(sliderFreq);
		westPanel.add(btnStart);
		westPanel.add(btnAbort);
		
		centerPanel.add(display);
		
		this.add(westPanel, BorderLayout.WEST);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
	public int[][] getRepresentation() {
		return representation;
	}

	public void setRepresentation(int[][] representation) {
		this.representation = representation;
	}

	public int getSelectedColor() {
		return this.selectedColor;
	}

	public void setSelectedColor(int selectedColor) {
		this.selectedColor = selectedColor;
	}

	public Array7x7 getCurrentChar() {
		return currentChar;
	}

	public void setCurrentChar(Array7x7 currentChar) {
		this.currentChar = currentChar;
	}

	public ColorDisplay getDisplay() {
		return display;
	}

	public void setDisplay(ColorDisplay display) {
		this.display = display;
	}

	public char[] getInputCharacters() {
		return inputCharacters;
	}

	public void setInputCharacters(char[] inputCharacters) {
		this.inputCharacters = inputCharacters;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnStart){
			String input = fieldInput.getText();
			
			if(input != ""){
				this.inputCharacters = new char[input.length()];
				
				for(int i = 0; i < inputCharacters.length; i++){
					this.inputCharacters[i] = input.charAt(i);
				}
				
				globalTimerFlag = true;
				this.showCharacters();
			}
		}
		else if(e.getSource() == comboBoxColor){
			this.changeSelectedColor();
		}
		else if(e.getSource() == btnAbort){
			globalTimerFlag = false;
			display.clearDisplay();
		}
	}
	
	private void changeSelectedColor(){
		//Typecasting since it returns an object rather than the string
		switch((String)comboBoxColor.getSelectedItem()){
			case "Svart":
				this.selectedColor = android.Color.BLACK;
				break;
			case "Grå":
				this.selectedColor = android.Color.GRAY;
				break;
			case "Vit":
				this.selectedColor = android.Color.WHITE;
				break;
			case "Röd":
				this.selectedColor = android.Color.RED;
				break;
			case "Grön":
				this.selectedColor = android.Color.GREEN;
				break;
			case "Blå":
				this.selectedColor = android.Color.BLUE;
				break;
			case "Gul":
				this.selectedColor = android.Color.YELLOW;
				break;
			case "Cyan":
				this.selectedColor = android.Color.CYAN;
				break;
			default:
				this.selectedColor = android.Color.BLACK;
		}
		
	}
	
	private void showCharacters(){
		
		this.timer.scheduleAtFixedRate(new TimerTask(){
			
			private int counter = 0;
			
			@Override
			public void run() {
				StringToColorDisplayParser suite = new StringToColorDisplayParser();
				
				suite.setCurrentChar(Characters.getChar(inputCharacters[counter]));
				suite.setRepresentation(suite.getCurrentChar().getRepresentation());
				int[][] localRepresentation = suite.getRepresentation();
				
				//Apply the selected Color
				for(int i = 0; i < localRepresentation.length; i++){
					for(int j = 0; j < localRepresentation[i].length; j++){
						//Kolla så det inte är en tom ruta
						if(localRepresentation[i][j] == 1){
							localRepresentation[i][j] = selectedColor;
						}
					}
				}
				
				display.setDisplay(suite.getRepresentation());
				display.updateDisplay();
				
				counter++;
				if(counter == inputCharacters.length || !globalTimerFlag){
					globalTimerFlag = false;
					this.cancel();
					display.clearDisplay();
				}
			}
			
		}, 250, 1000);
	}
}
















