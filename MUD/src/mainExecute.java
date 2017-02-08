import javax.swing.SwingUtilities;
import javax.swing.JFrame;


public class mainExecute {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				new MainClientGUI();
			}
	});

}

}