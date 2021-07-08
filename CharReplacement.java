package basicjavaprograms;

import java.util.Scanner;

public class CharReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String:");
		String str= sc.nextLine();
		System.out.println("the given string is:"+ str);
		String strIncrement="";
		for(int i=0;i<str.length();i++)
		{
			strIncrement=strIncrement+(char)(str.charAt(i)+1);
		}
		System.out.println("the incremented String is:"+strIncrement);
	}

}
