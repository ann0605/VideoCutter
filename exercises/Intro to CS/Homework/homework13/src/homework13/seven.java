package homework13;
public class seven {
	public static void main(String[] args){
		GeometricObject[] shapes = new GeometricObject[5];
		for (int i = 0; i<shapes.length/2; i++){
			shapes[i] = new colorableSquare();
			
		}
		for (int i = shapes.length/2; i< shapes.length;i++){
			shapes[i] = new Octagon();
		}
		for (int i = 0; i< shapes.length; i++){
			if (shapes[i] instanceof Colorable){
				Colorable colorable1 = (Colorable) shapes[i];
				colorable1.howToColor();
			}
		}
		
	}

}
