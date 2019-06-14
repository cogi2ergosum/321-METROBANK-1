package arrays;

public class Receiver2 {
	public static void main(String[] args) {
		int i = 0;
		for (String arg : args) {
			System.out.println("arg " + i + ": " + arg);
			i++;
		}
	}
}