package tutorialExamples;

import processing.core.*;

public class MultipleClassesWithStripes extends PApplet {
  //	An array of stripes
  Stripe[] stripes = new Stripe[50];
  boolean timeToEnd = false;

  public void setup() {
    size(500,500);
    // Initialize all "stripes"
    for (int i = 0; i < stripes.length; i++) {
      stripes[i] = new Stripe(this);
    }
  }

  public void draw() {
    background(100);
    // Move and display all "stripes"
    for (int i = 0; i < stripes.length; i++) {
      stripes[i].move();
      stripes[i].display();
      
      if (mousePressed){
    	  //System.exit(0);
    	  //frame.setVisible(false);
      }
    }
  }// end draw
  
 
}// end