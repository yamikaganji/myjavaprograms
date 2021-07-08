package basicjavaprograms;

import java.util.Scanner;



public class Patterns {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int r=sc.nextInt();
		System.out.println("enter number of coloumns");
		int c=sc.nextInt();
	
		for(int j=0;j<r;j++)
		{
			System.out.println("\n");
			for(int i=0;i<c;i++)
			{
			
			System.out.print(" * ");
			}
		}	
		
	}

}
