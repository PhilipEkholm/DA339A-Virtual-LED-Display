package controllers;

import javax.swing.JFrame;

import views.PxInputView;

public class PxInputController {
	private PxInputView view;
	
	public PxInputController(){
		this.view = new PxInputView();
		this.setupJFrame();
	}
	
	private void setupJFrame(){
		JFrame frameInput = new JFrame("LED Array Kontroller");
		frameInput.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //To avoid closing the whole program
		frameInput.setLocation(40, 70);
		frameInput.setResizable(true);
		
		frameInput.add(this.view);
		frameInput.pack();
		frameInput.setVisible(true);
	}
}
