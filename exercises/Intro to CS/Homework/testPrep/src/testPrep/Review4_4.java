package testPrep;

import java.util.Scanner;

public class Review4_4 {
	public static void main(String[] args){
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your number");
		int number; 
		do{
			number =input.nextInt();
			sum+=number;
			
		}while(number!=0);
	}
	System.out.printf("Your sum is as follows %d", sum);//??

}
