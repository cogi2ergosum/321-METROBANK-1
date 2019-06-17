package threading;

import javax.swing.JOptionPane;

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		while(true) {
			String input = JOptionPane.showInputDialog("Recipient: ");
			if (input == null) break;  // user cancelled

			Thread t = new Thread() {
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, 
							"Message sent to " + input);
				}
			};
			t.start();
		}
	}
}

//class MailSenderThread extends Thread {
//	public String recipient;
//
//}
