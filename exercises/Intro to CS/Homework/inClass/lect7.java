import javax.swing.JOptionPane;

public class lect7 {//can declare variables but can't write code outside of the methods
	static int count = 0;
	public static void main(String[] args){
		String bridename,groomname;
		bridename = Prompt("bride");
		
		
		groomname = Prompt("groom");
		PrintMessage(bridename, groomname);
	
	}
	public static void PrintMessage(String p1, String p2){
		System.out.println(p1 + " is marrying" + p2);
	}
	public static String convertToCamelCase(String inname) {
		String returnname;
		int commapos = inname.indexOf(","); 
		returnname = inname.substring(commapos + 1) + " ";
		returnname = returnname + inname.substring(0, commapos);
		// from the beginning to the comma position .
		return returnname;
	}
	
	public static String Prompt(String user){
		String input;
		input = JOptionPane.showInputDialog("enter " + user + "\'s name");
		while(!input.contains(",")) /*or while inname.indexOf(",") == -1)*/{
				input =JOptionPane.showInputDialog("Please separate by a comma!");
		}
		input = convertToCamelCase(input);
		
		return input;
		
	}
}

