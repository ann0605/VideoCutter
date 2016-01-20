import java.util.Scanner;

public class checkSSN {
	public static void main(String[] args){
		System.out.printf("Please enter your social security number");
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		char symbol_1 = user.charAt(3);
		char symbol_2 = user.charAt(6);
		if (symbol_2 != '-' || symbol_1!= '-') //what is the difference between this and if(symbol_2 != '-') || (symbol_1 != '-' )
				System.out.printf("Your SSN is invalid");
		
	}

}
