import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class OutputField extends JPanel {
	
	private JTextArea textArea;
	
	public OutputField() {
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	}
	
	public void append(String text) {
		
		textArea.append(text);
		// TODO Auto-generated method stub
		
	}

}
