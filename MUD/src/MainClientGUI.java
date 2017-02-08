import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;

public class MainClientGUI extends JFrame {

	private OutputField textDisplay;
	private InputField inputField;
	private int i = 0;
	private double sum = 0;
	public Parser parse = new Parser();
	private String command;
	
	public MainClientGUI() {
		super("Simple MUD Gui");

		setLayout(new BorderLayout());

		textDisplay = new OutputField();
		inputField = new InputField();
		textDisplay.append("Welcome!\n");

		inputField.setStringListener(new StringListener() {

			
			//This uses the listener from the Input field and sends the text out to the Parser which is the main engine driving the game. 			
		public void textEmitted(String text) {
			command = text;
			parse.parseText(command);
			textDisplay.append(text);
					}
		});
		
			
		

		add(textDisplay, BorderLayout.CENTER);
		add(inputField, BorderLayout.SOUTH);
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);

	}

}
