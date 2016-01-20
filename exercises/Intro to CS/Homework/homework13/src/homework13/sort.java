package homework13;
import java.util.ArrayList;
import java.util.Random;

public class sort {
	public static void main(String[] args){
		Random r = new Random(211);
		ArrayList<Number> list = new ArrayList<>();
		//populate the array
		for (int i = 0; i< 10; i++){
			list.add(r.nextInt(10));
			System.out.print(list.get(i) + " ");
		}
		
		sortArr(list);
		System.out.println();
		
		for (int i = 0; i< 10; i++){
			System.out.print(list.get(i) + " ");
		}
	}
public static void sortArr(ArrayList<Number> list){ // insertion sort from textbook
	for (int i = 1; i< list.size(); i++){
		int currElement = (int) list.get(i);
		int j;
		for(j = i - 1;j>=0 && (int)list.get(j)>currElement; j--){
			list.set(j+1, list.get(j));
		}
		list.set(j+1, currElement);
	}
	
		
	}
}
