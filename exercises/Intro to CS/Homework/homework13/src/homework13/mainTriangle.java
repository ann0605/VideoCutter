package homework13;
import java.util.Scanner;
public class mainTriangle {
	public static void main(String[] args){
		boolean filled = false;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length of side:");
		double sideA = input.nextDouble();
		System.out.println("Please enter the length of side:");
		double sideB = input.nextDouble();
		System.out.println("Please enter the length of side:");
		double sideC = input.nextDouble();
		System.out.println("Please enter the color:");
		String color = input.nextLine();
		if (color!= null){
			filled = true;
		}
		
		Triangle testTriangle = new Triangle(sideA, sideB, sideC, color, filled);
		System.out.println("The color of the triangle is " + testTriangle.getColor());
		System.out.println("The area is: " + testTriangle.getArea());
		System.out.println("The perimeter is " + testTriangle.getPerimeter());
	}

}
