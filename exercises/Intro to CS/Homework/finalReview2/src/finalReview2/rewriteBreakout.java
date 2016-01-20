package finalReview2;

public class rewriteBreakout {
	import processing.core.PApplet;
	public class Ball3 extends PApplet {
		private int xPos=100;
		private int yPos=100;
		private int xInc=10; //change this to  a very big num so that it bounces left and right more frequently than it bounces up and down 
		private int yInc=10;//change this to 0 as when it hits the side  it is going to decrease in size an deventually disappear
		private int nCols = 800;
		private int nRows = 400;
	              private  int  esize = 50;
		 
		public void setup(){
			size(nCols,nRows);	
			}
		
		public void draw(){
			if (xPos+esize+xInc>nCols || xPos+xInc<0){
				xInc = -xInc;
				esize-=10;
				fill(255, 0, 0);
			}
			else if(yPos+esize+yInc>nRows || yPos+yInc<0){
				yInc = -yInc;
				esize+=10;
				fill(0, 0, 255);
			}
			background(0);
			xPos += xInc; 
			yPos += yInc;
			ellipse(xPos,yPos,esize,esize);

			}
	}

}
