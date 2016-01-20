import java.util.Random;
public class TicTactoe {//write a program that print out a board of played Tic Tac Toe
	public static void main(String[] args){
		Random r = new Random(123);
		int[][] board = new int[3][3];
		for(int row = 0; row< board.length; row++){
			for (int col = 0; col<board[row].length;col++){
//				int moves = 0;
//				while (moves!=9){
//					if (board[i][j]!=0){
//							isEmpty = false;}
//					
//				}
//				if(isEmpty){
//					board[i][j] = r.nextInt(2);	
//					moves++;
			int movecount = 0;
			int player = 1;
			while(movecount<9){
				row = r.nextInt(3);
				col = r.nextInt(3);
				if(board[row][col]>0){continue;}
				board[row][col] = player;
				movecount++;
				player = 3 -player;
				
			}
		}PrintMultArray(board);}
		
	}
public static void PrintMultArray(int[][] list){
for (int i = 0; i<list.length; i++){
	for (int j = 0; j< list[i].length;j++){
		System.out.print(list[i][j] + "\t");
	}
	System.out.println("");
	
}
}
}
