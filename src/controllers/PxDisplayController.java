package controllers;

import java.util.Timer;

import javax.swing.JFrame;

import characters.Array7x7;
import views.PxDisplayView;

public class PxDisplayController {
	private PxDisplayView view;
	private String stringToPrint;
	private int characterColor,
				printingFrequency;
	private boolean programRunning;
	private int runningCounter;
	private int displayLength;
	private int[][][] representation;
	private Array7x7[] characters;
	public static Timer t = new Timer();
	
	public PxDisplayController(){
		this.view = new PxDisplayView();
		this.setupJFrame();
	}
	
	private void setupJFrame(){
		JFrame frameView = new JFrame("LED Array");
		frameView.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//To avoid closing the whole program
		frameView.setLocation(300, 70);
		frameView.setResizable(true);
		
		frameView.add(view);
		frameView.pack();
		frameView.setVisible(true);
	}
}
