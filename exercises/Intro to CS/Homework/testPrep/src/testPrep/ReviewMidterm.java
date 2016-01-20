package testPrep;

import java.util.Random;

import javax.swing.JOptionPane;

//public class ReviewMidterm {
//	public static void main(String[] args){
//		
//		int number = Integer.parseInt(JOptionPane.showInputDialog("please enter a number"));
//		String answer;
//		if (number == 7){
//			 answer = "equal";
//		}
//		else if(number %7 == 0){
//			 answer = "yes";
//		}
//		else
//			 answer = "no";
//	}
//
//}
public class ReviewMidterm{
//	public static void main(String[] args){
//		long currentTime1 = System.currentTimeMillis();
//		Random r = new Random(26);
//		int randNum;
//		int nextNum = 0;
//		int count=0;
//		int consecutive;
//		
//		for (consecutive = 0; consecutive<3; consecutive++){
//			randNum = r.nextInt(9);
//			System.out.println(randNum);
//			count++;
//			if (nextNum == randNum){
//				consecutive++;
//			}
//			else{
//				consecutive = 1;
//				nextNum = randNum;
//				
//			}
//		}
//		long currentTime2 = System.currentTimeMillis();
//		long timeDifference = currentTime2 - currentTime1;
//		System.out.println("The consecutive number is at position\t" + count + "in" + timeDifference + "seconds");
//		
//	}
////}
//	public static void main(String[] args){
//	Random r = new Random(200);
//	int sum = 0;
//	int i = 0;
//	int testScoreGenerator;
//	for ( i = 0; i< 10;i++){
//	 testScoreGenerator = r.nextInt(10) +1;
//		sum+=testScoreGenerator;
//		System.out.println(testScoreGenerator);}
//	
//	int average = sum/(i);
//	System.out.printf("The average is %d", average);}
//}
	
	public static void main(String[] args){
		int statusCode = Integer.parseInt(JOptionPane.showInputDialog("Please enter the status code"));
		String answer;
		switch(statusCode){
		case 0: answer = "active";break;
		case 1: asnwer = "joint";break;
		case 2: answer = "closed";break;
		}
		JOptionPane.showMessageDialog(null,"Status Code descrutiprtion" +  statusdesc);
	}

	
	
	