import java.util.Scanner;

public class businessISBN {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of the ISBN");
		
		String user = input.nextLine();
		int index = 0;
		int checksum = 0;
		int sum = 0;
		
		while (index != user.length()){
			char s = user.charAt(index);
			int digit = (int)s; //got advice from tutor: assign int s to a new variable
			sum  = sum + digit;
			index++;
			
		}
		checksum = sum%11;
		if (checksum == 10){
			System.out.printf("The ISBN-10 number is" + user + "X");
			
		}
		else
			System.out.println("The ISBN-10 number is " + user + checksum ); //convertingfrom integer to a string?
			
	}

}
