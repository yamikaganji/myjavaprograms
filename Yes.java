package basicjavaprograms;

import java.util.Scanner;

public class Yes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("enter a character");
			Scanner sc=new Scanner(System.in);
			char i=sc.nextLine().charAt(0);
		if(i=='y')
		{
		System.out.println("yes");
	
		}
		
		if(i!='y')
		{
			System.exit(0);
		}
		}
  }
}
