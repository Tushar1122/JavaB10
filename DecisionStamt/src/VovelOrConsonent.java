import java.util.Scanner;

public class VovelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		while(flag != true) {
		System.out.println("Enter any character!!!");
		
		char ch = sc.next().charAt(0);
			
		switch(Character.toLowerCase(ch)) {
		
		case 'a': 
				
		case 'e': 
			
		case 'i': 
			
		case 'o': 
			
		case 'u': 
			System.out.println("It's a Vowel!!!");
				break;
		
		default :
			if(Character.isLetter(ch)) {
				System.out.println(ch + " is a consonant!!!");
			}
			else {
				System.out.println(ch + " is not a valid letter.!!!");
				flag = true;
			}		
		}	
	}
		sc.close();
}
}
