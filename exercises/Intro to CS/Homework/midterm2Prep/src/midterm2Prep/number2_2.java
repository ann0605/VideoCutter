package midterm2Prep;

import java.util.Arrays;

public class number2_2 {
	public static void main(String[] args){
		int[] trial = {1,100,2,3,4};
		bubbleSort(trial);
		for(int i = 0 ; i < trial.length; i++) {
			System.out.print(trial[i]);
		}
		
		
	}
	public static void bubbleSort(int[] anArray){
		for (int i = 0; i< anArray.length-1; i++){
			if (anArray[i]>anArray[i+1]){
//				int min = anArray[i+1]; don't need min cause you only need to swap the numbers
				int temp = anArray[i];
				anArray[i] = anArray[i+1];
				anArray[i+1] = temp;
			}
		}
		
		
	}
	public static void selectionSort(int[] anotherArray){
		for (int i = 0; i< anotherArray.length-1;i++){
			int max =i;
			for (int j = i+1; j< anotherArray.length-i; j++){
				if(anotherArray[j]> anotherArray[i]){
					max = j;
				}
				
			}
			
			
			
		}
		
	}
			
}
