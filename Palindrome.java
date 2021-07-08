package basicjavaprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string:");
		String str=sc.nextLine();
		int i;String str1="";
		System.out.print("the string entered is:  ");
		for(i=0;i<str.length();i++)
			
		{
		System.out.print(str.charAt(i));
		
		}
		System.out.println(" ");
		System.out.print("the reverse of the string is:");
		for(i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
			//System.out.print(str.charAt(i));
		}
		System.out.println(str1+" ");
		if(str.equals(str1))
		{
			System.out.println("the entered string is a palindrome");
		}
		else
		{
			System.out.println("the entered string is not a palindrome");
		}

	}

}
