package midterm2Prep;

import java.util.Random;

public class MainStopWatch {
	public static void main(String[] args){
		double[] myArray = new double[100000];
		Random r = new Random(123);
		stopWatch myWatch = new stopWatch();
		System.out.println("the getter method's output is " + myWatch.getStartTime());
		myWatch.start();
		for (int i = 0; i< myArray.length; i++){
			myArray[i] = r.nextDouble();//myArray[i] = Math.random() *myArray.length
		}
		selectionSort(myArray);
		myWatch.stop();
	}
	public void selectionSort(double[] anArray){
		//selection sort copied off the solution
		for (int i = 0; i<anArray.length; i++){
			double currentMin = anArray[i];
			min = i;
		for (int j = i+1; j< anArray.length-1; j++){
			if(currentMin>anArray[j]){
				currentMin = anArray[j];
				min = j;
				}
			}
		if(min!= i){
			anArray[min] = anArray[j];
			anArray[i] = currentMin;
		}
		
		}

	}

}
