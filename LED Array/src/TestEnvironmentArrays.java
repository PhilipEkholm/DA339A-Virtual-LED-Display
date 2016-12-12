package moment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import moment1.Array7;
import moment1.Array7x7;

/**
 * Test environment for Array7 and Array7x7. 
 * @author Lucas Borg
 *
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
	
	private JPanel panelLeft = new JPanel( new GridLayout(7,1) );
	private JPanel panelCenter = new JPanel( new BorderLayout() );
	private JPanel panelRight = new JPanel( new GridLayout(6,1) );
	
	private Font mono = new Font("MONOSPACED", Font.BOLD, 24);
	
	private int labelX=32, labelY=32;
	private int distanceX=15, distanceY=15;
	
	private static Array7x7 array7x7;
	private Array7 array7;
	
	/**
	 * Constructs test environment
	 */
	public TestEnvironmentArrays() { 
		fillMainGrid(); //Fill labels with numbers from Array7x7
//		addMainGrid(); //Add a grid of labels to panelCenter
		rightField(); //Adds content to panelRight		
		textFieldsSouth(); //Adds textFields to panelCenter at BorderLayout.South
		textFieldsWest(); //Adds textFields to panelCenter at BorderLayout.West
		
		setLayout( new GridLayout(1,3) );
		setBackground(Color.WHITE);
		
		add(panelLeft);
		add(panelCenter);
		add(panelRight);
		
		addActionListeners();
	}
	
	/**
	 * Text to labels in grid
	 */
	public void fillMainGrid() {
		JLabel label;
		for(int i=0; i<mainGrid.length; i++) {
			for(int j=0; j<mainGrid[i].length; j++) {
				label = new JLabel();
				mainGrid[i][j] = label;
				mainGrid[i][j].setFont(mono);
				mainGrid[i][j].setText(array7x7.getElement(i, j) + "");
			}
		}
	}
	
	/**
	 * Creates a grid of labels
	 */
	public void addMainGrid() {
		JPanel gridRows = new JPanel( new GridLayout(1,7));
		JLabel label;
		JPanel row;
		for(int i=0; i<mainGrid.length; i++) {
			row = new JPanel( new GridLayout(7,1));
			for(int j=0; j<mainGrid[i].length; j++) {
				label = new JLabel();
				mainGrid[i][j] = label;
				mainGrid[i][j].setBackground(Color.BLUE);
				mainGrid[i][j].setForeground(Color.WHITE);
				mainGrid[i][j].setSize(new Dimension(labelX,labelY));
				row.add(mainGrid[i][j]);
			}
			gridRows.add(row);
		}
		panelCenter.add(gridRows, BorderLayout.CENTER);
	}
	
	/**
	 * Creates a panel with GridLayout. Fills this panel with TextFields. Adds the panel to panelCenter at BorderLayout.South.
	 */
	public void textFieldsSouth() {
		JPanel south = new JPanel( new GridLayout(1,7) );
		JTextField tf;
		south.setPreferredSize( new Dimension(labelX*tfColumn.length, labelY));
		for(int i=0; i<tfRow.length; i++) {
			tf = new JTextField();
			tfRow[i] = tf;
			tfRow[i].setSize( new Dimension(labelX, labelY));
			tfRow[i].setBackground(Color.ORANGE);
			tfRow[i].setForeground(Color.WHITE);
			south.add(tfRow[i]);
		}
		panelCenter.add(south, BorderLayout.SOUTH);
	}
	
	/**
	 * Creates a panel with GridLayout. Fills this panel with TextFields. Adds the panel to panelCenter at BorderLayout.West.
	 */
	public void textFieldsWest() {
		JPanel west = new JPanel( new GridLayout(7,1) );
		JTextField tf;
		panelLeft.setPreferredSize( new Dimension(labelX, labelY*tfColumn.length));
		for(int i=0; i<tfColumn.length; i++) {
			tf = new JTextField();
			tfColumn[i] = tf;
			tfColumn[i].setSize( new Dimension(labelX, labelY));
			tfColumn[i].setBackground(Color.ORANGE);
			tfColumn[i].setForeground(Color.WHITE);
//			west.add(tfColumn[i]);
			panelLeft.add(tfColumn[i]);
		}
//		panelCenter.add(west, BorderLayout.WEST);
	}
	
	/**
	 * Sets and adds JButtons and JTextFields to panelRight.
	 */
	public void rightField() {
		
		readRow.setSize( new Dimension(50, 30));
		readRow.setBackground(Color.GREEN);
		writeRow.setSize( new Dimension(50, 30));
		writeRow.setBackground(Color.GREEN);
		readColumn.setSize( new Dimension(50, 30));
		readColumn.setBackground(Color.GREEN);	
		writeColumn.setSize( new Dimension(50, 30));
		writeColumn.setBackground(Color.GREEN);
		
		inputRowNbr.setSize( new Dimension(80, 30));
		inputRowNbr.setBackground(Color.GREEN);
		inputColumnNbr.setSize( new Dimension(80, 30));
		inputColumnNbr.setBackground(Color.GREEN);
		
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
	public void addActionListeners() {
		readRow.addActionListener(this);
		writeRow.addActionListener(this);
		readColumn.addActionListener(this);
		writeColumn.addActionListener(this);
	}

	/**
	 * Performs actions based on the button pressed
	 * @param button pressed
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==readRow) {
			
		}
		
		else if(e.getSource()==writeRow) {
			
		}
		
		else if(e.getSource()==readColumn) {
			
		}
		
		else if(e.getSource()==writeColumn) {
			
		}

	}
	
	public static void main(String[] args) {
		int[][] representation ={ {1,7,3,5,4,1,8}, {9,4,6,1,4,2,2}, {1,7,3,5,4,1,8},{1,7,3,5,4,1,8},{1,7,3,5,4,1,8},{1,7,3,5,4,1,8},{1,7,3,5,4,1,8} };
		array7x7 = new Array7x7(representation);
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		TestEnvironmentArrays testA = new TestEnvironmentArrays();
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
}
