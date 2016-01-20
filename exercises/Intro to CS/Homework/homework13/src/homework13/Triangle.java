package homework13;
import java.lang.Math;

public class Triangle 
	extends GeometricObject{
private double sideA;
private double sideB;
private double sideC;
private double height;

public Triangle(double sideA, double sideB, double sideC, String color, boolean filled){
	this.sideA = sideA;
	this.sideB = sideB;
	this.sideC = sideC;
	setColor(color);
	setFilled(filled);
}

public double getSideA(){
	return sideA;
}
public double getSideB(){
	return sideB;
}
public double getSideC(){
	return sideC;
}
public double getHeight(){
	return height;
}


@Override// 
public double getArea() {
	// TODO Auto-generated method stub
	double perimeter = this.getPerimeter()/2;
	return Math.sqrt(perimeter *(perimeter - sideA)*(perimeter - sideB)*(perimeter - sideC)) ;
}

@Override
public double getPerimeter() {
	// TODO Auto-generated method stub
	return sideA+sideB+sideC;
}
}

