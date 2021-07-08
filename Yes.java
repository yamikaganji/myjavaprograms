package basicjavaprograms;

import java.util.Scanner;

public class Yes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any character:");
		char i=sc.nextLine().charAt(0);//because next line contain
		if(i!='y') 
		{
			System.out.println("please enter y other wise program will terminate:");
			char p=sc.nextLine().charAt(0);
			if(p!='y')
			{
				System.exit(0);
			}
		}
		else if(i=='y')
		{
		System.out.println("yes");
		do
		{
			System.out.println("enter a character:");
			char p=sc.nextLine().charAt(0);
		}while(i=='y');
		if(p!='y')
		{
			System.exit(0);
		}
		
		
	}
		
  }
}
