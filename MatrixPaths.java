package basicjavaprograms;

import java.util.Scanner;

public class MatrixPaths {
	public static int paths(int r,int c)
	{
		if(r==1||c==1)
			return 1;
		return  paths(r-1,c)+paths(r,c-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of test cases:");
		int t=sc.nextInt();
	
		for(int i=0;i<t;i++)
		{
			System.out.println("enter number of rows:");
			int r=sc.nextInt();
			System.out.println("enter number of coloumns:");
			int c=sc.nextInt();
			int  p=paths(r,c);
			System.out.println("the number of possible ways:"+p);
			
		}
	}

}
