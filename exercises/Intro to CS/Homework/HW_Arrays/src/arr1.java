

public class arr1 {
	public static void main(String[] args){
		int[] myArray = new int[20];
		int flag2 = 0; 
		int count = 0;
		int flag = 0;
		for (int i = 0; i< myArray.length; i++)	//initial population
		{
			myArray[i] = (int) (Math.random() * 20 + 1);
		}
	System.out.print("Original array: ");
	for (int i = 0;i< myArray.length; i++){
		System.out.print(myArray[i]+" ");
	}
	
	while (flag!=1 || flag2!= 1){
		System.out.print("\nNo Duplicates: ");
		for (int c = 0; c< myArray.length-1; c++){
			for (int i=c+1; i< myArray.length-2;i++)
			if (myArray[i] == myArray[c]){
				myArray[i] = 0;
			}
			System.out.print(myArray[c] + " ");
			flag = 1;
			
	}
		System.out.print("\nRepopulated:");
		for (int c = 0; c< myArray.length; c++){
			count++;
			if(myArray[c] == 0){
				flag = 0;
				flag2 = 0;
				myArray[c] = (int) (Math.random()*20+1);
				
			}
			System.out.print(myArray[c] + " ");
			flag2 = 1;
		}
	}
	
	System.out.printf("\nNumber of repopulations is %d", count);
	}}

				

	

