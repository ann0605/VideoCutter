import java.util.Random;
public class multArrays {
	
	//array within an array
	//same data type new int[row][columns]
	//can have different number of columns
public static void main(String[] args){
 Random r = new Random(123);
 int[][] list = new int[10][10];
 for (int i = 0; i<list.length; i++){
	 for (int j = 0; j< list[i].length; j++){
		list[i][j] = r.nextInt(10) + 1;
	 }
 	}
 PrintMultArray(list);
 }
public static void PrintMultArray(int[][] list){
	for (int i = 0; i<list.length; i++){
		for (int j = 0; j< list[i].length;j++){
			System.out.print(list[i][j] + "\t");
		}
		System.out.println("");
		
	}
}
}

