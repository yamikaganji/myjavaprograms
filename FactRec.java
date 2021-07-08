package basicjavaprograms;

import java.util.Scanner;

public class FactRec {
	public static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
		return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int f=fact(n);
		System.out.print("the factors are: "+f+"  " );
	}

}
