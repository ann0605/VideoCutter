package midterm2Prep;

public class distance {
	int[][] distances = { {0,40,50,90,80},
            {40,0,60,70, 99},
            {50,60,0,88,89}, 
            {90,70,88,0,81}, 
            {78,99,89,81,0}};
	int total = 0; 
	for(int row = 0; row< distances.length; row++){
		for (int col = 0; col< distances[row].length; col++){
			if (distances[row][col] != 0){
				total+= distances[row][col];
			}
			 
			
		}
		int average = total/distances[i].length
	}
	public static String camelCase(String input){
		firstLetter = input.substring(0);
		String newString = firstLetter.toUpperCase + input.substring(1, input.length);
		return newString;
	}

}
