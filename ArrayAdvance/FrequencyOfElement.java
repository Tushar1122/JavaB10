package ArrayAdvance;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,2,3,4,3,4,2};
		
		int[] frequencyArray = findElementFrequency(arr);
		
		System.out.println("Given Array is =>" + Arrays.toString(arr));
		System.out.println("Element Frequencies:");
		for(int i = 0; i < frequencyArray.length; i++) {
			if(frequencyArray[i] > 0) {
				System.out.println(i + ":" + frequencyArray[i] + " times");
			}
		}

	}

	private static int[] findElementFrequency(int[] arr) {
		// TODO Auto-generated method stub
		
		int maxElement = getMaxElement(arr);
		
		int[] frequencyArray = new int[maxElement + 1];
		
		for(int element : arr) {
			frequencyArray[element]++;
		}
		
		return frequencyArray;
	}

	private static int getMaxElement(int[] arr) {
		// TODO Auto-generated method stub
		
		int max = Integer.MIN_VALUE;
		
			for(int element : arr) {
				max = Math.max(max, element);	
			}
		return max;
	}

}
