package breakOutHw;
import java.awt.Color;
public class Block {
	
	private int xPos;
	private int yPos;
	private boolean contact;
	//how big is the window
	private Color blockColor;
	public static int length = 60;
	public static int height = 20;
	public static int origin = 30;
	public Block(Color inColor, int i, int j){ // i = num of rows
		this.blockColor = inColor;
		this.xPos = origin+(10+length)*j;
		this.yPos = origin+(10+height)*i;
		contact = false;
		
	}
	public void setX(int inValue){
		xPos = inValue;	
	}
	
	public int getX(){
		return xPos;
	}
	
	public void setY(int inValue){
		yPos = inValue;	
	}
	
	public int getY(){
		return yPos;
	}
	
	public int getColor(){
		return blockColor.getRGB();
	}
	
	public boolean getContact(){
		return contact;
	}
	
	public void setContact(boolean input){
		contact = input;	
	}
}

