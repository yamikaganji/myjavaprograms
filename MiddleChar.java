package basicjavaprograms;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=sc.nextLine();
		int i=str.length()/2;
		System.out.println("the entered String is:"+str);
		System.out.println("the middle character is: "+str.charAt(i));
	}

}
