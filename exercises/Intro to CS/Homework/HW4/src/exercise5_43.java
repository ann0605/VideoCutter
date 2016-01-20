
public class exercise5_43 {

	public static void main(String[] args) {
		int countIn = 0;
		// TODO Auto-generated method stub
		for (int i = 1;i<8; i++){
			for (int j = i+1; j<8;j++)
				
				{System.out.println(i+ "\t" + j );
				
				countIn ++;}
		}
		System.out.print("The total number of combinations is "+ countIn);
	}

}
