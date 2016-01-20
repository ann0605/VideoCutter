/**
 * Generates dynamic arcs originating from random locations and terminating at the mouse position.
 * 
 * @author Foo Barstein
 * @version 1.0
 */

package tutorialExamples;

import processing.core.*; //The core.jar file from the Processing library must have been added to your build path for this to work.

//Processing sketches must extend the PApplet class.
public class RandomCurves extends PApplet {

	//window dimensions
	int windowWidth = 600;
	int windowHeight = 600;
	int numberOfCurves = 50;
	
	//member variables that will hold each curve's origin.
	float[][] originPoints = new float[numberOfCurves][2];

	//member variables that will hold the curves' contorl points
	float[][] controlPoints1 = new float[numberOfCurves][2];
	float[][] controlPoints2 = new float[numberOfCurves][2];
	
	/**
	 * Automatically called when the Processing sketch first starts.  
	 */
	public void setup() {
		size(windowWidth,windowHeight); 		//set the window dimensions
		background(0, 0, 0); 	//set the background color to RGB values betwen 0-255
		smooth(); //generate smooth lines
		
		//generate random origins for each curve
		for (int i=0; i<numberOfCurves; i++) {
			originPoints[i][0] = random(0, width);
			originPoints[i][1] = random(0, width);
		}
		
		//generate control points for each curve
		for (int i=0; i<numberOfCurves; i++) {
			//get a random set of x,y control points
			controlPoints1[i][0] = random(0, width);
			controlPoints1[i][1] = random(0, height);

			//get another random set of x,y control points
			controlPoints2[i][0] = random(0, width);
			controlPoints2[i][1] = random(0, height);
			
		}
		
	} //setup

	/**
	 * Automatically called continuously while the program is running.
	 */
	public void draw() {
		background(0, 0, 0); 	//set the background color to RGB values betwen 0-255
		noFill();
		stroke(255, 255, 255);
		for (int i=0; i<numberOfCurves; i++) {
			curve(controlPoints1[i][0], controlPoints1[i][1], originPoints[i][0], originPoints[i][1], mouseX, mouseY, controlPoints2[i][0], controlPoints2[i][1]);
		}
		
	} //draw

	/**
	 * Automatically called every time the mouse moves.  
	 * Used to generate arcs
	 */
	public void mouseMoved() {
		
		
	}
} //class
