package basicjavaprograms;

import java.util.Scanner;

public class Houses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number of houses: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] h=new int[n];
		System.out.println("enter the values:");
		int max=0;
		for(int i=0;i<n;i++)
		{
			h[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(s[i]>s[j])
			{
				max=s[i];
			}
			}
		}
	}

}
