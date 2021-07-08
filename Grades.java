package basicjavaprograms;

import java.util.Scanner;

public class Grades {
	
	public static String grade(int marks)
	{
		String grade;
		if(marks>=90)
		{
			grade="A";
			
		}
		else if(marks>=75)
		{
			grade="B";
		}
		else if(marks>=60)
		{
			grade="c";
		}
		else if(marks>=50)
		{
			grade="d";
		}
		else
		{
			grade="f";
		}
		return grade;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks of the student:");
		int marks=sc.nextInt();
		String m=grade(marks);
		System.out.println("the grade of the student is:"+m);

	}

}
