import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want sum!!!");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= num) {
			sum = sum + i;
			i++;
		}
//		for(int i = 0; i <= num; i++) {
//			sum = sum + i;
//		}
		System.out.println("Sum is-> " + sum);

	}

}
