
import processing.core.PApplet;

public class Ball2 extends PApplet {

    private int ncols = 800;
    private int nrows = 500;
    
	public void setup(){
		// code in setup is only done once
		size(ncols,nrows);
	}// end setup

	public void draw(){
		int xPos = (int) (Math.random()*ncols);
		int yPos = (int) (Math.random()*nrows);

		ellipse(xPos,yPos,25,25);
	}

}// end class Ball2
