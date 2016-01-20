package hw6A;
import java.util.Random;
import javax.swing.*;
//class name has nothing to do with the three modes
public class Mode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//choose mode
		String userMode = JOptionPane.showInputDialog("Enter 1, 2, or 3 to select a mode");
		int mode = Integer.parseInt(userMode);

		int gameCount = 0;

		int xWins = 0;
		int oWins = 0;
		int ties = 0;

		while(gameCount < 10){
			int [][] myList = new int [3][3]; 
			Random r = new Random();

			int row;
			int col;

			int moveCount = 0;
			int curPlayer = 1;
			boolean gameHasWinner = false; 

			while(moveCount < 9){

				//item is only used to print out winner
				String item = "";
				switch(curPlayer){
				case 1: item = "X"; break;
				case 2: item = "O"; break;
				default: item = "-"; break;
				}
				//pick space depending on mode
				if (mode == 1){
					//pick random space until you get an empty one
					while (true){	
						row = r.nextInt(3);
						col = r.nextInt(3);
						if (myList[row][col] == 0) {break;}
					}
				}else if (mode == 2){
					//first X is always in the middle
					if (moveCount == 0){
						row = 1;
						col = 1;
					}else{
						while (true){	
							row = r.nextInt(3);
							col = r.nextInt(3);
							if (myList[row][col] == 0) {break;}
						}
					}
				}else if (mode == 3){
					//first x move is random , O goes into the middle if not taken
					if (moveCount != 1){
						while (true){	
							row = r.nextInt(3);
							col = r.nextInt(3);
							if (myList[row][col] == 0) {break;}
						}
					}else{
						row = 1;
						col = 1;
					}
				}else{
					//break if an invalid mode is chosen
					System.out.println("You did not choose a valid mode.");
					break;
				}

				myList[row][col] = curPlayer;
				printArray(myList);
				//check winner
				if (isWinner(curPlayer, myList)){
					System.out.println(item + " wins.");
					if (item == "X"){
						xWins++;
					}else if (item == "O"){
						oWins++;
					}
					gameHasWinner = true;
					break;
				}

				curPlayer = 3 - curPlayer;
				moveCount++;
			}
			if (!gameHasWinner){ties++;}
			gameCount++;
		}

		System.out.println("X won " + Integer.toString(xWins) + " times.");
		System.out.println("O won " + Integer.toString(oWins) + " times.");
		System.out.println("There were " + Integer.toString(ties) + " ties.");
	}

	public static boolean isWinner(int player, int[][] board){
		boolean winner = false;;
		if (checkRowWin(player, board) || checkColWin(player, board) || checkDiaWin(player, board)){
			winner = true;
		}
		return winner;
	}
	public static void printArray(int[][] list){
		//make 1s print as X, 2s as O
		String[][] xAndO = new String[3][3];
		for (int row = 0; row<3; row++){
			for (int col = 0; col<3; col++){
				switch(list[row][col]){
				case 0: xAndO[row][col] = "-"; break;
				case 1: xAndO[row][col] = "X"; break;
				case 2: xAndO[row][col] = "O"; break;
				}
			}
		}
		for (int row = 0; row<xAndO.length; row++){
			System.out.println();
			for (int col = 0; col < xAndO[row].length; col++){
				System.out.print(xAndO[row][col] + "\t");

			}
		}
		System.out.println();
	}

	public static boolean checkRowWin(int player, int[][] board){
		boolean rowWin = false;
		for (int row = 0; row<board.length; row++){
			int rowCount = 0;
			for (int col = 0; col < board[row].length; col++){
				if (board[row][col] == player){
					rowCount++;
				}
				if (rowCount == 3){
					rowWin = true;
				}	
			}
		}
		return rowWin;
	}

	public static boolean checkColWin(int player, int[][] board){
		boolean colWin = false;
		int newBoard[][] = new int[3][3];
		//"Rotate" the board 90 degrees. rows become columns, etc
		newBoard[2][0] = board[0][0];
		newBoard[2][1] = board[1][0];
		newBoard[2][2] = board[2][0];
		for (int col = 0; col < 3; col++){
			newBoard[0][col] = board[col][2];
		}
		for (int col = 0; col < 3; col++){
			newBoard[1][col] = board[col][1];
		}
		for (int col = 0; col < 3; col++){
			newBoard[2][col] = board[col][0];
		}	
		for (int row = 0; row<newBoard.length; row++){
			int colCount = 0;
			for (int col = 0; col < newBoard[row].length; col++){
				if (newBoard[row][col] == player){
					colCount++;
				}
				if (colCount == 3){
					colWin = true;
				}	
			}
		}
		return colWin;
	}
	public static boolean checkDiaWin(int player, int[][] board){
		boolean diaWin = false;
		//count the number of positives in the two diagonals
		int dia1Count = 0;
		int dia2Count = 0;
		for (int i = 0; i < 3; i++){
			if (board[i][i] == player){
				dia1Count++;
			}
		}
		for (int i = 0; i<3;){
			for (int j = 2; j > -1; i++, j--){
				if (board[i][j] == player){
					dia2Count++;
				}
			}
		}
		if (dia1Count == 3 || dia2Count == 3){
			diaWin = true;
		}
		return diaWin;
	}

}
