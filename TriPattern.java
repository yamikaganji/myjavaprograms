package basicjavaprograms;

import java.util.Scanner;

public class TriPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
			System.out.println("\n");
			for(int i=0;i<=j;i++)
			{
			
			System.out.print(" * ");
			}
		}	

	}

}
