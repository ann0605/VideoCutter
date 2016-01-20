package studentsClass;

public class person {
	private String name; //why are we using proivate
	private String email;
	public person(){
		name = "???";
		email = "@";
	}
	public String getName(){
		return name;
	}
	public void setName(String inname){
		name = inname;
	}
	public void sendEmail(){
		System.out.println(name + "@" + "nyu.edu");
		}
	}

