package init;

import javax.swing.JFrame;

import array7.Array7;
import array7.Array7x7;
import arrays.ArraySupporter;
import characters.Characters;
import init.TestEnvironmentArrays;
import characters.Characters;

public class LEDArray {
	//Note that as little code as possible should be inside the main, the exception is testing.
	public static void main(String[] args) {
		//LEDArray app = new LEDArray();
		//app.initTestSuite();
		
		Array7x7 arr = Characters.getChar('T');
		Array7 arr7 = new Array7(new int[] {1, 1, 0, 1, 0, 0, 1});
		
		arr.shiftLeft(arr7);
		System.out.println(arr.toString());
		//Array7x7 copy = Characters.getChar('B');
	}
	
	//Måste åtgärda problem med referens
	
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
}
