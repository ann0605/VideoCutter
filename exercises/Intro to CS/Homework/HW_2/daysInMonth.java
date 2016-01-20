import java.util.Scanner;
public class daysInMonth {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month:");
		int month = input.nextInt();
		System.out.println("Enter year:");
		int year = input.nextInt();
		int days = 0;
		boolean isLeapYear = (year %4 == 0 && year% 100!=0) || (year%400 == 0);
		switch (month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:  days = 31;break;
			case 4:
			case 6:
			case 9:
			case 11:  days = 30; break;
			case 2:   days = (isLeapYear) ? 29 : 28; break;

		}
		System.out.printf("The number of days in month %d and year %d is %d", month, year, days);
		
}}
