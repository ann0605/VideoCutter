package testing;

public class test2 {
	public static void main(String[] args){
		int[] myArray = {1,1,2,2,3,4,5,5,5};
		int count = 0; int ind1 = 0;int ind2 = 0;int ind3 = 0; int extra = 0;
		int max2 = 0; int max3 = 0; int max1 = 0; 
		for (int i = 0; i< myArray.length-1; i++){
			if (myArray[i] == myArray[i+1]){
				count++;
			}
			if (count>max1){
				max1 = count;
				count = 0;
				if(count!=max2){
					ind1 = myArray[i];
				}
				else{
					count=0;
				}
			}
			else if(count > max3){
				max3= count;
				count = 0;
				ind3 = myArray[i];
			}
			else if (count> max2 && max1 != max2){
				max2 = count;
				count = 0;
				ind2= myArray[i];//the max
			}
			
		}
		System.out.println("most frequent " + ind2);
		System.out.println("next most frequent " + ind3);
		System.out.println("last most frequent " + ind1);
		
	}
}
