package prject1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class attempt1 { //this is like the Collision Info 
	private ArrayList<Collision> collisionList = new ArrayList<Collision>(); // replaced all the lists with one arraylist

	public attempt1(){
		
	}
	public
	public void readData(File inData) throws Exception {
		//need to throw an exception / an error when there is like no cammand line argument
		
		//create a File object to read in the text file
		inData  = new File(args[0]);
			
			//File fileCapitals = new File (args[0]); <-- what does this do ?
			//what is the difference between File(args[0]) and just putting in
			//the file name???

 		//complete the exception throwing
		if (!inData.exists()|| !inData.canRead()){
			System.err.printf("ERROR: file %s does not exist", args[0]);
			System.exit(1);
		}
		
		//create a scanner to read the object
		//Scanner input = new Scanner(file);
		
		//read data from the input file
//		ArrayList<String> bus = new ArrayList<String>();
//		ArrayList<String> bicycle = new ArrayList<String>();
//		ArrayList<String> fireTruck = new ArrayList<String>();
//		ArrayList<String> ambulance = new ArrayList<String>();
		Scanner input = new Scanner(inData);
		//create a Collision object here
		Collision collisionInfo;
		input.nextLine(); // start with the second line
		while(input.hasNextLine()){
			
			String line = input.nextLine();
			//split by lines first and then we can split each line by data?
			String [] data = line.split(",");// not sure what his does
			//if the line does not contain enough values, ignore it
			if (line.length() < 21) continue;
			//how to check if filename is ommited from the command line? --> determine what a command line is first
			// if 
			//Integer [] zip = line.split(",");
			
			// getting the correct data below/ reading the input file 
			int zipCode = Integer.parseInt(data[3]);	
			int cyclistAccident = Integer.parseInt(data[12]);
			int cyclistDeath = Integer.parseInt(data[13]);
			int injuries = Integer.parseInt(data[8]);
			String vehicleType = data[19];
			String vehicleType2 = data[20];
			collisionInfo = new Collision(zipCode,cyclistAccident, cyclistDeath, injuries, vehicleType, vehicleType2);
			//create objects of collisions and add them to a list
			
			collisionList.add(collisionInfo);
//			
		}
		
		input.close();
		
	}
	

}
