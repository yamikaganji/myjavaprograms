package basicjavaprograms;

import java.util.Scanner;

public class RecFib2 {
	

	static int n1=0; static int n2=1;static int n3=0;
	public static void fib(int n)
	{
		if(n>0)
		{
	 n3=n1+n2; 
		n1=n2;
		n2=n3;
		System.out.print(n3+"  ");
		fib(n-1);
		
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value:");
	int n=sc.nextInt();
	System.out.print("the fibonacci sequence is:  " +n1 +"   "+n2+" ");
    fib(n-2);
}
}