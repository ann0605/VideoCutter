package classes;
import java.util.Random;
public class hw7 {
	public static void main(String[] args){
	Car[] cars = new Car[10]; // array with 10 instances of a class "Car"
	String colors[] = { "blue", "red", "white", "yellow"};
	String makes[] = {"BMW", "Jaguar", "Bentley", "Toyota"};
	Random r =  new Random(123);

	for (int count = 0; count<cars.length; count++){
		cars[count] = new Car();
		cars[count].setColor(colors[r.nextInt(3)]);
		cars[count].setMake(makes[r.nextInt(3)]);
		cars[count].setSpeed(0);
		if(count<(cars.length)/2){
			cars[count].setYear(r.nextInt(9)+2000);
		}
		else {
			cars[count].setYear(r.nextInt(100)+2010);
		}
	}
	for (int i = 0; i<100; i++){
		int minutes = 0; int distance = 0; int currentSpeed = 0;
		int carRand = r.nextInt(9);
		int flag = r.nextInt(3);
		if (flag == 1)
			cars[carRand].accelerate();
		else if(flag == 2)
			cars[carRand].brake();
		else 
			cars[carRand].stop();
		currentSpeed = cars[carRand].getSpeed();
		minutes++;
		
	}
	
	for (int count = 0; count< cars.length; count++){
		System.out.println("The car is a "+ cars[count].getYear() + " " + cars[count].getColor() +  " " + cars[count].getMake() + " with speed " +  cars[count].getSpeed());
	}
	
	int carRand = 0;
	int[] distance = new int[10];
		while (distance[carRand]<100){
			carRand = r.nextInt(9);
			int flag = r.nextInt(3);
			if (flag == 1)
				cars[carRand].accelerate();
			else if(flag == 2)
				cars[carRand].brake();
			else 
				cars[carRand].stop();
			distance[carRand] += cars[carRand].getSpeed()/60;
		}
		System.out.println("The winner is " + cars[carRand].getMake() + " with distance "+ distance[carRand]);
		for (int i = 0; i< 9; i++){
			int indexOfMax = 0;
			for (int j = 1; j< cars.length; j++){
		if (distance[j]> distance[indexOfMax]){
				indexOfMax = j;
		}
		
		}
			String maxCar = cars[indexOfMax+1].getMake();
			
			System.out.println("The next winner is " + maxCar + " with distance " + distance[indexOfMax]);
			distance[indexOfMax] = 0;
		
	
	
		
		} 
	}
} 