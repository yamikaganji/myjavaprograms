package basicjavaprograms;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	private static  char[][] board;
	private static  char currentPlayerMark;
	
	
	public static void main(String[] args) {
		board=new char[3][3];
		currentPlayerMark='x';
		Scanner sc=new Scanner(System.in);
		initializeBoard();
		System.out.println("tic tac toe:");
		do {
			System.out.println("current board layout:");
			printBoard();
			int r;
			int c;
			do
			{
				System.out.println("player"+getCurrentPlayerMark()+", enter an empty row and coloumn to place your mark" );
					 r=sc.nextInt();
					 c=sc.nextInt();
			}
			while(!placeMark(r,c));
			changePlayer();
		}
		while(!checkForWin()&&!isBoardFull());
		
			if(isBoardFull()&&!checkForWin())
			{
				System.out.println("the game was tie");
			}
			else 
			{
				System.out.println("current board layout:");
				printBoard();
				changePlayer();
				System.out.println(Character.toUpperCase(getCurrentPlayerMark())+"Wins!");
			}
	
}

	private static char getCurrentPlayerMark()
	{
		
	return currentPlayerMark;	
		
	}
	private static boolean isBoardFull() {
		boolean isFull=true;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j]=='-')
				{
					isFull=false;
				}
			}
		}
		return isFull;
		
	}
	public static boolean checkForWin()
	{
		return(checkRowsForWin()||checkColumnsForWin()||checkDiagonalsForWin());
		
	}
	public static boolean checkRowsForWin()
	{
		for(int i=0;i<3;i++)
		{
			if(checkRowCol(board[i][0],board[i][1],board[i][2])==true)
				return true;
		}
		return false;
	}
	public static boolean checkColumnsForWin()
	{
		for(int i=0;i<3;i++)
		{
			if(checkRowCol(board[0][i],board[1][i],board[2][i])==true)
				return true;
		
		}
		return false;
	}
	public static boolean checkDiagonalsForWin()
	{
		return((checkRowCol(board[0][0],board[1][1],board[2][2])==true)||(checkRowCol(board[0][2],board[1][1],board[2][0])==true));
	}
	public static boolean checkRowCol(char c1,char c2,char c3 )
	{
		return((c1!='-')&&(c1==c2)&&(c2==c3));
	}
	
	private static boolean placeMark(int row,int col) {
	if((row>=0)&&(row<3))
	{
		if((col>=0)&&(col<3))
		{	
				if(board[row][col]=='-')
				{
					board[row][col]=currentPlayerMark;
					return true;
				}
		}
		
	}
	return false;
	}
	
	private static void changePlayer() {
		if(currentPlayerMark=='x')
		{
			currentPlayerMark='o';
		}
		else
		{
			currentPlayerMark='x';
		}
		
	}
	
	private static void printBoard() {
		System.out.println("-----------------------");
		for(int i=0;i<3;i++)
		{
			System.out.print("| ");
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j]+" | ");
			}
				System.out.println();
				System.out.println("--------------------");
			
		}
		
	}
	
	public static void initializeBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j]='-';
			}
		}
	}

}
