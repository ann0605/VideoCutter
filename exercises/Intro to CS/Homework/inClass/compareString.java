import java.util.ArrayList;
import java.util.Scanner;

public class compareString {
	public static void main(String[] args){
	ArrayList<String> listOfInterests = new ArrayList<String>();
	String result = inputString();
	System.out.println("Here is your list" + result);
		
	}}


public static String inputString(String input){
	String input;
	Object Scanner;
	Object ArrayList;
	ArrayList<String> listOfInterests = new ArrayList<String>();
		
	while (input != "end"){
		Scanner input1 = new Scanner(System.in);
		System.out.println("Please enter your interest: ");
		input = input1.nextLine();
		listOfInterests.add(input);
		return listOfInterests;}
	
}