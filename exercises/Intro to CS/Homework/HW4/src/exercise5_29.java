import java.util.Scanner;
public class exercise5_29 {
	public static void main(String[] args){
		int year, startDay;
		int numOfDay = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the year");
		year = input.nextInt();
		System.out.println("Please enter the start day");
		startDay = input.nextInt();
		String[] months ={ "January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November","December"};
		for (int i = 0; i< 12; i++){
			System.out.println("\n            " + months[i]);
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");
			int j = 0;
			while(j< startDay){
				System.out.print("\t");
				j++;
			}
			switch(i){
			case 0: 
			case 2:
			case 4: 
			case 6:
			case 7:
			case 9:
			case 11:numOfDay = 31;break;
			case 3:
			case 5:
			case 8:
			case 10: numOfDay = 30; break;
			case 1: 
				if ((year%4 == 0 && year%100 != 0)||(year%400 == 0))
					numOfDay = 29;
				else
					numOfDay = 28;
			}
			for (int k = 1; k< numOfDay+1; k++){
				System.out.print(k + "\t");
				j++;
				if (j%7 == 0){
					System.out.println("");
				}
				startDay = (j%7);
				
			}
			
				
		}
		
			
		
		
	}

}
