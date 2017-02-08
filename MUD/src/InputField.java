import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InputField extends JPanel implements ActionListener {
	
	private JTextField inputField;
	private StringListener textListener;
	
	public InputField() {
		inputField = new JTextField();
		inputField.addActionListener(this);		
		setLayout(new BorderLayout());
		add(inputField, BorderLayout.NORTH);
		inputField.setText("Input Commands here");
	
		
		
	}

	//The below represents the "listener" that drives the capture of text for the engine of the game
	public void setStringListener(StringListener listener){
		this.textListener = listener;
	}
		public void actionPerformed(ActionEvent e) {
			String text = inputField.getText() + "\n";
			inputField.setText("");
				if(textListener != null) {
				textListener.textEmitted(text);
			
		}

	}
	
	
}
