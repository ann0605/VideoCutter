package inClass;

import java.util.Random;

import javax.swing.JOptionPane;

public class lect_6 {
	//public static void main(String[] args){
//	//do while loop
//	do{
//		//body
//	}
//while (true)
//}
//}
		
		//LOTTERY GAME WITH NUMBERS
		//FLAGS AND DO WHILE
//		int target;
//		int guesscnt = 0;
//		int guess = 0;
//		boolean winflag = true;
//		Random r = new Random(233);//get the same sequence of random numbers
//		target = r.nextInt(10) + 1;
//		System.out.println(target);
//		do{
//		guess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 and 100"));
//		guesscnt = guesscnt+1;
//		if(guess<0){
//			JOptionPane.showMessageDialog(null,  "Guess positive numbers");
//			continue; //jumps to the bottom of the loop
//		}
//		//if (guess==target){winflag = true; break;} not necessary now that we have a do  while
//		if (guesscnt>10){winflag = false;break;}
//			else if (guess < target){
//			JOptionPane.showMessageDialog(null, "Your answer is too small");}
//			else
//			JOptionPane.showMessageDialog(null,"Your answer is too large!");
//		}while (guess!= target);
//		JOptionPane.showMessageDialog(null, "You WON - Number of guesses: "+ Integer.toString(guesscnt));
//	}
//}

public static void main(String[] args){
//	int total = 0;
//	for (int i = 0; i<5; i = i+2)
//		total +=i;
//} 
	
	//EXERCISE 2
//	int total = 9;
//	for (int i = 3; i< total; i++){
//		total = total - i;
//	}}
	// SUM OF FIRST 100 Integers
//	int total = 0;
//	for (int i = 1; i<= 100; i ++){// why declare i in the loop? - i should only live inside the loop
//		total = total+i; 
//		
//		//WHY I? - integer
//				/* index*/
//	}
//		
//	}
	
// FIND ALL LEAP YEARS FROM 2000 to 2100
	//for (int i = 2000; i<=2100; i++)
// MONTE CARLO SIMULATION
	//uses iteration, random numbers and probability
	//int x = Math.random(); 
	 // type of variable; more predictable and stable than Math.random()
	
	int blue_x = 30,blue_y = 30,blueWidth = 130, blueHeight = 130;
	int red_x = 80, red_y = 80,redWidth = 160, redHeight = 160;
	for (int i = 0; i< 10000;/*<- HOW MANY TIMES WE WANT TO THROW THE DART;*/ i++){
//		Random x = new Random(233); 
//		Random y = new Random(233);
		x = r.nextInt(300);
		boolean hitred = false;boolean hitblue = false;
		if ((x >= blue_x) &&(x<=blueWidth + blue_x) && (y>=blue_y) && (y<=blue_y+blueHeight)){
			hitblue = true;
		}
	}
	
}
