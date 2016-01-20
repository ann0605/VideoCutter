package finalReview2;

public class number5 {
	public static void main(String[] args){
	
	}
	public static void RemoveStudent(String[][] seatchart, int maxAbsence){
		for (int r = 0; r< seatchart.length; r++){
			for (int c = 1; c< seatchart[r].length; c+=2){
				if (Integer.parseInt(seatchart[r][c])>maxAbsence){
					seatchart[r][c]="0";
					seatchart[r][c-1] = null; //means it is empty, even though th eposition in memory exists
				}
			}
		}
	}
}
