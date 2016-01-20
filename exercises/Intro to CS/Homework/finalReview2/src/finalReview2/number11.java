package finalReview2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class number11 {
	public static void main(String[] args) throws FileNotFoundException{
		File theFile = new File("/Users/AnnDang/Documents/Scrabble.txt");
		Scanner rdr = new Scanner(theFile);	
		int count= 0;
		while (rdr.hasNextLine()){
			count++;
			rdr.nextLine(); //iterates through the next line
		}
		rdr.close();
		String[][] students = new String[count][3];
		rdr = new Scanner(theFile); //get the actual information
		String line;
		count = 0;
		while (rdr.hasNextLine()){
			line = rdr.nextLine();
			students[count] = line.split(",");// line.splite returns a single dinmensioanl array of strings
			count++;
		}
		getHighAverage(students);
		for (int i = 0; i < students.length; i++)
		{
			for (int j = 0; j < students[i].length; j++)
			{
				System.out.print(students[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void getHighAverage(String[][] inVal){
		int average = 0;
		int maxAverage = 0;
		int sum = 0;
		int row = 0;
		for (int r = 0; r< inVal.length; r++){
			for (int c = 1; c< inVal[r].length; c++){
				sum += Integer.parseInt(inVal[r][c]);
			}
			average = sum/3;
			if (average>maxAverage){
				maxAverage = average;
				sum = 0;
				average = 0;
				row = r;
			}
		}
		System.out.println(inVal[row][0] + ": " + maxAverage);
	}

}
