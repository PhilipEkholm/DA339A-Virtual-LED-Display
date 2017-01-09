package testsuites;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import array7.Array7;
import array7.Array7x7;
import characters.Characters;

/**
 * Test environment for Array7 and Array7x7. 
 * @author Lucas Borg
 * @version 1.05
 */

public class TestEnvironmentArrays extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel[][] mainGrid = new JLabel[7][7];
	private JTextField[] tfColumn = new JTextField[7];
	private JTextField[] tfRow = new JTextField[7];
	private JTextField inputRowNbr = new JTextField("Input Row Number");
	private JTextField inputColumnNbr = new JTextField("Input Column Number");
	private JButton readRow = new JButton("Read Row");
	private JButton writeRow = new JButton("Write Row");
	private JButton readColumn = new JButton("Read Column");
	private JButton writeColumn = new JButton("Write Column");
	
	private JPanel panelLeft = new JPanel( new GridLayout(8,1) );
	private JPanel panelCenter = new JPanel( new BorderLayout() );
	private JPanel panelRight = new JPanel( new GridLayout(6,1) );
	
	private Font mono = new Font("MONOSPACED", Font.BOLD, 24);
	
	private int labelX=30, labelY=30, buttonX=50, buttonY=30;
	
	private static Array7x7 array7x7;
	private Array7 array7;
	
	/**
	 * Constructs test environment
	 * @param character to be passed from Characters.getChar()
	 */
	public TestEnvironmentArrays(Array7x7 character) {
		TestEnvironmentArrays.array7x7 = character;
		
		fillMainGrid(); //Fill labels with numbers from Array7x7
		addMainGrid(); //Add a grid of labels to panelCenter
		rightField(); //Adds content to panelRight		
		textFieldsSouth(); //Adds textFields to panelCenter at BorderLayout.South
		textFieldsWest(); //Adds textFields to panelCenter at BorderLayout.West
		
		setLayout( new GridLayout(1,3) );
		
		add(panelLeft); //First from left in the frame
		add(panelCenter);//Middle of the frame
		add(panelRight);//Right side of the frame
		
		addActionListeners();//Adds ActionListeners
	}
	
	/**
	 * Text to labels in grid
	 */
	private void fillMainGrid() {
		for(int i=0; i<mainGrid.length; i++) {
			for(int j=0; j<mainGrid[i].length; j++) {
				mainGrid[i][j] = new JLabel();
				mainGrid[i][j].setFont(mono);
				mainGrid[i][j].setText(array7x7.getElement(i, j) + "");
//				System.out.print(mainGrid[i][j].getText() + "  "); //For testing of correct loading of numbers 
			}
//			System.out.println();//For testing
		}
	}
	
	/**
	 * Creates a grid of labels and adds them to panelCenter at BorderLayout.CENTER
	 */
	private void addMainGrid() {
		JPanel gridRows = new JPanel( new GridLayout(1,7));
		JPanel row;
		for(int i=0; i<mainGrid.length; i++) {
			row = new JPanel( new GridLayout(7,1));
			for(int j=0; j<mainGrid[i].length; j++) {
				mainGrid[j][i].setForeground(Color.BLACK);
				mainGrid[j][i].setSize(new Dimension(labelX,labelY));
				row.add(mainGrid[j][i]);
			}
			gridRows.add(row);
		}
		panelCenter.add(gridRows, BorderLayout.CENTER);
	}
	
	/**
	 * Creates a panel with GridLayout. Fills this panel with TextFields. Adds the panel to panelCenter at BorderLayout.South.
	 */
	private void textFieldsSouth() {
		JPanel south = new JPanel( new GridLayout(1,7) );
		JTextField tf;
		south.setPreferredSize( new Dimension(labelX*tfColumn.length, labelY));
		for(int i=0; i<tfRow.length; i++) {
			tf = new JTextField();
			tfRow[i] = tf;
			tfRow[i].setSize( new Dimension(labelX, labelY));
			tfRow[i].setFont(mono);
			tfRow[i].setBackground(Color.ORANGE);
			tfRow[i].setForeground(Color.WHITE);
			south.add(tfRow[i]);
		}
		panelCenter.add(south, BorderLayout.SOUTH);
	}
	
	/**
	 * Creates a panel with GridLayout. Fills this panel with TextFields. Adds the panel to panelCenter at BorderLayout.West.
	 */
	private void textFieldsWest() {
		JTextField tf;
		panelLeft.setPreferredSize( new Dimension(labelX, labelY*tfColumn.length));
		for(int i=0; i<tfColumn.length; i++) {
			tf = new JTextField();
			tfColumn[i] = tf;
			tfColumn[i].setSize( new Dimension(labelX, labelY));
			tfColumn[i].setFont(mono);
			tfColumn[i].setBackground(Color.ORANGE);
			tfColumn[i].setForeground(Color.WHITE);
			panelLeft.add(tfColumn[i]);
		}
	}
	
	/**
	 * Sets size, background and font to JButtons and JTextFields and adds them to panelRight.
	 */
	private void rightField() {
		
		readRow.setSize( new Dimension(buttonX, buttonY));
		readRow.setBackground(Color.GREEN);
		readRow.setFont(mono);
		writeRow.setSize( new Dimension(buttonX, buttonY));
		writeRow.setBackground(Color.GREEN);
		writeRow.setFont(mono);
		readColumn.setSize( new Dimension(buttonX, buttonY));
		readColumn.setBackground(Color.GREEN);	
		readColumn.setFont(mono);
		writeColumn.setSize( new Dimension(buttonX, buttonY));
		writeColumn.setBackground(Color.GREEN);
		writeColumn.setFont(mono);
		
		inputRowNbr.setSize( new Dimension(buttonX, buttonY));
		inputRowNbr.setBackground(Color.GREEN);
		inputRowNbr.setFont(mono);
		inputColumnNbr.setSize( new Dimension(buttonX, buttonY));
		inputColumnNbr.setBackground(Color.GREEN);
		inputColumnNbr.setFont(mono);
		
		panelRight.add(readRow);
		panelRight.add(writeRow);
		panelRight.add(inputRowNbr);
		panelRight.add(readColumn);
		panelRight.add(writeColumn);
		panelRight.add(inputColumnNbr);
		
	}
	
	/**
	 * Adds ActionListeners to JButtons.
	 */
	private void addActionListeners() {
		readRow.addActionListener(this);
		writeRow.addActionListener(this);
		readColumn.addActionListener(this);
		writeColumn.addActionListener(this);
	}

	/**
	 * Performs actions based on the button pressed
	 * @param e event passed from buttons
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==readRow) {
			readRow();
		}
		
		else if(e.getSource()==writeRow) {
			writeRow();
		}
		
		else if(e.getSource()==readColumn) {
			readColumn();
		}
		
		else if(e.getSource()==writeColumn) {
			writeColumn();
		}
	}
	
	/**
	 * Selected row is transfered to the row's JTextFields.
	 * 
	 * 	Philip: Catching NumberFormatException since it's easy
	 * 	to forget to input a number
	 */
	private void readRow(){
		int rowNbr = 0;
		
		try{
			rowNbr = Integer.parseInt(inputRowNbr.getText());
		}
		catch(NumberFormatException e){
			System.out.println(e.toString());
		}
		
		array7 = array7x7.getRow(rowNbr);
		for(int i=0; i<mainGrid[rowNbr].length; i++) {
			tfRow[i].setText(array7.getElement(i) + "");
		}
//		for(int i=0; i<mainGrid[rowNbr].length; i++) {
//			tfRow[i].setText(mainGrid[rowNbr][i].getText());
//		}
//		for(int i=0; i<mainGrid[rowNbr].length; i++) {
//			tfRow[i].setText(array7x7.getElement(rowNbr, i) +"");
//		}	
	}
	
	/**
	 * The numbers in the row's JTextFields are inputed in the selected row.
	 */
	private void writeRow() {
		int rowNbr = 0;
		
		try{
			rowNbr = Integer.parseInt(inputRowNbr.getText());
		}
		catch(NumberFormatException e){
			System.out.println(e.toString());
		}
//		for(int i=0; i<mainGrid[rowNbr].length; i++) {
//			mainGrid[rowNbr][i].setText(tfRow[i].getText());
//		}
		for(int i=0; i<mainGrid[rowNbr].length; i++) {
			array7x7.setElement(rowNbr, i, Integer.parseInt(tfRow[i].getText()));
			mainGrid[rowNbr][i].setText(array7x7.getElement(rowNbr, i) + "");
		}
	}
	
	/**
	 * Selected column is transfered to the column's JTextFields.
	 */
	private void readColumn() {
		int colNbr = 0;
		
		try{
			colNbr = Integer.parseInt(inputColumnNbr.getText());
		}
		catch(NumberFormatException e){
			System.out.println(e.toString());
		}
		array7 = array7x7.getCol(colNbr);
//		for(int i=0; i<mainGrid[colNbr].length; i++) {
//			tfColumn[i].setText(mainGrid[i][colNbr].getText());
//		}	
//		for(int i=0; i<mainGrid[colNbr].length; i++) {
//			tfColumn[i].setText(array7x7.getElement(i, colNbr) +"");
//		}
		for(int i=0; i<mainGrid[colNbr].length; i++) {
			tfColumn[i].setText(array7.getElement(i) +"");
		}
	}
	
	/**
	 * The numbers in the column's JTextFields are inputed in the selected column.
	 */
	private void writeColumn() {
		int colNbr = 0;
		
		try{
			colNbr = Integer.parseInt(inputColumnNbr.getText());
		}
		catch(NumberFormatException e){
			System.out.println(e.toString());
		}
//		for(int i=0; i<mainGrid[colNbr].length; i++) {
//			mainGrid[i][colNbr].setText(tfColumn[i].getText());
//		}
		for(int i=0; i<mainGrid[colNbr].length; i++) {
			array7x7.setElement(i, colNbr, Integer.parseInt(tfColumn[i].getText()));
			mainGrid[i][colNbr].setText(array7x7.getElement(i, colNbr) + "");
		}
		
	}
}
