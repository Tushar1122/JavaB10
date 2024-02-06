package ArrayAdvance;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {5,8,2,10,7,6};
		
		int secondLargest = findSecondLargest(array);
		
		System.out.println("Given array is => " + Arrays.toString(array));
		System.out.println("Second-Largest Number " + secondLargest);

	}
	
	private static int findSecondLargest(int[] array) {
		if(array.length < 2) {
			System.out.println("Arrays should have at least two elements!!!!");
			return Integer.MIN_VALUE;
		}
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		
		for(int num : array) {
			if(num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}else if(num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}
}
