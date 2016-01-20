package breakOut;

public class example extends PApplet {
	private boolean blocks[][] = new oolean[10][4]; //does the bloc exist
	//MOVEMENT OF THE BLOCKS
	public void draw(){
		int nextPos;
		background(255);
		nextXpos = xPos + clocks[0].length * 80 + dx;
		if (nextXpos>nCols){
			dx = -dx; // manaing the movement of the blocks horizontally
			yPos +=dy;
		}
		else if(xPose+dx< 0){
			dx = -dx;
			yPos+=dy;
		}
		xPos+=dx;
	}
	//DRAWING THE BLOCKS
	public void drawBlocks{
		for (int i = 0;i<blocks.length;i++ ){
			for (int j = 0;j< blocks[i].length; j++){
				if(!blocks[i][j])
			}
		}
		
		//bricks, base and the missile
		//CHECK FOR COLLISION
		public void checkCollisions(){
			int middle_x, muddle_y;
			for(int i = 0; i< blocks.length; i++){
				for (int j = 0; j< blocks[i].length; j++){
					if(!blocks[i][j]){
						//FIND THE MIDDLE OF THE BRICK
						middle_x = i*80+xPos+38;
						middle_y = j*20+yPos+8
					}
					if(abs(m_xPos - middle_x) < 40 && abs(m_yPos-middle_y) < 10){
						fire = false
					}
				}
			}
		}
		
		public void keyPressed(){
			if (keyCode == RIGHT){
				if(!fired){m_xPos+=2;}
				b_xPos += 2;
			}
			else if (keycode ==)
		}
	}
}
