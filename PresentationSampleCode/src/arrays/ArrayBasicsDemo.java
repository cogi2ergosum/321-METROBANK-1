package arrays;

public class ArrayBasicsDemo {

	public static void main(String[] args) {
		// 1 5 7 45 3
		
		int[] nums = new int[5];
		nums[0] = 1;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 45;
		nums[4] = 3;
		
		int[] nums2 = {1,5,7,45,3};
		
		// apple grapes lemon watermelon
		String[] fruits = {"apple", "grapes", "lemon", "watermelon"};
	
		for(int i=0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		for(String current:fruits) {
			System.out.println(current);
		}
	}

}
