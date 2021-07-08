package basicjavaprograms;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();int r;int rev=0;int temp=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println("reverse of the given number is:"+rev);
		if(temp==rev)
		{
			System.out.println("the given number is a palindrome");
		}
		else
		{
			System.out.println("the given number is not a palindrrome");
		}
	}




	}


