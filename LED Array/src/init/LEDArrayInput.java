package init;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *	This is where the final product will be built, combining all the code
 *	into the exclusive product! 
 *	
 *	@author Carl Weiwert, Oliver Josefsson, Lucas Borg, Björn Sjölund, Sebastian Andersson, Hampus Holst, Philip Ekholm
 *	@version 1.05
 */

public class LEDArrayInput extends JPanel implements ActionListener, ChangeListener{
	private static final long serialVersionUID = 1L;
	private LEDArrayController controller;
	private JPanel 	nullPanel = new JPanel(null),
					headerPanel = new JPanel(new FlowLayout()),
					infoPanel = new JPanel(new FlowLayout());
	private JLabel 	lblText = new JLabel("Text: "),
					lblHeader = new JLabel("LED-Array"),
					lblInfo = new JLabel(""),
					lblColor = new JLabel("Färg: "),
					lblFrequency = new JLabel("Frekvens: 1Hz"),
					lblWritingDirection = new JLabel("Skrivningsriktning"),
					lblTransparency = new JLabel("Ogenomskinlighet:");
	private JButton btnStart = new JButton("Starta"),
			btnAbort = new JButton("Avbryt"),
			btnDirectionRight = new JButton("Höger"),
			btnDirectionLeft = new JButton("Vänster"),
			btnDirectionUp = new JButton("Uppåt"),
			btnDirectionDown = new JButton("Neråt"),
			btnKaleidoskopOn = new JButton("ON"),
			btnKaleidoskopOff = new JButton("OFF");
	private JTextField 	fieldInput = new JTextField();
	private JSlider sliderFreq = new JSlider(1, 50),
			sliderOpacity = new JSlider(0, 255);
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
	
	/**
	 * Constructs the content of the window.
	 * @param controller linked to the view
	 */
	public LEDArrayInput(LEDArrayController controller){
		this.controller = controller;
		this.setLayout(new BorderLayout());
		
		nullPanel.setBackground(Color.WHITE);
		headerPanel.setBackground(Color.WHITE);
		comboBoxColor.setSelectedIndex(0);
		sliderFreq.setBackground(Color.WHITE);
		sliderFreq.setPaintTicks(true);
		sliderFreq.setValue(controller.getPrintingFrequency());
		sliderOpacity.setBackground(Color.WHITE);
		sliderOpacity.setPaintTicks(true);
		sliderOpacity.setValue(255);
		Font 	headerFont = new Font("Arial",  Font.PLAIN, 25),
				smallerFont = new Font("Arial", Font.PLAIN, 10);
		lblInfo.setFont(smallerFont);
		lblHeader.setFont(headerFont);
		
		lblInfo.setText(String.format("<html><div style=\"width:%dpx;\">%s</div><html>", 150, "LED-Array skapad av Carl Weiwert, Oliver Josefsson, Lucas Borg, Björn Sjölund, Sebastian Andersson, Hampus Holst, Philip Ekholm, Version 1.0. Copyright 2016-3000"));
		
		this.setPositions();
		this.addListeners();
		this.addComponents();
	}
	
	/**
	 *	Set the dimensions for all components 
	 */
	private void setPositions(){
		nullPanel.setPreferredSize(new Dimension(225, 400));
		
		lblText.setBounds(15, 10, 50, 50);
		fieldInput.setBounds(50, 25, 150, 25);
		lblColor.setBounds(15, 50, 50, 50);
		comboBoxColor.setBounds(50, 65, 90, 20);
		lblFrequency.setBounds(15, 85, 100, 50);
		btnStart.setBounds(10, 180, 75, 25);
		btnAbort.setBounds(100, 180, 75, 25);
		sliderFreq.setBounds(10, 120, 200, 50);
		lblTransparency.setBounds(15, 200, 150, 50);
		sliderOpacity.setBounds(10, 250, 200, 50);
	}
	
	/**
	 * Adds listeners to components
	 */
	private void addListeners(){
		btnStart.addActionListener(this);
		btnAbort.addActionListener(this);
		comboBoxColor.addActionListener(this);
		sliderFreq.addChangeListener(this);
		btnDirectionLeft.addActionListener(this);
		btnDirectionRight.addActionListener(this);
		btnDirectionUp.addActionListener(this);
		btnDirectionDown.addActionListener(this);
		sliderOpacity.addChangeListener(this);
	}
	
	/**
	 * Adds components to panels and the window
	 */
	private void addComponents(){
		nullPanel.add(lblText);
		nullPanel.add(fieldInput);
		nullPanel.add(comboBoxColor);
		nullPanel.add(lblColor);
		nullPanel.add(lblFrequency);
		nullPanel.add(sliderFreq);
		nullPanel.add(btnStart);
		nullPanel.add(btnAbort);
		nullPanel.add(sliderOpacity);
		nullPanel.add(lblTransparency);
		
		headerPanel.add(lblHeader);
		infoPanel.add(lblInfo);
		this.add(nullPanel, BorderLayout.CENTER);
		this.add(headerPanel, BorderLayout.NORTH);
		this.add(infoPanel, BorderLayout.SOUTH);
	}

	/**
	 * Checks which action is performed. 
	 * @param e event passed with button click
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnStart){
			if(!this.fieldInput.getText().equals("")){
				controller.setStringToPrint(this.fieldInput.getText());
				controller.createCharacters();
			}
			else{
				lblInfo.setText("Var vänlig mata in en sträng");
			}
		}
		else if(e.getSource() == btnAbort){
			controller.setProgramRunning(false);
		}
		else if(e.getSource() == comboBoxColor){
			controller.setCharacterColor(comboBoxColor.getSelectedItem(), this.sliderOpacity.getValue());
		}
		else if(e.getSource() == btnDirectionLeft) {
				controller.setDirection(WritingDirection.LEFT);
		}
		else if(e.getSource() == btnDirectionUp) {
				controller.setDirection(WritingDirection.UP);
		}
		else if(e.getSource() == btnDirectionRight) {
				controller.setDirection(WritingDirection.RIGHT);
		}
		else if(e.getSource() == btnDirectionUp) {
				controller.setDirection(WritingDirection.UP);
		}
		else if(e.getSource() == btnDirectionDown) {
				controller.setDirection(WritingDirection.DOWN);
		}
	}

	/**
	 * Checks the changes on the slider.
	 * @param e action event passed
	 */
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == sliderFreq){
			this.lblFrequency.setText("Frekvens: " + this.sliderFreq.getValue() + "Hz");
			this.controller.setPrintingFrequency(this.sliderFreq.getValue());
		}
		else if(e.getSource() == sliderOpacity) {
			this.controller.setCharacterColor(comboBoxColor.getSelectedItem(), this.sliderOpacity.getValue());
		}
	}
}
