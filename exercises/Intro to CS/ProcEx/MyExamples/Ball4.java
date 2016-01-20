
import processing.core.PApplet;

public class Ball4 extends PApplet {


	private int xPos;
	private int yPos;
	private int nCols = 800;
	private int nRows = 400;

	public void setup(){
		// code in setup is only done once
		size(nCols,nRows);
	}// end setup

	public void draw(){
		
		// clear background before drawing next ball position
		background(0);
		
		// move ball from last position before drawing
		xPos++;
		yPos++;

		ellipse(xPos,yPos,25,25);
	}// end draw

}// end class Ball4
