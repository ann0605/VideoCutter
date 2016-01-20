import java.util.Scanner;
public class compareCosts {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1: ");
		double weight_1 = input.nextDouble();
		double price_1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2: ");
		double weight_2 = input.nextDouble();
		double price_2 = input.nextDouble();
		double package1 = weight_1 * price_1;
		double package2 = weight_2 * price_2;
		if (package1>package2){
			System.out.println("Package 2 has a better price.");
		
		}
		else
			System.out.println("Package 1 has a better price.");
		
		
		
		
	}

}
