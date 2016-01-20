package finalReview2;

public class Course implements Comparable<Course> {
	
	     int enroll = 30;
	     int  coursenumber;
	   public Course (int inval) {
	      max = inval;
	      enroll = 40
	        }
	   public Course (int coursenumber) {
	      max = 100;
	 
	        }
	public void AddStudents(int number) {
	       enroll = enroll + number;
	       if (enroll > max) {throw Exception e1}
	         }
	public  void  DropStudents(int number) {
	      enroll = enroll - number;
	         if (enroll <0) {throw Exception e2}
	         }
	       }
	public int getSize() {
	       return enroll;
	    }
	public void setCourseNumber(int inVal){
		coursenumber = inVal;
	}
	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		if (this.getSize()!= 0){
			if(o.coursenumber == this.coursenumber){
				return 0;
		}
			else if(o.coursenumber>this.coursenumber){
				return -1;
			}
			else
				return 1; 
		}
		else{
			if(o.getSize() == 0){
				return 0;
			}
			return -1;
		}
		
	}
	
