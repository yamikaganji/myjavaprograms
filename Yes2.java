package basicjavaprograms;

import java.util.Scanner;

public class Yes2 {

s	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter  y to print yes");
		char ip=sc.nextLine().charAt(0);
		if(ip=='y')
		{
			System.out.println("yes");
			break;
		}
		}
	}

}
