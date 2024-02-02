import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 /* print below patarn
  
  * 
  **
  ***
  ****
  *****
   
  */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines to print *");
		int no = sc.nextInt(); 
		
		for(int i = 1; i <= no; i++) {
			//for(int j=i; j >= 0;j--)
			for(int j = no; j > 0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
