package basicjavaprograms;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		System.out.println("the given String is:"+str);
		String op=removeDuplicate(str);
		System.out.println("String after removing duplicates is:"+op);		
	}

	private static String removeDuplicate(String sourcestr)
	{
		char arr[]=sourcestr.toCharArray();
		String newstr=new String();
		for(char v: arr)
		{
			if(newstr.indexOf(v)==-1)
			{
				newstr=newstr+v;
			}
		}
		
		return newstr;
	}

}
