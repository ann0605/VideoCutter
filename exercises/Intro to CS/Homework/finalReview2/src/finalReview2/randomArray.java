package finalReview2;
import java.util.Random;
public class randomArray {
	public static void main(String[] args){
		Random r = new Random(234);
		int[] randArray = new int[41]; //how many numbers in the array so for rand between 60 and 100, put in 41?
		for (int i = 0;i< randArray.length; i++){
			randArray[i] = r.nextInt(41) + 60;
			}
		for (int i = 0;i< randArray.length; i++){
			System.out.println(randArray[i]);
			}
		}
}
