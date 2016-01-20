package studentsClass;

public class Student extends person {
	public String major;
	public Student(){
		
	}
	public String getMajor(){
		return major;
	}
	public void setMajor(String invalue){
		major = invalue;
	}
}
