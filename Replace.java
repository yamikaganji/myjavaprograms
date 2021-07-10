package basicjavaprograms;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		System.out.println("enter a String");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String newstr=new String();
	for(int i=0;i<str.length();i++)
	{
		newstr=newstr+(char)(str.charAt(i)+1);
	}
	System.out.println("new String is: "+newstr);
	}

}
