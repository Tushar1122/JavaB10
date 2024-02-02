package ArrayBasicAssign3;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyArray copyArray = new CopyArray();
		int array1[] = {3,5,7,9};
		copyArray.arrayCopy(array1);
	}
	
	public void arrayCopy(int[] array1) {
		// TODO Auto-generated method stub
		
		int array2[] = new int[array1.length];
	
		for(int i = array1.length-1; i >=0; i--) {
			array2[i] = array1[i];
		}
		
		System.out.println("Source Array: " + Arrays.toString(array1));
		System.out.println("Destination Array: " + Arrays.toString(array2));
		
	}

	

}
