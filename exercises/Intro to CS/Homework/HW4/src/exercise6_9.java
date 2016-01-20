
public class exercise6_9 {
	public static void main(String[] args){
		double meters, feet;
		System.out.println("Feet\tMeters");
		System.out.println("------------------");
		for (double i =1; i< 11; i++){
			meters = feetToMeters(i);
			System.out.printf(i + "\t%.2f\n", meters);
		}
		System.out.println("Meters\tFeet");
		System.out.println("------------------");
		for (double i =20; i< 66; i+=5){
			feet = metersToFeet(i);
			System.out.printf(i + "\t%.2f\n", feet);
		}
		
		
		
	}
	public static double feetToMeters(double foot){
		double meter = foot * .305;
		return meter;
	}
	public static double metersToFeet(double meter){
		return meter*3.279;
	}
	

}