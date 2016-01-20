package tutorialExamples;
import processing.core.*;
 
// Learning Processing
// Daniel Shiffman
// http://www.learningprocessing.com

public class MoreProc extends PApplet {

	// Example 3-5: mousePressed and keyPressed
	public void setup() {
	  size(200,200);
	  background(255);
	}

	public void draw() {
	 // Nothing happens in draw() in this example!
	// but still need it to be called to display the canvas 
	// with rects on it
	}

	// Whenever a user clicks the mouse the code written inside mousePressed() is executed.
	public void mousePressed() {
	  stroke(0);
	  fill(175);
	  rectMode(CENTER);
	  rect(mouseX,mouseY,16,16);
	}

	// Whenever a user presses a key the code written inside keyPressed() is executed.
	public void keyPressed() {
	  background(255);
	}

}
