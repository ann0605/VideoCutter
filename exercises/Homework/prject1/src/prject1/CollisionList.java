package prject1;

import java.util.ArrayList;

public class CollisionList {
	
	private ArrayList<Collision> collisions;
	private ArrayList<Integer> indeces;
	int count = 0; int max1 = 0; int zip1 = 0;
	int max2 = 0; int zip2 = 0;
	int max3 = 0; int zip3 = 0;
	public CollisionList(){ //constructor?
		collisions = new ArrayList<Collision>();
	}
	
	public void getLargest(){
		for (int i = 0; i<collisions.size(); i++){
			Collision currCollision = collisions.get(i);
			Collision nextCollision = collision.get(i+1);
			count++;
			if (currCollision.getZipCode()!=nextCollision.getZipCode()){
				if (count>max1){
					max1 = count;
					zip1 = currCollision.getZipCode();
					count = 0;
				}
				else if (count>max2){
					max2= count;
					zip2 = currCollision.getZipCode(); 
					count = 0;
				} 
				else if (count>max3){
					max3= count;
					zip3 = currCollision.getZipCode();
					count = 0;
				}
			}
	
	public getSmallest(){
		
	}
	
	public getMostFatalities(){
		
	}
	
	public getMostDangerous(){
		
	}
	
	public getVehicleTypes;
}