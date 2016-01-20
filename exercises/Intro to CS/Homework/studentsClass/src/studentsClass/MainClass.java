package studentsClass;

public class MainClass {
	public static void main(String[] args){
		person p;
		p = new person();
		Faculty f;
		f = new Faculty();
		f.setName("Moody");
		f.sendEmail();
	
		Student s;
		s = new Student();
		s.setName("Miller");
		s.sendEmail();
		Transfer t;
		t = new Transfer();
		t.setName("Messi");
		t.sendEmail();
	}
}