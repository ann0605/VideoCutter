import java.util.Scanner;

public class keyPads {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String user = input.nextLine();
		char letter = user.charAt(0);//could turn the character into uppercase or lowercase..
		
		if ((letter>= 'A' && letter<='C') || (letter >= 'a' && letter <= 'c'))
			System.out.println("The corresponding number is 2");
		else if((letter>= 'D' && letter<='F') || (letter >= 'd' && letter <= 'f'))
			System.out.println("The corresponding number is 3");
		else if((letter>= 'G' && letter<='I') || (letter >= 'g' && letter <= 'i'))
			System.out.println("The corresponding number is 4");
		else if((letter>= 'J' && letter<='L') || (letter >= 'j' && letter <= 'l'))
			System.out.println("The corresponding number is 5");
		else if((letter>= 'M' && letter<='O') || (letter >= 'm' && letter <= 'o'))
			System.out.println("The corresponding number is 6");
		else if((letter>= 'P' && letter<='S') || (letter >= 'p' && letter <= 's'))
			System.out.println("The corresponding number is 7");
		else if((letter>= 'T' && letter<='V') || (letter >= 't' && letter <= 'v'))
			System.out.println("The corresponding number is 8");
		else if((letter>= 'W' && letter<='Z') || (letter >= 'w' && letter <= 'z'))
			System.out.println("The corresponding number is 9");
		else
			System.out.printf("The %c is an invalid number", letter);
		}
			
		
		
	}

