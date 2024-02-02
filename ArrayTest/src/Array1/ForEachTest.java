package Array1;

public class ForEachTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 10;
		arr[2] = 20;
		
		System.out.println("Array iteration using for loop");
		
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		

	}

}
