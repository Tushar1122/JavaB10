package Array1;

import java.util.ArrayList;

public class ArrayBasicAssignments {

	public static void main(String[] args) {
		// sum of values of an array
		
//		int arr[] = {10,20,30,40,50,60,60,70};
//		int sum = 0;
//		
//		for(int i = 0; i <= arr.length - 1; i++) {
//		sum = sum + arr[i];
//		}
//		System.out.println("Array elements are ->");
//		for(int element : arr) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//		System.out.println("Sum of array is -> " + sum);
		
		// calculate the avg of array elements
//		int arr[] = {10,20,30,40,50,60,70};
//		int sum = 0;
//		
//		for(int i = 0; i <= arr.length-1; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("Array is ->");
//		for(int element : arr) {
//			System.out.print(element + " ");
//		}
//		System.out.println();
//		System.out.println("Sum of array element is-> " + sum);
//		System.out.println("Avg of array elements is-> " + (sum/arr.length));	
		
		//even and odd intergers in an array
		int arr[] = {10,20,30,45,50,65,60,75};
		ArrayList<Integer> arrayEven = new ArrayList<>();
		ArrayList<Integer> arrayOdd = new ArrayList<>();
		
		for(int i = 0; i <= arr.length - 1; i++) {
			if((arr[i] % 2) == 0) {
				arrayEven.add(arr[i]);
			}
			else {
				arrayOdd.add(arr[i]);
			}
		}
		System.out.println("Array is ->");
		for(int element: arr) {
			System.out.print(element + " ");
		}
		
		System.out.println();
		System.out.println("Even elements are ->");
		for(int even : arrayEven) {
			System.out.print(even + " ");
		}
		System.out.println();
		
		System.out.println("Odd elements are ->");
		for(int odd : arrayOdd) {
			System.out.print(odd + " ");
		}
	}
}
