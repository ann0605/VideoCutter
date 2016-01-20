
public class SimpsonCharacter {
	String name;
	char gender;
	int age;
	String catchphrase;
	String occupation;
	public SimpsonCharacter(){
		name = " ???";
		catchphrase = "unknown";
		
	}
	public SimpsonCharacter(String inname, String incatch){
		setName(inname);
		setCatchphrase(incatch);
	}
	public void speak(){
		System.out.println(name+":" + catchphrase);
	}
	public void talk(){
		}
	private String toCamelcase(String invalue){
		String result;
		result = invalue.substring(0,1).toUpperCase();
		result += invalue.substring(1).toLowerCase();
		return result;
	}
	public void setName(String x){
		name = x.toUpperCase();
		
	}
	public String getName(){
		return name;
	}
	public String getCatchphrase(){
		return catchphrase;
		}
	public static void SimpsonAd(){
		String messsage = "Simpsons are cool";
		System.out.println(message);
	}
	}
