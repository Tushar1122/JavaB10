package Array1;

public class ArrayBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		int[] arr1 = {1000,5,10,20,30,40,50,60,70,45,12,34,1};
		
//		for(int i = arr1.length-1; i >= 0; i--) {
//			System.out.println(arr1[i]);
//			
//		}
		for(int i = 0; i < arr1.length; i = i + 2) {
//			if(i % 2 == 0) {
				System.out.println(arr1[i]);
	//		}
		}
		
		int max = arr1[0]; 
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println("Maximum in an array is -> "+max);
		
		int min = arr1[0]; 
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("Minimum in an array is -> "+min);
	}
}
