import java.util.Scanner;

public class lottery {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your 3-digit guess:");
		int answer = input.nextInt();
		int lottery = (int) (Math.random()*1000);
		int lotteryDigit1 = lottery/100;
		int lotteryDigit2 = (lottery%100)/10;
		int lotteryDigit3 = (lottery%100)%10;
		int answerDigit1 = answer/100;
		int answerDigit2 = (answer%100)/10;
		int answerDigit3 = (answer%100)%10;
		System.out.println("The lottery number is  "+ lottery);
		if(answer == lottery)
			System.out.println("Your prize is $10000!");
		else if(lotteryDigit1 == answerDigit2 
				&& lotteryDigit1 == answerDigit2
				&& lotteryDigit1 == answerDigit3
				&& lotteryDigit2 == answerDigit3
				&& lotteryDigit2 == answerDigit1
				&& lotteryDigit3 == answerDigit1
				&& lotteryDigit3 == answerDigit1
				)
			System.out.println("So close! You get a $3000 prize");
		else if(lotteryDigit1 == answerDigit2 
				|| lotteryDigit1 == answerDigit2
				|| lotteryDigit1 == answerDigit3
				|| lotteryDigit2 == answerDigit3
				|| lotteryDigit2 == answerDigit1
				|| lotteryDigit3 == answerDigit1
				|| lotteryDigit3 == answerDigit1)
			System.out.println("You only matched one digit, here is a $1000 prize");
		else
			System.out.println("Sorry, no match");
	}

}
