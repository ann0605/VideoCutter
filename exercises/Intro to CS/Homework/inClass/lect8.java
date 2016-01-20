import java.util.Random;

public class lect8 {
	public static void main(String[] args){
		int cardDeck[];
		cardDeck = new int[20];
		for(int i = 1; i< cardDeck.length; i++){
			if (cardDeck[i] ==cardDeck[i-1]){
				cardDeck[i] = 0;
			}
		}
	}
}
//	public static void main(String[] args){
//		int randomNumbers[];
//		int count = 0;
//		randomNumbers= new int[20];
//		Random r = new Random(23874);
//		for(int i = 0; i<randomNumbers.length; i++){
//			randomNumbers[i] = r.nextInt(10) + 1;
//		}
//		PrintArray(randomNumbers);
//		
//		for (int i = 0; i<randomNumbers.length; i++){
//			for (int j = i+1; j< randomNumbers.length; j++){
//				if (randomNumbers[i] == randomNumbers[j]){
//					randomNumbers[j] = 0;
//					
//				}
//			}		PrintArray(randomNumbers);}
//
//		}
//		
//		//void method returns nothing
//		public static void PrintArray(int[] parmarray){
//			for (int i = 0; i< parmarray.length; i++){
//				System.out.print(parmarray[i] + " ");
//			}
//			}}
//		
////		for(int i  = 1; i< randomNumbers.length; i++)
////		if ((randomNumbers[i] == randomNumbers[i-1])){
////			count++;
////		
////		}
////		
////		for(int i = 0; i< randomNumbers.length; i++){
////			System.out.print(randomNumbers[i] + " ");
////	}	System.out.printf("There are %d consecutive numbers", count);
////		}
////
////	
//
//
