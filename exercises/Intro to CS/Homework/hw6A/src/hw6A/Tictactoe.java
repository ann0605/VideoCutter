import java.util.Random;
import java.util.Scanner;

public class Tictactoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		char [] [] list = new char [3] [3];
		// traverse length of row for two dimensional array
		for (int row=0; row<list.length; row++) {

			// traverse length of row for two dimensional array
			for (int col = 0; col<list[row].length; col++) {
				
				list[row][col] = ' ';
			}
		}
		
		boolean playing = true;
		boolean xturn = true;
		int xwin = 0;
		int owin = 0;
		int ties = 0;
		int moves = 0;
		
		Scanner input = new Scanner(System.in);
		int mode = 0;
		System.out.println("Enter the mode you want?(1-3)");
		System.out.println("In mode 1 the pieces move radomly. In mode 2, 'X' moves to the middle. In mode 3, 'o' moves to the middle after x's turn.");
		
		mode = input.nextInt();
		
		for (int times = 0; times < 1000; times++) {
			playing = true;
			xturn = true;
			moves = 0;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					list[i][j] = ' ';
				}
			}
			
			if (mode == 2) {
				list[1][1] = 'x';
				xturn = false;
				moves += 1;
			}
			
			while (playing) {
				
				
				int row = r.nextInt(3);
				int col = r.nextInt(3);
				
				if (mode == 3 && moves == 1 && list[1][1] == ' ') {
						list[1][1] = 'o';
						moves += 1;
						xturn = true;	
				}
				
				//try to place piece
				else if (list[row][col] == ' ') {
					
					if (xturn) {
						list[row][col] = 'x';
					} else {
						
						list[row][col] = 'o';
					}
					moves+=1;
					xturn = !xturn;
				}
				
				//rows wins 
				if (list[0][0] == 'x' && list[1][0] == 'x' && list[2][0] == 'x') {
					xwin +=1;
					playing = false;
				}
				else if (list[0][1] == 'x' && list[1][1] == 'x' && list[2][1] == 'x') {
					xwin += 1;
					playing = false;
				}
				else if (list[0][2] == 'x' && list[1][2] == 'x' && list[2][2] == 'x') {
					xwin += 1;
					playing = false;
				}
				
				else if (list[0][0] == 'o' && list[1][0] == 'o' && list[2][0] == 'o') {
					owin +=1;
					playing = false;
				}
				else if (list[0][1] == 'o' && list[1][1] == 'o' && list[2][1] == 'o') {
					owin += 1;
					playing = false;
				}
				else if (list[0][2] == 'o' && list[1][2] == 'o' && list[2][2] == 'o') {
					owin += 1;
					playing = false;
				}
				
				//col wins
				else if (list[0][0] == 'x' && list[0][1] == 'x' && list[0][2] == 'x') {
					xwin +=1;
					playing = false;
				}
				else if (list[1][0] == 'x' && list[1][1] == 'x' && list[1][2] == 'x') {
					xwin += 1;
					playing = false;
				}
				else if (list[2][0] == 'x' && list[2][1] == 'x' && list[2][2] == 'x') {
					xwin += 1;
					playing = false;
				}
				
				else if (list[0][0] == 'o' && list[0][1] == 'o' && list[0][2] == 'o') {
					owin +=1;
					playing = false;
				}
				else if (list[1][0] == 'o' && list[1][1] == 'o' && list[1][2] == 'o') {
					owin += 1;
					playing = false;
				}
				else if (list[2][0] == 'o' && list[2][1] == 'o' && list[2][2] == 'o') {
					owin += 1;
					playing = false;
				}
				
				//diagonal wins
				else if (list[0][0] == 'x' && list[1][1] == 'x' && list[2][2] == 'x') {
					xwin +=1;
					playing = false;
				}
				else if (list[2][0] == 'x' && list[1][1] == 'x' && list[0][2] == 'x') {
					xwin += 1;
					playing = false;
				}
				
				else if (list[0][0] == 'o' && list[1][1] == 'o' && list[2][2] == 'o') {
					xwin +=1;
					playing = false;
				}
				else if (list[2][0] == 'o' && list[1][1] == 'o' && list[0][2] == 'o') {
					xwin += 1;
					playing = false;
				}	
				
				//is the board full
				else if (moves == 9) {
					playing = false;
					ties += 1;
				}
			}
		}
		
		
		System.out.println("X won:" + xwin + " times " + "O won:" + owin + " times" + " There were: " + ties + " stalemates");
		

	}

}
