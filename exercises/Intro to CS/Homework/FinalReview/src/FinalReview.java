import java.util.Random;
public class FinalReview {
//Populate an array with random values from 60 to 100 
	public static void main(String[] args){
		
		Random r = new Random(345);
		int[] myList =  new int[41];
		
		for (int c = 0; c<myList.length;c++){
			myList[c] = (int)(r.nextInt(41)+60);
		}
		
		for (int c = 0; c<myList.length;c++){
			System.out.println(c);
		}
		
		//Multidimensioonal array the 2nd dimension is the maxiumum/ 
		//not all the rows have the same number of columns [row][col <-- this is the max]
		//do something for each row vs do something for each column
		for (int row = 0; row<list.lengthl row++){
			//look for sum of of each row
			for (int col = 0; col<list[row].length;col++){
				//statements
			}
		}
		//CREATING INSTANCES OF A CLASS
		//THE TRHEE STEPS: COPY OF THE CLASS STORES IN MEMORY, REFERENCE POINTS TO THE COPY, CLASS CONSTRUCTOR IS EXECUTED
	}
	//CONSTRUCTORES OVERLOADING
	//BE MORE CAREFUL WITH THE CLASSES -- public, private, REVIEW THIS
	//SWING CONTROL -- understand what is going to be drawn -- asked about the code
	JFrame f = new JFrame("First Frame");
	f.setDefaultCloseOperation(JFram.EXIT_ON_CLOSE); // when you close the window it ends the program
	JPanel p = new JPanel();
	f.add(p);
	p.setLayout(null);// can't use the x and y coordinaes becasue of the different hardware configuration when the layout is null, the system is not goijng to help us reposition all the controls.
	JButton firstButton = new JButton();
	firstButton.setText("OK");
	firstButton.setBounds(10, 20, 40, 50);
	p.add(firstButton); // add first button to the panel
	p.setVisible(true);
	f.setSize(200, 400); // what does this do??
	f.setVisible(true);
	//EXCEPTIONS
	try{
		int answer = 5/0; 
	}
	catch (ArithmeticException e){
		System.out.prtinln("Arithmetic Error!");
		
	}
	//DYNAMIC BINDING 
	int i = Integer.parseInt(String a)
}
