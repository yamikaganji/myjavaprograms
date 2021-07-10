package basicjavaprograms;

import java.util.Scanner;

public class CharReplace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		System.out.println("enter the charcter to replace:");
		char oldch=sc.nextLine().charAt(0);
		System.out.println("enter the character to be replaced:");
		char newch=sc.nextLine().charAt(0);
		String newstr=new String();
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==oldch)
			{
				newstr=newstr+newch;
				flag++;
			}
			else
			{
				newstr=newstr+str.charAt(i);
			}
		}
		//System.out.println(newstr);
		if(flag==0)
		{
			System.out.println("no character to replace");
		}
		else
		{
			System.out.println("after replacing string is:" +newstr);
		}
	}

}
