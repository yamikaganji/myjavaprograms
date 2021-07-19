package basicjavaprograms;

import java.util.Scanner;

public class Area {
	public static float area(float l,float b)
	{
		float A1=(l*b)/2;
		return A1;
	}
	public static double area(double r)
	{
		// caluculate area of the circle
		double A2=3.14*r*r;
		return A2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("choose one option from below\n1.triangle\n2.square");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
		{
			System.out.println("enter length of the triangle:");
			float l=sc.nextFloat();
			System.out.println("enter breadth of the triangle:");
			float b=sc.nextFloat();
			float A=area( l,b);
			System.out.println("area of the triangle is:"+A);
			break;
		}
		case 2:
		{
			System.out.println("enter the radiusof the circle:");
			double r=sc.nextDouble();
			double A2=area(r);
			System.out.println("area of the circle is:"+A2);
			break;
		}
		
		}
	}
	

}
