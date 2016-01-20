package prject1;

public class Collision {
	// all the info about every singy collision 
	// private fields
	private int zipCode, cyclistAccident, cyclistDeath, injuries;
	private String vehicleType1, vehicleType2;
	
	public Collision(int zipCode, int cyclistAccident, int cyclistDeath, int injuries, String vehicleType1, String vehicleType2) {
		this.zipCode = zipCode;
		this.cyclistAccident = cyclistAccident;
		this.cyclistDeath = cyclistDeath;
		this.injuries = injuries;
		this.vehicleType1 = vehicleType1;
		this.vehicleType2 = vehicleType2;
	}

	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public int getCyclistAccident() {
		return cyclistAccident;
	}
	
	public void setCyclistAccident(int cyclistAccident) {
		this.cyclistAccident = cyclistAccident;
	}
	
	public int getCyclistDeath(){
		return cyclistDeath;
	}
	
	public void setCyclistDeath(int cyclistDeath){
		this.cyclistDeath = cyclistDeath;
	}
	
	public int getInjuries() {
		return injuries;
	}
	
	public void setInjuries(int injuries) {
		this.injuries = injuries;
	}
	
	public String getVehicleType1() {
		return vehicleType1;
	}
	
	public void setVehicleType1(String vehicleType1) {
		this.vehicleType1 = vehicleType1;
	}
	
	public String getVehicleType2() {
		return vehicleType2;
	}
	
	public void setVehicleType2(String vehicleType2) {
		this.vehicleType2 = vehicleType2;
	}
	
		
		//here you have to read the newly output file which is no longer in the CSV format
		// maybe in the input file you have to split the lines and then here
		//this is the

}

