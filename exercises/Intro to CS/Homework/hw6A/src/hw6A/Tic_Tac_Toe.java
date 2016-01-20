package hw6A;

import javax.swing.JOptionPane;
import java.util.Random;
//There is a "resetBoard" and "checkWin" method at the bottom of main. There is also a "printArray" 
//method but it is never used in this program.
public class Tic_Tac_Toe
{
	public static void main(String[] args)
	{
		int gameMode, X, O, player, X_wins, O_wins, ties, row, col, emptyTiles;
		Random r = new Random();
		int[][] Board = {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		};

		gameMode = Integer.parseInt(JOptionPane.showInputDialog("Choose a game mode: 1, 2, or 3"));
		X = 1;
		O = 2;
		player = X;
		X_wins = 0;
		O_wins = 0;
		ties = 0;

		if (gameMode == 1)
		{
			for (int i = 1; i <= 10; i++)
			{
				Board = resetBoard(Board);
				emptyTiles = 9;
				ties++; //if a player ever wins, this addition will be removed on line 40
				while (emptyTiles > 0)
				{
					row = r.nextInt(3);
					col = r.nextInt(3);
					if (Board[row][col] != X && Board[row][col] != O)
					{
						Board[row][col] = player; //Set the tile to X or O
						if (checkWin(player, Board))
						{
							ties--;
							if (player == X) {X_wins++; break;}
							else {O_wins++; break;}
						}
						emptyTiles--; //remove an available tile
						player = (X + O) - player; //Toggle the player 
					}
				}
				printArray(Board);
			}

			System.out.println("X win: " + X_wins + ", O wins: " + O_wins + ", ties: " + ties);
		}
		else if (gameMode == 2)
		{
			for (int i = 1; i <= 10; i++)
			{
				Board = resetBoard(Board);
				emptyTiles = 9;
				ties++; //if a player ever wins, this addition will be removed on line 40
				if (i == 1) //for the first game, first player goes to the middle of the board
				{
					Board[1][1] = player;
					player = (X + O) - player; //Toggle the player
					emptyTiles--;
				}
				while (emptyTiles > 0)
				{
					row = r.nextInt(3);
					col = r.nextInt(3);
					if (Board[row][col] != X && Board[row][col] != O)
					{
						Board[row][col] = player; //Set the tile to X or O
						if (checkWin(player, Board))
						{
							ties--;
							if (player == X) {X_wins++; break;}
							else {O_wins++; break;}
						}
						emptyTiles--; //remove an available tile
						player = (X + O) - player; //Toggle the player 
					}
				}
		
			}

			System.out.println("X win: " + X_wins + ", O wins: " + O_wins + ", ties: " + ties);
		}
		else if (gameMode == 3)
		{
			for (int i = 1; i <= 10; i++)
			{
				Board = resetBoard(Board);
				emptyTiles = 9;
				ties++; //if a player ever wins, this addition will be removed on line 40
				while (emptyTiles > 0)
				{
					if (emptyTiles == 8) //if on the second move the middle is not taken, it is now taken
					{
						Board[1][1] = player;
						player = (X + O) - player; //Toggle the player
						emptyTiles--;
						continue;
					}
					row = r.nextInt(3);
					col = r.nextInt(3);
					if (Board[row][col] != X && Board[row][col] != O)
					{
						Board[row][col] = player; //Set the tile to X or O
						if (checkWin(player, Board))
						{
							ties--;
							if (player == X) {X_wins++; break;}
							else {O_wins++; break;}
						}
						emptyTiles--; //remove an available tile
						player = (X + O) - player; //Toggle the player 
					}
				}
				
			}

			System.out.println("X win: " + X_wins + ", O wins: " + O_wins + ", ties: " + ties);
		}
		else
		{
			System.out.println("You did not enter a valid game mode.");
		}
	}

	public static int[][] resetBoard(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			for (int col = 0; col < array[row].length; col++)
			{
				array[row][col] = 0;
			}
		}
		return array;
	}

	public static boolean checkWin(int player, int[][] array)
	{
		boolean win = false;

		//check the columns
		for (int col = 0; col < 3; col++)
		{
			if (win) {return win;} //check if player has already won
			for (int row = 0; row < 3; row++)
			{
				if (array[row][col] == player)
				{
					win = true;
				}
				else
				{
					win = false;
					break;
				}
				
			}
			
		}

		//check the rows
		for (int row = 0; row < 3; row++)
		{
			if (win) {return win;} //check if player has already won
			for (int col = 0; col < 3; col++)
			{
				if (array[row][col] == player)
				{
					win = true;
				}
				else
				{
					win = false;
					break;
				}
			}
		}

		//check the top left corner to bottom right corner diagonal
		int col = 0;
		for (int row = 0; row < 3; row++)
		{
			if (array[row][col] == player)
			{
				win = true;
				col++;
			}
			else
			{
				win = false;
				break;
			}
		}
		if (win) {return win;} //check if player has already won

		//check the bottom left corner to top right corner diagonal
		col = 0;
		for (int row = 2; row >=0; row--)
		{
			if (array[row][col] == player)
			{
				win = true;
				col++;
			}
			else
			{
				win = false;
				break;
			}
		}

		return win;
	}

	public static void printArray(int[][] array)
	{
		for (int row = 0; row < array.length; row++)
		{
			for (int col = 0; col < array[row].length; col++)
			{
				System.out.print(array[row][col] + " ");
			}
			System.out.print("\n");
			
		}
		System.out.println();
	}
}


