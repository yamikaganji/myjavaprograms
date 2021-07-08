package basicjavaprograms;

import java.util.Scanner;

public class Stairs {
	public static int stair(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		else 
		return  stair(n-1)+stair(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of stairs:");
		int n=sc.nextInt();
		int s=stair(n);
		System.out.println(s);
	}

}
