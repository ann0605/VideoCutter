package inClass;
import java.util.Random;

import javax.swing.JOptionPane;
public class chap5 {
	//public static void main(String[] args){
//			int cnt = 1;
//			int sum = 0;
//					while(cnt<100){
//						sum = sum+cnt;
//					}
//			System.out.println("The sum is " + sum);
	public static void main(String[] args){
		//write a number guessing game 
		int target;
		int guesscnt = 0;
		int guess = 0;
		Random r = new Random(233);//get the same sequence of random numbers
		target = r.nextInt(10) + 1;
		System.out.println(target);
		while (true){
		//while loop for guesses
		//while(guess!= target) <-- comparing guess to target before even choosing an answer
		guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
		guesscnt = guesscnt+1;
		if(guess<0){
			JOptionPane.showMessageDialog(null,  "Guess positive numbers");
			continue; //jumps to the bottom of the loop
		}
		if (guess==target){break;}
			JOptionPane.showMessageDialog(null, "You won with " + Integer.toString(guesscnt) + "guesses");{break;}
		else if (guess < target){
			JOptionPane.showMessageDialog(null, "Your answer is too small");}
		else
			System.out.println("Your answer is too large!");
		}
		
	}


