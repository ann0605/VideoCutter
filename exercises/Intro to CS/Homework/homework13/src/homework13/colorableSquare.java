package homework13;
///http://www.dreamincode.net/forums/topic/245589-abstract-classes/
public class colorableSquare extends GeometricObject implements Colorable {
	public colorableSquare(){
		
	}
	public void howToColor(){
		System.out.println("This is how you color: take a pen and start coloring");
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
