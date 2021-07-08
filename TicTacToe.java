package basicjavaprograms;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	//static Scanner in;
	static String[] board;
	//static String turn;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		board =new String[9];
		String winner="null";
		String turn="x";
		System.out.println("welcome to 2 player tic tac toe:");
		System.out.println("--------------------------------");
		printBoard();
	}
	static void printBoard()
	{
		
	}
	
	static void populateEmptyBoard()
	{
		for(int i=0;i<9;i++)
		{
			board[i]=String.valueOf(i+1);
		}
	}

}
