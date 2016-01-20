import java.util.Random;

public class lect9 {
	public static void main(String[] args){
		int numbers[] = new int[7];
		Random r = new Random(274);
		for(int i = 0; i< numbers.length; i++){
			numbers[i] = r.nextInt(9)+1;
		}
		PrintArray(numbers);
		int temp;
		boolean sortSwitch = true;
		//Bubble Sort;
		while (sortSwitch){
		sortSwitch = false;
		for (int i = 0; i< numbers.length-1; i++){
			if(numbers[i] > numbers[i+1]){
				temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				sortSwitch = true;
			}
			
		}
	}
		System.out.print("\n");
		PrintArray(numbers);
		
	}
	int consec = 0;
	public static void PrintArray(int[] myArray){
		for (int i = 0; i< myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
	}

}
