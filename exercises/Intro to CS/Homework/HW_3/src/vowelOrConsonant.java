import java.util.Scanner;
public class vowelOrConsonant {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a letter: ");
		String letter = input.next();//have to scan the letter and see if it is in the vowels list
		
		if (letter == "A" || letter == "E" || letter == "U" || letter == "O" || letter == "Y" || letter == "U")
			System.out.printf("The letter %s is a vowel", letter);
		System.out.printf("The letter %s is a consonant", letter);
		}

}
