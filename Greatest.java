package basicjavaprograms;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		System.out.println("enter c value:");
		int c=sc.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println("a is the greatest number "+  a );
		
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is the greatest number"+ b);
		}
		else
		{
			System.out.println("c is the greatest number"+ c);
		}

	}

}
