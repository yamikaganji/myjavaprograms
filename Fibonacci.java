package basicjavaprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int i;int n3;
		int n1=0;
		int n2=1;
		System.out.println("enter the fibonacci sequence:");
		System.out.print(+n1+" "+n2+" ");
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}

}
