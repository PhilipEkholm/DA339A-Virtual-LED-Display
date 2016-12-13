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
		
		/*
		 *	Test Suite 
		 */
		TestEnvironmentArrays testA = new TestEnvironmentArrays(Characters.getChar('Q'));//Creates test environment
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
}
