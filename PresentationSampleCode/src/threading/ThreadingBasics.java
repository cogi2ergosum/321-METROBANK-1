package threading;

import java.util.Random;

import javax.swing.JFrame;

public class ThreadingBasics {

	public static void main(String[] args) {
		RandomNumberGeneratorThread t0 = 
				new RandomNumberGeneratorThread();
		t0.start();

		RandomNameGenerator instruction = new RandomNameGenerator();
		Thread t1 = new Thread(instruction);
		t1.start();
	}
}

class RandomNumberGeneratorThread extends Thread {
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int randomVal = random.nextInt(100) + 1;
			System.out.println("A random value: " + randomVal);
		}
	}
}
class RandomNameGenerator extends JFrame 
	implements Runnable, Comparable {
	String[] names = {"John", "Mary", "Peter", "Nick", "Paul"};
	Random random = new Random();

	public void run() {
		for (int i = 0; i < 100; i++) {
			int randomIndex = random.nextInt(names.length);
			System.out.println("A random name: " + names[randomIndex]);
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}