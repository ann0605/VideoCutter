package homework13;

public class ComparableGO extends GeometricObject implements Comparable<ComparableGO> {
	public ComparableGO(){
	super();
	}
@Override
public int max(ComparableGO o){
	if(getArea()> o.getArea())
		return 1;
	else if(getArea()<o.getArea())
		return -1;
	else 
		return 0;
}
@Override
public int compareTo(ComparableGO o) {
	// TODO Auto-generated method stub
	return 0;
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
