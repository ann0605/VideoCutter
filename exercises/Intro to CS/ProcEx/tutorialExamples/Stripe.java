package tutorialExamples;

import processing.core.PApplet;

public class Stripe {
  float x;       // horizontal location of stripe
  float speed;   // speed of stripe
  float w;       // width of stripe
  boolean mouse; // state of stripe (mouse is over or not?)
  PApplet parentCanvas; // The canvas of the parent PApplet that we will render ourselves onto

  Stripe(PApplet p) {
    parentCanvas = p;
    x = 0;              // All stripes start at 0
    speed = parentCanvas.random(1);  // All stripes have a random positive speed
    w = parentCanvas.random(10,30);
    mouse = false;
  }

  // Draw stripe
  void display() {
     //parentCanvas.fill(255,100); // fill with gray, last arg is transparency
    parentCanvas.fill(255,200,200,55); // fill with pink, same transparency
    // stroke == draw outline of shape
    parentCanvas.noStroke(); 
    // draw rect on the canvas starting at x,0, for specified width and height
    parentCanvas.rect(x,0,w,parentCanvas.height);  
  }

  // Move stripe
  void move() {
    x += speed;
    if (x > parentCanvas.width+20) x = -20;
  }
}