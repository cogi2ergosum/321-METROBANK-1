package threading;

import javax.swing.JOptionPane;

public class EmailSenderSimNonMT {

	public static void main(String[] args) {
		while (true) {
			String input = JOptionPane.showInputDialog("Recipient: ");
			if (input == null) break;  // user cancelled
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			JOptionPane.
			   showMessageDialog(null, "Message sent to " + input);
		}
	}
}
