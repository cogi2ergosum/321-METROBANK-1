package threading;

import java.util.ArrayList;
import java.util.Random;

public class ProducerConsumer {
	int QUOTA = 3;
	ArrayList<String> data = new ArrayList<String>();

	public void start() {
		Producer p = new Producer(data, QUOTA);
		Consumer c = new Consumer(data, QUOTA);
		p.start();
		c.start();
	}

	public static void main(String[] args) {
		new ProducerConsumer().start(); // start program
	}
}

class Producer extends Thread {
	String[] fruits = {"apple", "grapes", "banana", "melon"};
	private ArrayList<String> data;
						Random random = new Random();
	boolean myTurn;
	int quota;

	public Producer(ArrayList<String> data, int quota) {
		this.quota = quota;
		this.data = data;
	}

	public void run() {
		synchronized (data) {
			while (true) {
				myTurn = data.size() < quota;
				if (myTurn) {
					for (int i = 0; i < quota; i++) {
						String rand = fruits[random.nextInt(fruits.length)];
						System.out.println("Producer produces: " + rand);
						data.add(rand);
						try { Thread.sleep(1000); } catch (Exception e) {}
					}
					System.out.println("-----------------------");
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

class Consumer extends Thread {
	private ArrayList<String> data;
	boolean myTurn = false;
	int quota;

	public Consumer(ArrayList<String> data, int quota) {
		this.quota = quota; 
		this.data = data;
	}

	public void run() {
		synchronized (data) {
			while (true) {
				myTurn = data.size() >= quota;
				if (myTurn) {
					for (int i = 0; i < quota; i++) {
						String value = data.remove(0);
						System.out.println("Consumer consumes: " + value);
						try { Thread.sleep(1000); } catch (Exception e) {}
					}
					System.out.println("-----------------------");
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}


	} 
}