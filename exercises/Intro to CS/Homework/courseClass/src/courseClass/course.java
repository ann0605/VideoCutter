package courseClass;

public class course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public course(String courseName){
		this.courseName = courseName;
	}

	public void addStudent(String student){
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents(){
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void dropStudents(String student){
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		course courseClone = (course)super.clone();
		courseClone.students = students.clone();
		return courseClone;
	}
}
