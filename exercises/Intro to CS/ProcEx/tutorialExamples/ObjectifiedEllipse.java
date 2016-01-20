/**
 * Example of creating a custom shape class in Processing and instantiating it.  
 * 
 * @author Foo Barstein
 * @version 1.0
 */

package tutorialExamples;

import processing.core.*;

public class ObjectifiedEllipse extends PApplet {

	//instance variables to hold the ellipse's state
	/**
	 * an array to hold a group of custom Ball objects.
	 */
	Ball[] balls;


	/**
	 *  Automatically run when program starts.
	 *  Notice that we use the public modifier, which is not included when writing code within the Processing IDE.
	 */
	public void setup() {
		size(400, 400);
		background(255, 0, 255);

		//create a collection of Ball objects
		balls = new Ball[20];
		for (int i=0; i<balls.length; i++) {
			//automatically generate a Ball object with a random position, dimensions, and speed
			//notice the first argument to the constructor is a reference to this PApplet class... this is necessary when using Processing from within Eclipse.
			balls[i] = new Ball(this, (int) random(width), (int) random(height), (int) random(50), (int) random(50), (int) random(10), (int) random(10) );
		}

	} //setup

	/**
	 *  Automatically called continuously while the program is running.
	 *  Notice that we use the public modifier, which is not included when writing code within the Processing IDE.
	 */
	public void draw() {

		if (mousePressed) {
			//if the mouse is being pressed, place all the balls at the mouse position
			for (int i=0; i< balls.length; i++) {
				balls[i].updatePosition(mouseX, mouseY);
			}
		}
		else {
			//otherwise, have each Ball update its own position automatically
			for (int i=0; i< balls.length; i++) {
				balls[i].updatePosition();
			}
		}  

		//wipe the window clean
		background(255, 0, 255);      

		//have each ball draw itself to the screen
		for (int i=0; i< balls.length; i++) {
			balls[i].show();
		}

	} //draw

} //class ObjectifiedEllipse


/**
 * 
 * @author Foo Barstein
 * Class used to create a single Ball object.
 * Note that the constructor accepts a reference to the parent PApplet object... this is necessary when using Processing from within Eclipse
 *
 */
 class Ball {

	/**
	 * A reference to the parent PApplet object (the main Processing sketch object) that instantiated this Ball
	 */
	PApplet parent;

	/**
	 * the current x position of the Ball
	 */
	int xPos = 0;

	/**
	 * the current y position of the Ball
	 */
	int yPos = 50;

	/**
	 * the width of the Ball
	 */
	int ballWidth = 50;

	/**
	 * the height of the Ball
	 */
	int ballHeight = 50;

	/**
	 * the current speed of the Ball in the x horizontal direction
	 */
	int speedX = 10;

	/**
	 * the current speed of the Ball in the y vertical direction
	 */
	int speedY = 10;


	/**
	 * Constructor to create a Ball object
	 * @param p PApplet reference to the parent object that instantiated this Ball
	 * @param x integer x position
	 * @param y integer y position
	 * @param w integer width
	 * @param h integer height
	 * @param sX integer speed in the x direction
	 * @param sY integer speed in the y direction
	 */
	Ball(PApplet p, int x, int y, int w, int h, int sX, int sY) {
		//set the object's instance properties to match the arguments supplied to the constructor
		parent = p;
		xPos = x;
		yPos = y;
		ballWidth = w;
		ballHeight = h;
		speedX = sX;
		speedY = sY;

	}

	/**
	 * Update the Ball's position automatically. If the Ball is out of bounds, reverse its direction by inverting the speed property.
	 */
	void updatePosition() {

		//update x position
		xPos = xPos + speedX;
		//notice that we have to refer to the parent in order to get the screen width... this is necessary when working with Processing from within Eclipse.
		if (!isInBounds(xPos, parent.width)) {
			speedX = -1 * speedX;
		}

		//update the y position
		yPos = yPos + speedY;
		//notice that we have to refer to the parent in order to get the screen height... this is necessary when working with Processing from within Eclipse.
		if (!isInBounds(yPos, parent.height)) {
			speedY = -1 * speedY;
		}

	}

	/**
	 * Overloaded method to update the Ball's position to a specific x,y coordinate.
	 * @param x int representing the x coordinate
	 * @param y int representing the y coordinate
	 */
	void updatePosition(int x, int y) {
		xPos = x;
		yPos = y;
	}

	/**
	 * Check to see that the Ball is within a given range of values.
	 * @param pos integer holding the current x position of the ellipse
	 * @param limit integer holding the maximum allowable x position of the ellipse
	 * @return boolean indicating whether the current position is within bounds or not. 
	 */
	boolean isInBounds(int pos, int limit) {
		if (pos > limit) {
			return false;
		}
		else if (pos < 0) {
			return false;
		}
		else {
			return true;
		}

	} //isInBounds

	/**
	 * Draw the Ball to the parent PApplet's screen.
	 */
	void show() {
		//notice that we have to refer to the parent in order to create a shape on the screen... this is necessary when working with Processing from within Eclipse.
		parent.ellipse(xPos, yPos, ballWidth, ballHeight);  
	}

} //end class






