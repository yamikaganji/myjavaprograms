package basicjavaprograms;

public class practice {
	static String[] board;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board=new String[9];
	}
	static void printBoard()
	{
	System.out.println("/---|---|---\\");
	System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
	System.out.println("|-----------|");
	System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
	System.out.println("|-----------|");
	System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
	System.out.println("/---|---|---\\");
	}
}
