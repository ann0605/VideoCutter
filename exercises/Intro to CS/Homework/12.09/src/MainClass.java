import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MainClass {
	
	public static void main(String[] args) throws IOException, FileNotFoundException{
		FileWriter myfile = new FileWriter("c:12.09/src/myfile.txt");
		PrintWriter writer = new PrintWriter(myfile);
		writer.println("Washington, George, 1789");
		writer.println("Fillmore, Millard, 1849");
		writer.println("Cleveland, Grover, 1893");

		writer.close();
		
		File infile = new File("src/sample.txt");
		Scanner input = new Scanner(infile);
		String buffer;
		String buffArray[];
		//dont want to declare the size of the buff array because we dont know what the file looks like
		// we could have put in more info into each line; have to redimension teh array with the correct number of elements every  time.
		
		while(input.hasNextLine()){
			buffer = input.nextLine();
			buffArray = buffer.split(",");
			System.out.println(buffArray[1]);
			//why are we sayinng buffArray length-1
			int k;
			for (int j = 2; j<=buffArray.length-1;j = j+3){
				k = j%3;
				
				System.out.println(buffArray[3]);
			}
			//delimitor to divide it into components
		}
		
		//
		//have to close the file so that they know when you are done writing to the file
	}//opening a file: other people can read it as well.
	//when you write to the file, no other person can view it.
	//buffer is an idea process things quickly. keep gettin information without the time to process it
	
}



