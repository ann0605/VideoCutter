package breakOutHw;
import processing.core.PApplet;
import java.awt.Color;
import java.util.Random;

public class mainClass extends PApplet {
	private int ncols = 800;
	private int nrows = 600;
	private int m_xPos, m_yPos; // the platform
	private int b_xPos, b_yPos; //the missile 
	private Block blockArray[][] = new Block[4][8];
	private Random r = new Random(2301);
	int dx = 1;
	int dy = 1;
	boolean fired;
	int counter;
	public void setup(){ // setup is like a constructor
		counter = 32; 
		size(ncols, nrows);
		fired = false;
		b_xPos = ncols/2;
		b_yPos = nrows - 100;
		m_xPos = b_xPos + 20;
		m_yPos = b_yPos - 5;
		//setup stores information about the array 
		for (int i = 0; i< blockArray.length; i++){
			Color blockColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
			for (int j = 0; j< blockArray[i].length; j++){
				
				blockArray[i][j]= new Block(blockColor, i, j);
				
			}
		}
	}
	
	public void draw(){
		int xPos;
		int yPos;
		
		background(255, 255, 255);
		if ((blockArray[3][7].getY() + Block.height)< b_yPos){
			for (int i = 0; i< blockArray.length; i++){
				fill(blockArray[i][0].getColor());
				for (int j = 0; j< blockArray[i].length; j++){
					xPos = blockArray[i][j].getX();
					yPos = blockArray[i][j].getY();
					if (!blockArray[i][j].getContact()){
						rect(xPos, yPos, Block.length, Block.height);
						}
					}
				}
			
			int rSide = blockArray[3][7].getX() + Block.length+10 + dx;
			int lSide = blockArray[0][0].getX() + dx;
			if(rSide>=ncols || lSide<=0){
				dx = -dx;
				downMove(dy);
				dy+=2;
			}
			else{
				sideMove(dx);
			}
			rSide = 0;
			lSide = 0;
			fill(Color.cyan.getRGB());
			check_Collisions();
			if (m_yPos<10) { 
				fired = false;
				m_xPos = b_xPos + 20; m_yPos = b_yPos-10;
			}
			if (fired) {
				m_yPos -=4;
				ellipse(m_xPos,m_yPos,10,10);
			} else {
				ellipse(m_xPos,m_yPos,10,10);
			}
			
			fill(Color.BLACK.getRGB());
			rect(b_xPos,b_yPos,40,10 );
			
		}
		else{
			textSize(32);
			fill(Color.lightGray.getRGB());
			text("YOU LOSE!", ncols/2-80, nrows/2);
		}
		 
	}
	
		public void sideMove(int dx){
			for (int i = 0; i< blockArray.length; i++){
				for (int j = 0; j< blockArray[i].length; j++){
					int currPos = blockArray[i][j].getX();
					blockArray[i][j].setX(currPos+dx);
				}
			}
		}
			public void downMove(int dy){
				for (int i = 0; i< blockArray.length; i++){
					for (int j = 0; j< blockArray[i].length; j++){
						int currPos = blockArray[i][j].getY();
						blockArray[i][j].setY(currPos+dy);
					}
			}
	}
	
			public void mouseClicked(){
				// nothing to be done 60 times/second
				  	 
			}
			public void keyPressed(){
				// nothing to be done 60 times/second
				System.out.println(keyCode);
				 
				    if (keyCode == RIGHT) {
				     if (!fired) { m_xPos +=10;}
				      b_xPos +=10;
				    } else if (keyCode == LEFT) {
				    	if (!fired) {m_xPos-=10;}
				    	b_xPos -=10;
				    } 
				    if (keyCode == UP || keyCode == 32) { //added a spacebar for ease of play
				    	fired = true;
				    }
			 
			}
			
			public   void check_Collisions() {
				int middle_x, middle_y;
				for (int i = 0; i<blockArray.length;i++) {
					for (int j = 0; j< blockArray[i].length;j++) {
						if (!blockArray[i][j].getContact()) {
							middle_x = (blockArray[i][j].getX()+Block.length/2);
							middle_y = (blockArray[i][j].getY()+Block.height/2);
							if (abs(m_xPos - middle_x) < 30 &&
							    abs(m_yPos - middle_y) < 8 ) {
									fired = false;
									m_xPos = b_xPos + 20;
									m_yPos = b_yPos-5; //reset to back above the base
									blockArray[i][j].setContact(true);
									counter--;
							}
						}
					}
				}
				if (counter == 0){
					textSize(64);
					fill(Color.lightGray.getRGB());
					text("YOU WIN!", ncols/2-100, nrows/2);
				}
				
			}
	
}
