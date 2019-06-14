package arrays;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		
		System.out.println("Processing...");
		
		long start = System.currentTimeMillis();
		StringBuilder s1 = new StringBuilder("Hello");
		String s2 = "World";	
		
		for (int i = 0; i < 100_000; i++) {
			s1.append(s2);
		}
		long end = System.currentTimeMillis();
		long duration = end - start;
		
		System.out.println("Operation took " + duration + "msecs!");
		
	}

}
