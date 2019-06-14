package arrays;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.WindowConstants;

public class ThreadingGuiDemo extends JFrame {
	JList<String> lb0 = new JList();
	JList<String> lb1 = new JList();
	public ThreadingGuiDemo() {
		this.setLayout(new GridLayout(1,2));
		DefaultListModel<String> model0  = new DefaultListModel<String>();
		DefaultListModel<String> model1  = new DefaultListModel<String>();
		model0.addElement("foo");
		model1.addElement("bar");
		lb0.setModel(model0);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		lb1.setModel(model1);
		this.add(lb0);
		this.add(lb1);
		this.pack();
	}

	public static void main(String[] args) {
		new ThreadingGuiDemo().setVisible(true);
	}

}
