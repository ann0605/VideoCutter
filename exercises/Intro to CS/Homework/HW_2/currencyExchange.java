import java.util.Scanner;
public class currencyExchange {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("pLease enter the exchange rate from dollars to RMB:");
	double xRate = input.nextDouble();
	System.out.println("Enter 0 to convert dollars to RMB, 1 to convert from RMB to dollars");
	double x = input.nextDouble();

	if (x==0){
		System.out.println("Enter the dollar amount");
		double dollars = input.nextDouble();
		double RMB = dollars * xRate;
		System.out.printf("$ %.1f is %.1f yuan", dollars, RMB);
	}
	else{
		System.out.println("Enter the RMB amount: ");
		double RMB_2 = input.nextDouble();
		double dollars_2 = RMB_2/xRate;
		System.out.printf( "%.1f yuan is $ %.1f", RMB_2, dollars_2);
	}
		
	}

}
