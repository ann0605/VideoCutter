package tutorialExamples;

import processing.core.PApplet;

public class DrawLineWithMouse extends PApplet{


	public void setup() {
		size(400,400);
		background(0);
	}

	public void draw() {
		
		stroke(255);
		if (mousePressed) {
			line(mouseX,mouseY,pmouseX,pmouseY);
		}
	}
}


