package inClass;
import java.util.Scanner;



//import javax.swing.JOptionPane;
public class lect7 {
	public static void main(String[] args){
		String first = "hello";
		first = CamelCase(first);
		System.out.println(first);
		
		}

	public static String CamelCase(String input){
		String ans = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();
				return ans;}
	}
	
////		COMPARING STRINGS:
////		String s[];
////		String t[];
////		if s.equals(E)
////		
////		gives a boolean answer
////		if s.compareTo(t)
////		s = "AB"
////		t="ABC"
////		s<t 
////		OTHER METHODS WITH STRINGS
////		String c = "NEW YORK UNIVERSITY";
////		String York = c.substring(4, 8);
////		int pos = c.indexOf("York")//find the postion of York
////		
////		String inname, first, last;
////		inname = JOptionPane.showInputDialog("Enter name");
////		int pos = inname.indexOf(",");
////		if(pos<0){
////			JOptionPane.showMessageDialog(null, "Enter last, first");
////			System.exit(0);
////		}
////		last = inname.substring(0,pos);
////		first = inname.substring(pos);
////		last = last.substring(0, 1).toUpperCase() + last.toLowerCase();
////		
////	} 
////	MULTIPLICATION TABLE
////	for (int i = 1; i<10; i++)
////	{
////		for (int j = 1; j<10; j++)
////		{
////			System.out.print("\t"+ Integer.toString(i*j));
////		}
////		System.out.println();
////	}
////}
//FIND ALL THE PRIME NUMBERS
//
//for (int i - 2; i< prime/2l i++);
//		if(num%i==0){
//			System.out.println("not prime")
//		}
//
//}
