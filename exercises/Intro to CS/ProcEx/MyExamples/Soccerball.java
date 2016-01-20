
import processing.core.PApplet;
import processing.core.PImage;

public class Soccerball extends PApplet {

	PImage photo;
	final int NROWS = 500;
	final int NCOLS = 300;
	int xloc = 20;
	int yloc = 50;
	int xinc = 1;
	int yinc = 1;
	int ballsizex = 80;
	int ballsizey = 80;

	public void setup(){
		// code in setup is only done once
		size(NCOLS,NROWS);
		
	    photo = loadImage("data/soccerball.jpg");
	}// end setup

	public void draw(){
		 // use white background to  hide soccer ball background
		background(255);
		
		xloc += 5*xinc;
		yloc += yinc;
		
		image(photo,xloc,yloc,ballsizex,ballsizey);
		
		if ((xloc +ballsizex >= NCOLS) || (xloc<0))
		      xinc = -xinc;
		if ((yloc+ballsizey >= NROWS) || (yloc<0))
	          yinc = -yinc;
	}

}// end class Soccerball
