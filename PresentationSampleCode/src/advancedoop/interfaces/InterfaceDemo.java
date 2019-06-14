package advancedoop.interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		Sorter sorter = new Employee();
		String[] fruits = {"apple", "grapes", "lemon"};
		sorter.sort(fruits);
		String firstElement = sorter.getFirst();
		System.out.println("After sorting, first element is" + firstElement);
	}

}
interface Sorter {
	public String[] sort(String[] data);
	public String getFirst();
	public String getLast();
}


class BubbleSorter implements Sorter {
	public String[] sort(String[] data) {
		// use merge sort algorithm here (slow)
		return null;
	}

	@Override
	public String getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}
}

class MergeSorter implements Sorter {
	public String[] sort(String[] data) {
		// use merge sort algorithm here
		return null;
	}

	@Override
	public String getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Employee implements Sorter {
	String name;

	@Override
	public String[] sort(String[] data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
