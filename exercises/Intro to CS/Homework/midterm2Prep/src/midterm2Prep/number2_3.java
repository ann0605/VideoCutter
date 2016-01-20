package midterm2Prep;

public class number2_3 {
    int[][] sales = { {2323,50,40,54 },
            {3333,40,60,60,40, 39},
            {3421,50,60, 88,89}, 
            {80,99 }};
    int total=0;
    int max = 0;
    int maxCustomers = 0; 
    int itemNumber = 0;
    int count = 0;
    for (int row =0; row< sales.length; row++){
    	for (int col = 1; col<sales[row].length; col++){
    		if(sales[row][col]>80){
    			count++;
    		}
    		total +=sales[row][col];
    	}
    	if (total> max){
    		max = total;
    		itemNumber = sales[row][0]; 
    	}
    	total=0;
    	if(sales[row].length>maxCustomers){
    		maxCustomers = sales[row].length;
    	}
    }
    System.out.println(maxCustomers);
    System.out.println(itemNumber);

}
