package ArrayBasicAssign3;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseArray reverseArray = new ReverseArray();
		int array1[] = {10,20,30,40,50};
		reverseArray.arrayReverse(array1);
		
	}
	void arrayReverse(int[] array1) {
		  int array2[] = new int[array1.length];
			int j = 0;
			for(int i = array1.length - 1; i >= 0; i--) {
				array2[j] = array1[i];
				j++;
			}
			
			System.out.println("Source Array: " + Arrays.toString(array1));
			System.out.println("Destination Array: " + Arrays.toString(array2));
		}
}
