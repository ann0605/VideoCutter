
import processing.core.PApplet;

public class Ball3 extends PApplet {


	private int xPos;
	private int yPos;
	private int ncols = 800;
	private int nrows = 500;

	public void setup(){
		// code in setup is only done once
		size(ncols,nrows);
	}// end setup

	public void draw(){
		
		// clear background before drawing next random ball
		// 0 = black, 255 = white
		background(100);
		
		xPos = 400; yPos = 200;
		RecursiveEllipse(300);

	}
	
	public void RecursiveEllipse(int size){
		fill(r.nextInt(255), r.nextInt(255), r.nextInt(255));
		ellipse(xPos, yPos, size, size);
		if (size<10){ return;}
		RecursiveEllipse(size-10);
	}

}// end class Ball3
