package checkerboard;
import processing.core.PApplet;
import java.util.Random;
public class example extends PApplet{
	
	private int xPos = 100;
	private int yPos = 100;
	private int ncols = 800;
	private int nrows = 500;
	private Random r = new Random(2302);
	private int squaresize = 50;
	public void setup(){
	//what does setup do?
		size(ncols, nrows);
	
	}//make each square its own class -- and create an array of squares
	public void draw(){
		
		boolean redflag = true;
		for (int i = 1; i<=8;i++){
			for (int j = 1; j<=8; j++){
				if(redflag){
					fill(255, 0, 0);
				}
				else{
					fill(0, 0, 0);
					}
				rect(xPos+(i*20), yPos+(j*20), 20, 20);//the j is the inside loop whcich means the y posiitno gets changed and the board is drawn by columns
				redflag = !redflag;
			}
			redflag = !redflag;
		}
	}
		
	public void mouseClicked() {
		
		System.out.println(mouseX + "-" + mouseY);
		
	}
	public void keyPressed(){
		if(keyCode==UP){yPos-=1;}
		if(keyCode==RIGHT){xPos+=1;}
	}
			
}
