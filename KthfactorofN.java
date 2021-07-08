package basicjavaprograms;

import java.util.Scanner;

public class KthfactorofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N value:");
		int N=sc.nextInt();
		System.out.println("enter k value:");
		int k=sc.nextInt();
		int count=0;
		for(int i=N;i>=1;i--)
		{
			
			if(N%i==0)
				count++;
				if(count==k)
				{
					System.out.println(i);
					break;
				}
		}
		if(count!=k)
		System.out.println(1);

	}

}
