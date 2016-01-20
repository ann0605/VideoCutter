

import processing.core.PApplet;

public class Ball5 extends PApplet {

	private int xPos;
	private int yPos;
	private int nCols = 1000;
	private int nRows = 400;
	int yInc = 1;  // increasing yPos moves ball down

	public void setup(){
		// code in setup is only done once
		size(nCols,nRows);
	}// end setup
	

	public void draw(){
		
		// clear background before drawing next random ball
		background(0);
		
		// does ball move up or down
		xPos ++;
		
		if (yPos+25 >= nRows){// accounts for size of ball
			yInc = -yInc; // travels in other direction	
	     }
		yPos += yInc;
		
		ellipse(xPos,yPos,50,50);
	}// end draw

}// end class Ball5
