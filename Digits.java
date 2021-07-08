package basicjavaprograms;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();int r;int sum=0;
		while(n>0)
		{
			
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("sum of the digits is:"+sum);
	}

}
