package threading;

import java.util.ArrayList;

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
	private ArrayList<String> data;
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
						System.out.println("Producer produces an item");
						data.add("item");
						try { Thread.sleep(1000); } catch (Exception e) {}
					}
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
						System.out.println("Consumer consumes the item");
						data.remove(0);
						try { Thread.sleep(1000); } catch (Exception e) {}
					}
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