package midterm2Prep;

public class number2 {
	public static void main(String[] args){
		int[][] sales = { {2323,50,40,54 },
                {3333,40,60,60,40, 39},
                {3421,50,60, 88,89}, // many more lines of data go here 
                {80,99 }   };
		int maxCustomers = 0;
		int count = 0;
		int totalCurrent = 0; int totalNext = 0; int max = 0;
		for (int i = 0; i<sales.length; i++){
			for (int j = 1; j< sales[i].length;j++){
				if (sales[i][j]>80) {
					count++;
				}
			}
		}
		System.out.println("The number of sales with quantity over 80 is" + count);
		for (int i = 0; i<sales.length; i++){
			totalCurrent = 0;totalNext = 0;
			for (int j = 1; j< sales[i].length;j++){
				
				totalCurrent += sales[i][j];
			}
			for (int j = 1; j< sales[i+1].length;j++){
				totalNext += sales[i+1][j];
			}
			if (totalCurrent<totalNext){
				max = totalNext;
			}
			else{
				max = totalCurrent;
			}
		}
		System.out.println("The highest quatity sold in total is " + max);
		for (int i = 0; i< sales.length-1; i++){
			if (sales[i].length<sales[i+1].length){
				maxCustomers = sales[i+1].length;
			}
			else{
				maxCustomers = sales[i].length;

			}
		
		}
		System.out.println("The highest number of customers is " + maxCustomers);
	}


}
