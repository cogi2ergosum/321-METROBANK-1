package gettinginput;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class GettingInputDemo {

	public static void main(String[] args) {
//		System.out.print("Enter your name: ");
//		Scanner scanner = new Scanner(System.in);
//		String input = scanner.nextLine();
//		System.out.println("Hello, " + input);

		String input = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Hello, " + input);
	}

}
