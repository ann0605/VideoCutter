package homework13;

public abstract class GeometricObject {
	private String color= "white";
	private boolean filled;
	protected GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public GeometricObject(){
		
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public int max(ComparableGO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean equals(circleClonableComparable o) {
		// TODO Auto-generated method stub
		return false;
	}

}
