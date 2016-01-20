
public class exercise5_33 {
	public static void main(String[] args){
		int posDivisor = 0;
		for (int i = 1; i< 10000; i++){
			posDivisor = 0;
			for(int j = 1; j<(i/2)+1; j++ ){
				if (i%j == 0){
					posDivisor+=j;
				}
			}
			if (posDivisor == i){
				System.out.println(i);
			}
			
		}
	}
}