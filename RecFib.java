package basicjavaprograms;

import java.util.Scanner;

public class RecFib {
//program to print  nth fibonacci number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int op=fib(n);
		System.out.print("the fibonacci sequence is:  " +  op   +"   ");

	}
	public static int fib(int n)
	{
		if(n==1)
			return 0;
		if(n==2 )
	
			return 1;
	
		return fib(n-1)+fib(n-2);
		
	}

}
