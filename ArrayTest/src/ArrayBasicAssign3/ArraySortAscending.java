package ArrayBasicAssign3;

public class ArraySortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr = {0,23,14,12,9};
		int[] arr = {7,0,2};
		
		System.out.println("Original Array =>");
		for(int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
			//System.out.println(arr.length-1);
			
		}
		
		ArraySortAscending arraySortAscending = new ArraySortAscending();
		arraySortAscending.calulateArrayAsc(arr);
	}

	private void calulateArrayAsc(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0 ; j < arr.length-i- 1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}	
		}
	
		System.out.println();	
		System.out.println("After Sorting =>");
		for(int i = 0; i <= arr.length - 1; i++) {
			
			System.out.print(arr[i] + " ");
			//System.out.println(arr.length-1);
		}
	}
}
