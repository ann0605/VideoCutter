import java.util.Scanner;
//looked up how to compare strings on google; http://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
public class daysOfMonth {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a year");
		int year = input.nextInt();
		System.out.println("Please enter a month: ");
		String month = input.next();// Ryan(tutor) changed nextLine() to next()
		boolean isLeapYear = ((year %4 == 0 && year% 100!=0) || (year%400 == 0));
		if (month.equals("Jan") ||month.equals("Mar")|| month.equals("May") || month.equals("Jul")||month.equals("Oct") || month.equals("Dec"))
			System.out.printf("There are 31 days in %s, %d", month, year);
		
		else if(month.equals("Feb")){
			if(isLeapYear){
				System.out.printf("There are 29 days in Feb, %d", year);}
			else{
				System.out.printf("There are 28 days in Feb, %d", year);}
		}
		else{
			System.out.printf("There are 30 days in %s, %d", month, year);
		}
	}

}
