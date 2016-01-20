
public class exercise5_39 {
	public static void main(String[] args){
		double numOfSales= 0;
		double salary = 5000;
		double commision =0;
		while ((salary + commision + numOfSales )<30000){
			numOfSales+=1;
			if (numOfSales <= 5000){
				commision = numOfSales * 0.08;
			}
			else if (numOfSales<=10000 &&numOfSales>5000){
				commision = 5000*0.08 + (numOfSales-5000)*0.1;
				
			}
			else
				{commision = 5000*0.08 + (numOfSales-5000)*0.1 + (numOfSales - 15000) * 0.12;}
			
		}
			
		System.out.println(numOfSales);
	}
	

}
