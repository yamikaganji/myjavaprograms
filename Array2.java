package basicjavaprograms;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] C=new int[size];int sum=0;
		System.out.println("enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			C[i]=sc.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			
			sum=sum+C[j];
			
			//System.out.println("sum of the elements is:"+sum);
		}
		System.out.println("sum of the elements is:"+sum);

	}

}
