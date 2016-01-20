package studentsClass;

public class Transfer extends Student{
	String prevSchool;
	public Transfer(){
		super(); //explicitly call your parent's class constructor
	}
	public String setPrevSchool{
		return prevSchool;
	}
	public void getPrevSchool(String invalue){
		prevSchool = invalue;
	}
	
	public void sendEmail(){
		System.out.println("Welcome to NYU" + getName());
		System.out.println(super.getName() + "@" + "nyu.edu");
		}
}
	