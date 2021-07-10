package basicjavaprograms;

import java.util.Scanner;

public class week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w[]= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("the name of the week is :" +w[n-1]);
	}

}
