import java.util.Scanner;
public class exercise6_5 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number:");
		double number1 = input.nextDouble();
		System.out.print("Enter the second number:");
		double number2 = input.nextDouble();
		System.out.print("Enter the third number:");
		double number3 = input.nextDouble();
		displaySortedNumbers(number1, number2, number3);
		
		
	}
	public static void displaySortedNumbers(double num1, double num2, double num3){
		double[] myDArray = new double[3];
		double temp = 0;
		myDArray[0] = num1;
		myDArray[1] = num2;
		myDArray[2]= num3;
			for (int i = 0; i< 3; i++){
				for (int j = 0; j<2; j++){
					if (myDArray[j]>myDArray[j+1]){
							temp = myDArray[j];
							myDArray[j] = myDArray[j+1];
							myDArray[j+1] = temp;
					}
				}	
			}
			for(int k = 0; k< 3; k++){
				System.out.println(myDArray[k]);
				}
		
	}
}
