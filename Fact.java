package basicjavaprograms;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int i;
		System.out.print("the factors of  " + n +" are:");
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
			System.out.print(i+" ");
			}
		}
	}

}
