package homework13;
import java.lang.Math;
//https://github.com/jzacsh/edu-271/blob/master/src/homework/0222/Circle.java
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side;
	public Octagon(){
		
	}
	public Octagon(double side){
		this.side = side;
	}
	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		if (this.getArea()>o.getArea()){
			return 1;
		}
		else if (this.getArea()<o.getArea()){
			return -1;
		}
		else
			return 0;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2+4*Math.sqrt(2) * side * side);
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*8;
	}
	public Octagon clone() {
		try {
			return (Octagon)super.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

}
