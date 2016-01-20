import java.util.Random;

public class frequencyArray {
	public static void main(String[] args){
		int[] numbers = new int[7];
		int[] freq;
		freq = new int[9];
		Random r = new Random(284);
		for (int i = 0; i<numbers.length; i++){
			numbers[i] = r.nextInt(9)+1;
		PrintArray(numbers);
		for (int j = 0; j< numbers.length;j++){
			freq[numbers[j]-1]++;
					//the element value of one array is the index for the other
		}
		}
	
			}
	public static void PrintArray(int[] list){
		for (int i = 0;i<list.length; i++){
			System.out.print(list[i]);
		}
	}
	

}
