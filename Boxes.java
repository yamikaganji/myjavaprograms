package basicjavaprograms;

import java.util.Scanner;

public class Boxes {
	public static int candies(int n)
	{
		if(n==1)
			return 1;
		if(n==2)
			return 3;
		return candies(n-1)+candies(n-2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of test cases:");
		int t=sc.nextInt();
		int sum=0; int s=0;
		for(int i=0;i<t;i++)
		{
			System.out.println("enter number of boxes:");
			int n=sc.nextInt();
			int time=candies(n);
			System.out.println("the time required is:"+ time );
		}
	}

}
