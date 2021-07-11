package basicjavaprograms;

import java.util.Scanner;

public class AlphabetTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int i;
		int j;
		System.out.println("the alphabet triangle:");
		for( i=0;i<n;i++)
		{
			for( j=0;j<n-i;j++)
			{
				System.out.print(" ");
				
			}
			for(j=0;j<i;j++)
			{
				System.out.print((char)(j+65));
			}
			for(j=i;j>=0;j--)
			{
				System.out.print((char)(j+65));
			}
			
			System.out.println();
		}

	}

}
