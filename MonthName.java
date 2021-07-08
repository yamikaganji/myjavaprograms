package basicjavaprograms;

import java.util.Scanner;
	 
public class MonthName {
	static String[] month;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String months[]= {"january","february","march","april","may","june","july","august ","september ","october ","november ","december "};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number from 1 to 12:");
		int n=sc.nextInt();
		System.out.println(months[n-1]);
		if(n>12)
		{
			System.out.println("enter a valid number:");
		}
		

	}

}
