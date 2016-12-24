package init;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LEDArrayInput extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private LEDArrayController controller;
	
	public LEDArrayInput(LEDArrayController controller){
		this.controller = controller;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
