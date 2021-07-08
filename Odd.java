package basicjavaprograms;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of the numbers:");
		int n=sc.nextInt();
		System.out.print("the odd numbers are:");
		for(int i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
