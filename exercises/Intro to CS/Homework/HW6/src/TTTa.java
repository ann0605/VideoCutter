import java.util.Random;
import java.util.Scanner;
public class TTTa {

		public static void main(String[] args){
			Random r = new Random(123);
			int[][] board = new int[3][3];
			int winX = 0; int winO = 0; int ties = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the mode you want. The options are a, b and c.");
			String answer = input.nextLine();
			for (int i = 0; i< 1000; i++){
				for (int row = 0; row<board.length; row++){
					for(int col = 0; col<board[row].length; col++){
						int numOfMoves = 0;
						while(numOfMoves<9){
							if (answer.equals("a")){
							int mark = 1; // 1 is X
							row = r.nextInt(3);
							col = r.nextInt(3);
							if(board[row][col]==0){//if it is not empty, continue
							board[row][col] = mark;
							numOfMoves++;}
							mark = 2; //2 is O
							row = r.nextInt(3);
							col = r.nextInt(3);
							if(board[row][col]==0){//if it is not empty, continue
							board[row][col] = mark;
							numOfMoves++;}
							}
							else if(answer.equals("b")){
								int mark = 2; // 1 is X
								row = r.nextInt(3);
								col = r.nextInt(3);
								if(board[row][col]>0){ //if it is not empty, continue
								board[row][col] = mark;
								numOfMoves++;}
								mark = 1; //2 is O
								row = r.nextInt(3);
								col = r.nextInt(3);
								if(board[row][col]>0){ //if it is not empty, continue
								board[row][col] = mark;
								numOfMoves++;}
							}
							else{
								int mark = 1; // 1 is X
								row = r.nextInt(3);
								col = r.nextInt(3);
								if(board[row][col]>0){ //if it is not empty, continue
								board[row][col] = mark;
								numOfMoves++;}
								mark = 2; //2 is O
								if (board[1][1] == 0){
									board[1][1] = 2;
								}
								else{
								row = r.nextInt(3);
								col = r.nextInt(3);
								if(board[row][col]>0){ //if it is not empty, continue
								board[row][col] = mark;
								numOfMoves++;}
								}
							}

					if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1){
						winX++;
					}
					else if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2){
						winO++;
					}
					else if(board[2][0]== 1  && board[1][1] == 1 && board[0][2]==1){
						winX++;
					}
					else if(board[2][0]== 2  && board[1][1] == 2 && board[0][2]==2){
						winO++;
					}
					else{
						for (int z = 0; z< board.length; z++){
							int j = 0;
							if (board[z][j] == 1 && board[z][j+1] == 1 && board[z][j+2] == 1){
								winX++;
							}
							else if(board[z][j] == 2 && board[z][j+1] == 2 && board[z][j+2] == 2){
								winO++;
							}
							else{
								ties++;
							}
						}}}
			}System.out.println("The number of time X wins is" + winX);
			System.out.println("The number of time O wins is" + winO);
			System.out.println("The number of ties is" + ties);}}}}
