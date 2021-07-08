package basicjavaprograms;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n;
		int m;
		int lcm=0;
		n=(a>b)?a:b;
		m=a*b;
		for(int i=n;i<=m;i++)
		{
			if(i%a==0&&i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println("lcm of two numbers is:"+lcm);
		

	}

}
