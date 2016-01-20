import java.util.Scanner;

public class compoundValue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the monthly saving account: ");
		double account = input.nextDouble();
		double rate = 1.00417;
		double month1 = account * rate;
		//System.out.println(month1);
		double month2 = (account+month1) * rate;
		double month3 = (account+month2) *rate;
		//System.out.println(month3); - debugging
		double month4 = (account + month3) * rate;
		double month5 = (account + month4) * rate;
		double month6 = (account + month5) * rate;
		System.out.printf("After the sixth month, the accout value is %.2f", month6);
		
	}
	
}
