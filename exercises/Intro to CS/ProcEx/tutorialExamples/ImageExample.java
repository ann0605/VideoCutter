package tutorialExamples;

import processing.core.*;

public class ImageExample extends PApplet {
	
	// Declaring a variable of type PImage
	PImage img;	

	public void setup() {
	  size(400,400);
	  // Make a new instance of a PImage by loading an image file
	  //img = loadImage("/Users/berger/Documents/java101_workspace/ProcessingProjects/src/tutorialExamples/data/myPic.jpg");
	  img = loadImage("/Users/berger/Documents/java101_workspace/ProcessingProjects/src/tutorialExamples/data/IMG_1137.JPG");
	}

	public void draw() {
	  //background(0);
	  // Draw the image to the screen at coordinate (0,0)
	  image(img,0,0,400,400);
	}

}
