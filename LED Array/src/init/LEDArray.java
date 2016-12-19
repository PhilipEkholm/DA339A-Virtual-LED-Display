package init;

import javax.swing.JFrame;

import array7.Array7;
import array7.Array7x7;
import arrays.ArraySupporter;
import characters.Characters;
import init.TestEnvironmentArrays;

public class LEDArray {
	
	//Note that as little code as possible should be inside the main, the exception is testing.
	public static void main(String[] args) {
		LEDArray app = new LEDArray();
		app.shiftTestSuite();
	}
	
	private void initTestSuite(){
		/*
		 *	Test Suite 
		 */
		TestEnvironmentArrays testA = new TestEnvironmentArrays(Characters.getChar('A'));//Creates test environment
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
	
	private void shiftTestSuite(){
		/*
		 *	Test Suite for bit shifting
		 */
		TestEnvironmentMovement testA = new TestEnvironmentMovement(Characters.getChar('A'));//Creates test environment
		
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
}
