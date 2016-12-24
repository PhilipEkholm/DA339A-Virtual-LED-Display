package init;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import android.Color;
import array7.Array7;
import array7.Array7x7;
import arrays.ArraySupporter;
import arrays.ArraySupporter2D;
import characters.Characters;
import javadisplay.ColorDisplay;
import testsuites.StringToColorDisplayParser;
import testsuites.TestEnvironmentArrays;
import testsuites.TestEnvironmentMovement;

public class LEDArray {
	
	//Note that as little code as possible should be inside the main, the exception is testing.
	public static void main(String[] args) {
		LEDArray app = new LEDArray();
		app.initLEDArray();
	}
	
	private void initLEDArray(){
		LEDArrayView view = new LEDArrayView();
		LEDArrayController controller = new LEDArrayController(view);
		LEDArrayInput input = new LEDArrayInput(controller);
		
		JFrame frameInput = new JFrame("LED Array Kontroller");
		frameInput.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameInput.setLocation(100, 100);
		frameInput.setResizable(true);
		
		frameInput.add(input);
		frameInput.pack();
		frameInput.setVisible(true);
		
		JFrame frameView = new JFrame("LED Array");
		frameView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameView.setLocation(300, 100);
		frameView.setResizable(true);
		
		frameView.add(view);
		frameView.pack();
		frameView.setVisible(true);
	}
	
	/**
	 *	Launches the test suite for different methods in Array7 and Array7x7 
	 *	Change the character for different testing!
	 */
	
	private void initTestSuite(){
		/*
		 *	Test Suite 
		 */
		char character = 'A';
		
		TestEnvironmentArrays testA = new TestEnvironmentArrays(Characters.getChar(character));//Creates test environment
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
	
	/**
	 *	Launches the test suite for testing bit-shifting. 
	 *	Change the char to try it out in the test suite!
	 */
	
	private void shiftTestSuite(){
		/*
		 *	Change character!
		 */
		char character = 'A';
		
		TestEnvironmentMovement testA = new TestEnvironmentMovement(Characters.getChar(character));//Creates test environment
		
		JFrame frame = new JFrame("Test Environment Arrays");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		frame.add(testA);
		frame.pack();
		frame.setVisible(true);
	}
	
	/**
	 *	Starts up the StringToColorDisplayParser 
	 */
	
	private void launchStringToColorParser(){
		JFrame frame = new JFrame("String to Color parser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(100, 100);
		frame.setResizable(true);
		
		frame.add(new StringToColorDisplayParser());
		frame.pack();
		frame.setVisible(true);
	}
	
	/**
	 *	A simple example of using timers. 
	 */
	
	private void testTimer(){
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				System.out.println("Hej");
			}
		}, 1, 500);
	}
	
	/**
	 *	Runs an example of colordisplay using timers to
	 *	randomize colors.
	 */
	
	private void randomizeColorsInColorDisplay(){
		int displayLength = 2,
			displayWidth = 2; //Not in cells but in character length (7x7 cells)!
		Timer timer = new Timer();
		Random rand = new Random();
		/*
		 *	Instead of having one 14 * 14 array we must split it up into 4 different arrays
		 *	Since ColorDisplay only supports 7x7 arrays.
		 *
		 *	To store them we use a 3D-array.
		 */
		int[][][] tables = {
			new int[7][7],
			new int[7][7],
			new int[7][7],
			new int[7][7]
		};
		
		ColorDisplay d = new ColorDisplay(displayWidth, displayLength,Color.WHITE,Color.BLACK,1,10);
		
		for(int i = 0; i < tables.length; i++){
			for(int j = 0; j < tables[i].length; j++){
				for(int k = 0; k < tables[i][j].length; k++){
					tables[i][j][k] = Color.argb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
				}
			}
		}
		
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
			public void run() {
				for(int i = 0; i < tables.length; i++){
					for(int j = 0; j < tables[i].length; j++){
						for(int k = 0; k < tables[i][j].length; k++){
							tables[i][j][k] = Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
						}
					}
				}
				
				d.setDisplay(tables[0], 0, 0);
				d.setDisplay(tables[1], 0, 1);
				d.setDisplay(tables[2], 1, 0);
				d.setDisplay(tables[3], 1, 1);
				d.updateDisplay();
				JOptionPane.showMessageDialog(null,d);
			}
			
		}, 1, 1000);
	}
}
