

package basicjavaprograms;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] B=new int[size];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<size;i++)
		{
			B[i]=sc.nextInt();
		}
		System.out.print("the elements in the array are:");
		for(int j=0;j<size;j++)
		{
			System.out.print(B[j]+"  ");
		}
		

	}

}
