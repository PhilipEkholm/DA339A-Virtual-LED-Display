package init;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

import array7.Array7;
import array7.Array7x7;
import characters.Characters;

/**
 * Test environment for movement of numbers in Array7x7
 * @author Lucas Borg
 * @version 0.7
 */
public class TestEnvironmentMovement extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static Array7x7 array7x7;
	private Array7 array7;
	private JLabel[][] mainGrid = new JLabel[7][7];
	private JTextField[] tfLeftSide = new JTextField[7];
	private JTextField[] tfRightSide = new JTextField[7];
	private JButton btnMoveLeft = new JButton("Move Left");
	private JButton btnMoveRight = new JButton("Move Right");
	private int labelWidht=50, labelHeigth=50, buttonWidht=50, buttonHeigth=30;
	private Font mono = new Font("MONOSPACED", Font.BOLD, 30);
	
	private JPanel panelCenter = new JPanel( new BorderLayout() );
	private JPanel panelLeftSide = new JPanel( new GridLayout(7,1) );
	private JPanel panelRightSide = new JPanel( new GridLayout(7,1) );
	private JPanel pnlMoveBtns = new JPanel( new GridLayout(1,2));

	public TestEnvironmentMovement(Array7x7 character) {
		fillMainGrid(); //Fill labels with numbers from Array7x7
		addMainGrid(); //Add a grid of labels in panelCenter
		textFieldsWest(); //Adds JTextFields in panelLeftSide
		textFieldsEast(); //Adds JTextFields in panelRightSide
		addMoveButtons(); //Adds buttons and ActionListeners for the buttons in pnlMoveBtns 
		
		setLayout( new BorderLayout() );
		
		add(panelCenter, BorderLayout.CENTER);
		add(panelRightSide, BorderLayout.EAST);
		add(panelLeftSide, BorderLayout.WEST);
		add(pnlMoveBtns, BorderLayout.SOUTH);
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
				System.out.print(mainGrid[i][j].getText() + "  "); //For testing of correct loading of numbers 
			}
			System.out.println();//For testing
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
				mainGrid[j][i].setSize(new Dimension(labelWidht,labelHeigth));
				row.add(mainGrid[j][i]);
			}
			gridRows.add(row);
		}
		panelCenter.add(gridRows, BorderLayout.CENTER);
	}
	
	/**
	 * Sets a preferred size to the panel 'panelLeftSide'. Fills this panel with TextFields.
	 */
	private void textFieldsWest() {
		JTextField tf;
		panelLeftSide.setPreferredSize( new Dimension(labelWidht, labelHeigth*tfLeftSide.length));
		for(int i=0; i<tfLeftSide.length; i++) {
			tf = new JTextField();
			tfLeftSide[i] = tf;
			tfLeftSide[i].setSize( new Dimension(labelWidht, labelHeigth));
			tfLeftSide[i].setFont(mono);
			tfLeftSide[i].setBackground(Color.ORANGE);
			tfLeftSide[i].setForeground(Color.WHITE);
			panelLeftSide.add(tfLeftSide[i]);
		}
	}
	
	/**
	 * Sets a preferred size to the panel 'panelRightSide'. Fills this panel with TextFields.
	 */
	private void textFieldsEast() {
		JTextField tf;
		panelRightSide.setPreferredSize( new Dimension(labelWidht, labelHeigth*tfLeftSide.length));
		for(int i=0; i<tfRightSide.length; i++) {
			tf = new JTextField();
			tfRightSide[i] = tf;
			tfRightSide[i].setSize( new Dimension(labelWidht, labelHeigth));
			tfRightSide[i].setFont(mono);
			tfRightSide[i].setBackground(Color.ORANGE);
			tfRightSide[i].setForeground(Color.WHITE);
			panelRightSide.add(tfRightSide[i]);
		}
	}
	
	/**
	 * Sets size, background, foreground, font and ActionListener to JButtons and adds them to pnlMoveBtns.
	 */
	private void addMoveButtons() {
		btnMoveLeft.setSize( new Dimension(buttonWidht, buttonHeigth) );
		btnMoveLeft.setFont(mono);
		btnMoveLeft.setBackground(Color.GREEN);
		btnMoveLeft.setForeground(Color.WHITE);
		btnMoveRight.setSize( new Dimension(buttonWidht, buttonHeigth) );
		btnMoveRight.setFont(mono);
		btnMoveRight.setBackground(Color.GREEN);
		btnMoveRight.setForeground(Color.WHITE);
		
		btnMoveLeft.addActionListener(this);
		btnMoveRight.addActionListener(this);
		
		pnlMoveBtns.add(btnMoveLeft);
		pnlMoveBtns.add(btnMoveRight);
	}
	
	private static void setRepresentation() {
		Random rand = new Random();
		int[][] representation = new int[7][7];
		for(int i=0; i<representation.length; i++) {
			for(int j=0; j<representation[i].length; j++) {
				representation[i][j] = rand.nextInt(10);
			}
		}
		array7x7 = new Array7x7(representation);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		setRepresentation(); //Instance of Array7x7
		TestEnvironmentMovement testA = new TestEnvironmentMovement(array7x7);//Creates test environment
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Performs actions based on the button pressed
	 * @param button pressed
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnMoveLeft) {
			
		}
		
		else if(e.getSource() == btnMoveRight) {
			
		}
	}
}
