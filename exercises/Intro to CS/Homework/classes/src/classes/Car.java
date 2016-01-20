package classes;

public class Car {
	private String make;
	private int year;
	private String color;
	private int speed;
	public Car(){
		
	}
	public String getMake(){
		return make;
	}
	public void setMake(String invalue){
		make = invalue;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int inyear){
		year = inyear;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String incolor){
		color = incolor;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int inspeed){
		speed = inspeed;
	}
	public void accelerate(){
		if (year < 2010){
			speed +=15;
		}
		else if(year>=2010){
			speed+=20;
		}
	}
	public void brake(){
		if(speed>0){
			if (year<2010){
				speed-=5;	
			}
			else if(year>=2010){
				speed -=10;
			}
		}
	}
	public void stop(){
		speed = 0;
	}
}
