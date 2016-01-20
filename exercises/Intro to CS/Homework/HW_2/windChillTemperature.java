import java.util.Scanner;

public class windChillTemperature {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the temperature in Fahrenheit between - 58 and 41: ");
		double temperature = input.nextDouble();
		System.out.println("Please enter the wind speed(>=2) in miles per hour: ");
		double windSpeed = Math.pow(input.nextDouble(), 0.16);
		double windChillTemp = 35.74 + 0.6215*temperature - 35.75 * windSpeed + 0.4275 * temperature * windSpeed;
		System.out.printf("The wind chill index is %f",windChillTemp );
		}
	

}
