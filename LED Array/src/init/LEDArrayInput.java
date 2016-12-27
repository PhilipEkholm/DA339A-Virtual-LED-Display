package init;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LEDArrayInput extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private LEDArrayController controller;
	private JPanel 	nullPanel = new JPanel(null);
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
	
	public LEDArrayInput(LEDArrayController controller){
		this.controller = controller;
		this.setLayout(new BorderLayout());
		
		nullPanel.setBackground(Color.WHITE);
		comboBoxColor.setSelectedIndex(0);
		
		this.setPositions();
		this.addListeners();
		this.addComponents();
	}
	
	/**
	 *	Set the dimensions for all components 
	 */
	
	private void setPositions(){
		nullPanel.setPreferredSize(new Dimension(225, 600));
		
		lblText.setBounds(15, 10, 50, 50);
		fieldInput.setBounds(50, 25, 150, 25);
		lblColor.setBounds(15, 50, 50, 50);
		comboBoxColor.setBounds(50, 50, 100, 50);
		lblFrequency.setBounds(15, 85, 100, 50);
		btnStart.setBounds(10, 250, 60, 25);
		btnAbort.setBounds(70, 250, 75, 25);
	}
	
	private void addListeners(){
		btnStart.addActionListener(this);
		btnAbort.addActionListener(this);
		comboBoxColor.addActionListener(this);
	}
	
	private void addComponents(){
		nullPanel.add(lblText);
		nullPanel.add(fieldInput);
		nullPanel.add(comboBoxColor);
		nullPanel.add(lblColor);
		nullPanel.add(lblFrequency);
		nullPanel.add(sliderFreq);
		nullPanel.add(btnStart);
		nullPanel.add(btnAbort);
		
		this.add(nullPanel, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
