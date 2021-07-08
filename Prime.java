package basicjavaprograms;


import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of the numbers:");
		int n=sc.nextInt();
		boolean flag=false;
		System.out.println("the prime numbers are:");
		for(int i=0;i<=n;i++)
		{
			if(isPrime(i))
		
		{
		System.out.print(i+" ");
		}
		}

	}


private static boolean isPrime(int n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
}