import java.util.Scanner;

public class ControlStatementAssignment {

	public static void main(String[] args) {
		// take two values and print the greastest
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number!!!");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number!!!");
		int num2 = sc.nextInt();
		
		int max = num1 > num2 ? num1 : num2;
		
		System.out.println("Greatest of two is-> " + max);
		
		//Print marks and grade
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the marks!!!");
//		int marks = sc.nextInt();
//			
//			if(marks < 25) {
//				System.out.println("Marks are " + marks + " And grade is F");
//			}
//			else if(marks >= 25 && marks < 45) {
//				System.out.println("Marks are " + marks + " And grade is E");
//			}
//			else if(marks >= 45 && marks < 50) {
//				System.out.println("Marks are " + marks + " And grade is D");
//			}
//			else if(marks >= 50 && marks < 60) {
//			System.out.println("Marks are " + marks + " And grade is C");
//			}
//			else if(marks >= 60 && marks < 80) {
//				System.out.println("Marks are " + marks + " And grade is B");
//			}
//			else if(marks > 80) {
//				System.out.println("Marks are " + marks + " And grade is A");
//			}
		
		//check wheather lowercase or uppercase
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter uppercase or lowercase character!!!");
//		char ch = sc.next().charAt(0);
//		
//		if(isLowerCase(ch)) {
//			System.out.println(ch + " is a lowercase character!!!!");
//		}
//		else if(isUpperCase(ch)) {
//			System.out.println(ch + " is a uppercase character!!!!");
//		}
//		else {
//			System.out.println(ch + " is not a letter.");
//		}
//	}
//
//	private static boolean isUpperCase(char ch) {
//		// TODO Auto-generated method stub
//		
//		return ch >= 'A' && ch <= 'Z';
//	}
//
//	private static boolean isLowerCase(char ch) {
//		// TODO Auto-generated method stub
//		return ch >= 'a' && ch <= 'z';
	
		
		//check wheaher positive or negative
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any Number!!!!");
//		int num = sc.nextInt();
//		
//		if(num > 0) {
//			System.out.println(num + " is a positive number!!!");
//		}
//		else {
//			System.out.println(num + " is a negative number!!!");
//		}
		
		//find the power
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the base!!!");
//		int base = sc.nextInt();
//		System.out.println("Enter the Exponent!!!");
//		int expo = sc.nextInt();
//		int power = 1;
//		
//		for(int i = 0; i < expo;i++) {
//			power = power * base;
//		}
//		System.err.println("Power of " + base + " to the " + expo + " is " + power);
	}
}
