import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divident");
		int divident = sc.nextInt();
		
		System.out.println("Enter Divisor");
		int divisor = sc.nextInt();
		
		System.out.println("Quotient is->"+ (divident/divisor));
		
		System.out.println("Remainder is->"+ (divident%divisor));
		
		sc.close();

	}

}
