import java.util.Scanner;

public class exercise5_31 {
	public static void main(String[] args){
	double percentYield, amount;
	int numOfMonth;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the initial deposit amount: ");
	amount = input.nextDouble();
	System.out.println("Enter the annual percentage yield:");
	percentYield = input.nextDouble();
	System.out.println("Enter maturity period: ");
	numOfMonth = input.nextInt();
	System.out.println("Month\tCD Value");
	for(int i = 1; i< numOfMonth+1; i++){
		amount =  (amount + amount*(percentYield/1200));
		System.out.printf(Integer.toString(i) + "\t%.2f\n", amount);
		}
	
}}
