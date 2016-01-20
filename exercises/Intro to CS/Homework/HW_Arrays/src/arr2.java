
public class arr2 {public static void main(String[] args){
	int[] myIntArray = new int[200];
	int freq1 = 0; int freq2= 0;int freq3= 0;int freq4= 0;int freq5= 0;
	int freq6 = 0;int freq7= 0;int freq8 = 0;int freq9 = 0;int freq10 = 0;
	for (int c = 0; c<myIntArray.length; c++){
		myIntArray[c] = (int) (Math.random() * 10 +1);
	}
	for (int c = 0; c< myIntArray.length;c++){
		if (myIntArray[c]== 1){
			freq1++;
		}
		if (myIntArray[c]== 2){
			freq2++;
		}
		if (myIntArray[c]== 3){
			freq3++;
		}
		if (myIntArray[c]== 4){
			freq4++;
		}
		if (myIntArray[c]== 5){
			freq5++;
		}
		if (myIntArray[c]== 6){
			freq6++;
		}
		if (myIntArray[c]== 7){
			freq7++;
		}
		if (myIntArray[c]== 8){
			freq8++;
		}
		if (myIntArray[c]== 9){
			freq9++;
		}
		if (myIntArray[c]== 10){
			freq10++;
		}
	}
	System.out.println("The frequency of 1 is " + freq1);
	System.out.println("The frequency of 2 is " + freq2);
	System.out.println("The frequency of 3 is " + freq3);
	System.out.println("The frequency of 4 is " + freq4);
	System.out.println("The frequency of 5 is " + freq5);
	System.out.println("The frequency of 6 is " + freq6);
	System.out.println("The frequency of 7 is " + freq7);
	System.out.println("The frequency of 8 is " + freq8);
	System.out.println("The frequency of 9 is " + freq9);
	System.out.println("The frequency of 10 is " + freq10);
	
}

}
