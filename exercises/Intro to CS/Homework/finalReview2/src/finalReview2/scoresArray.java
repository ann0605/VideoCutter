package finalReview2;

import java.util.Arrays;

public class scoresArray {
	public static void main(String[] args){
		int[] scores = {5,4,3,5};
		int count1 = 0;
		int count2 = 0;
		int mode = 0;
		Arrays.sort(scores);
		for(int i = 0; i<scores.length - 1; i++){
			if (scores[i+1] == scores[i]){
				count1 +=1;
			
			}
			else{
				if(count1>count2){
					count2 = count1;
					mode = scores[i];
					count1 = 0; 
					
				}
			}
			
		}
	}

}
