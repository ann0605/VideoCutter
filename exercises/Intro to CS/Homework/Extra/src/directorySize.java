import java.io.File;
import java.util.Scanner;
public class directorySize {
	public static void main(String[] args){
	System.out.print("Enter a directory or a file");
	Scanner input = new Scanner(System.in);
	String directory = input.nextLine();
	System.out.println(getSize(new File(directory) +"bytes"));//the recursive method
}
public static  lng getSize(File file){
	long size = 0;
	if(file.isDirectory()){
		File[] files = file.listFiles(); //all the files and subdirectories
		for(int i = 0; files !=null && i< files.length;i++){
			size+=getSize(files[i]);
		}
	}
	else{
		size+=file.length();
	}
	
	return size;}}
