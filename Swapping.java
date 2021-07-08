package basicjavaprograms;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a=sc.nextInt();
		System.out.println("enter the value of b:");
		int b=sc.nextInt();
		System.out.println("the values before swapping are a:"+ a +" value of b:"+ b);
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("the values after swapping are a:"+ a +"  value of b:"+ b);
		
		}

}
