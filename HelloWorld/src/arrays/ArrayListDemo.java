package arrays;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) throws IOException  {
		ArrayList fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("lemon");
//		
		String filename = "c:\\321\\fruits.txt";
//		PrintStream ps = new PrintStream(new FileOutputStream(filename));
//		System.setOut(ps);
//		for (Object fruit : fruits) {
//			String s = (String)fruit;
//			System.out.println(s);
//		}
		
		FileReader fileReader = new FileReader(filename);
		BufferedReader br = new BufferedReader(fileReader);
		String firstLine = br.readLine();
		System.out.println(firstLine);
		System.out.println(System.getProperty("os.name"));
	}

}
