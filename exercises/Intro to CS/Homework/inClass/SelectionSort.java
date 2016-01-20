import java.util.Random;
public class SelectionSort {
	public static void main(String[] args){
		int[] numbers = new int[7];
		Random r = new Random(284);
		for (int i = 0; i<numbers.length; i++){
			numbers[i] = r.nextInt(9)+1;
			
		}
		PrintArray(numbers);
		int lowestInd;
		for (int i = 0; i<numbers.length-1; i++){
			lowestInd = i;
			for (int j = 0; j<numbers.length;j++){
				if(numbers[j]< numbers[lowestInd]){
					lowestInd = j;
				}
				int temp = numbers[lowestInd];
				numbers[lowestInd] = numbers[j];
				numbers[j] = temp;
			}
		
//			int temp = 0;
//			int min = myArray[i];
//			if (min>myArray[i+1]){
//				temp = myArray[i+1];
//				min = myArray[i+1];
//				myArray[i] = temp;
//			}
//		}
		System.out.print("\n");
		PrintArray(numbers);}
	}
	public static void PrintArray(int[] someArray){
		for (int i = 0; i<someArray.length; i++){
			System.out.print(someArray[i] + " ");
		}
		
		
	}

}
