package basicjavaprograms;

import java.util.Scanner;

public class CharReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		String newstr=new String();
		newstr=str.replace('a', 'v');
		System.out.println(newstr);
	}


}
