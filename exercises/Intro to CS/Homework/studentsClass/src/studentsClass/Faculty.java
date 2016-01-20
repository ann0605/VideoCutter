package studentsClass;

public class Faculty extends person {
	private String dept;
	private Double salary;
	public Faculty(){
		super();
	}
	public String getDepartment(){
		return dept;
	}
	public void setDepartment(String invalue){
		dept = invalue;
	}
}
