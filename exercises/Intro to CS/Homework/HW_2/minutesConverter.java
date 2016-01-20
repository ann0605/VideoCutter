import java.util.Scanner;//have to import the scanner class
public class minutesConverter {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes:");
		double minutes = input.nextDouble();//don't really get the brackets here...
		double years = minutes/(365*24*60); 
		double days = years%365;
		System.out.println("The number of years is ");
		System.out.printf("%.2f", years) ;
		System.out.println("and the number of days is ");
		System.out.printf("%.2f", days);
		}
		
	}
