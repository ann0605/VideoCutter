package midterm2Prep;
import java.util.*;

public class number6 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a number");
		String user =input.next();
		System.out.println(ExtractPhoneNumber(user));
		
		
		
	}
	public static String ExtractPhoneNumber(String inNumber){//string buffer -advanced version of arraylist, static - accessed by everything; call it 
		char[] list = inNumber.toCharArray();
		String output = "";
		
		//ArrayList<Integer>// holds string as an object only accepts objects
		for (int i = 0; i< list.length; i++ ){
			if (Character.isDigit(list[i])== true){
				output += (list[i]);
			}
		}
		return output;
		
	}

}
