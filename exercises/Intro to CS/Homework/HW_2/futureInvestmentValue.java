import java.util.Scanner;
public class futureInvestmentValue {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage: ");
		double monthly = (input.nextDouble())/(12*100);
		
		System.out.println("Enter number of years: ");
		double years = input.nextDouble();
		double formula = Math.pow((1+monthly), (12*years));
		double accumulateValue = investmentAmount * formula;
		System.out.printf("Accumulated value is %.2f", accumulateValue);
	}

}
