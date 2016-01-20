import java.util.Scanner;

public class populationProjection {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of years:");
	double years = input.nextDouble();
	double seconds = years*365*24*60*60;
	int population = (int) (312032486 - seconds/13 + seconds/7 + seconds/45);
	System.out.println("the population in " + (int)years + "years is " + population);
	
	}

}
