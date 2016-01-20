import processing.core.PApplet;
import processing.core.PImage;

public class Ball1 extends PApplet {

	private int xPos = 250;
	private int yPos = 250;
	private int nCols = 1000;
	private int nRows = 500;

	public void setup(){
		// code in setup is only done once

		size(nCols,nRows);
		
		ellipse(xPos,yPos,25,25);
	}// end setup

	public void draw(){
		// nothing to be done 60 times/second
		  
	}

}// end class Ball1
