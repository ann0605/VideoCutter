package homework13;

public class circleClonableComparable extends GeometricObject implements Cloneable, Comparable<circleClonableComparable>{
	private double radius;
	
	public circleClonableComparable(){

}

	public circleClonableComparable(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return this.radius;
	}

	public boolean equals(circleClonableComparable o) {
		double ourRad = this.getRadius();
		double oRad = ((circleClonableComparable)o).getRadius(); // what does this do??? https://github.com/jzacsh/edu-271/blob/master/src/homework/0222/Circle.java
	
		if(ourRad == oRad){
			return true;
		}
		else{
			return false;
		}
	
	}
	@Override
	public double getArea() {
	// TODO Auto-generated method stub
		return 3.14*radius*radius;
}
	@Override
	public double getPerimeter() {
	// TODO Auto-generated method stub
		return 2*3.14*radius;
}
	@Override
	public int compareTo(circleClonableComparable o) {
	// TODO Auto-generated method stub
	if (this.getRadius()>o.getRadius()){
		return 1;
	}
	else if (this.getRadius()<o.getRadius()){
		return -1;
	}
	else{
		return 0;
}
}
}
