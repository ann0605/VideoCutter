import java.util.Scanner;

public class employee {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		int hours = input.nextInt();
		System.out.println("Enter hourly pay rate: ");
		double wage = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		System.out.println("Enter state tax witholding rate: ");
		double stateTax = input.nextDouble();
		double grossPay  = hours*wage;
		double fed = fedTax*grossPay;
		double state = (stateTax)*grossPay;
		double totalDeduction = fed+state;
		double netPay = grossPay - totalDeduction;
		System.out.printf("Employee Name: %s\n", name);
		System.out.printf("Hours Worked: %d\n", hours);
		System.out.printf("Pay Rate: $%.1f\n", wage);
		System.out.printf("Gross Pay: $%.1f\n", grossPay);
		System.out.println("Deductions:\n");
		System.out.printf("Federal Witholding (%.1f): $%.1f\n", fedTax*100, fed);
		System.out.printf("State Witholding(%.1f): $%.1f\n",stateTax*100, state);
		System.out.printf("Total Deduction: $%.1f\n", totalDeduction);
		System.out.printf("Net Pay: $%.1f",netPay);
	}

}
