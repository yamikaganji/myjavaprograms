
package basicjavaprograms;
import java.lang.*;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] b=new double[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		Double p=sc.nextDouble();
		System.out.println("enter the tenture years:");
		int y=sc.nextInt();
		Double sum=0.0;int l=0;
		for(int k=0;k<2;k++)
		{
			System.out.println("enter no.of slabs:");
			int s=sc.nextInt();
			
				for(int i=0;i<s;i++)
				{
				System.out.println("enter the  time period:");
				int yr=sc.nextInt();
				System.out.println("enter the monthly intrest rate:");
				Double in=sc.nextDouble();
				Double O=Math.pow((1+in),yr*12);
				double emi=(p*in)/((1-1)/O);
				sum=sum+emi;
				O=0.0;
				emi=0;
			}
			b[l++]=sum;
		}
		if(b[0]<b[1])
		{
			System.out.println("bank a");
		}
		else
		{
			System.out.println("bank b");
		}
	}

	}
