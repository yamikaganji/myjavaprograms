package basicjavaprograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] l=new int[size];
		int i;int j;
		System.out.println("enter the elements of the array: ");
		for(i=0;i<size;i++)
		{
			l[i]=sc.nextInt();
		}
		System.out.print("the elements of the array are: ");
		for(i=0;i<size;i++)
		{
			System.out.print(l[i]+"  ");
		}
		System.out.println(" ");
		System.out.print("enter the element to search: ");
		int a=sc.nextInt();
		 
		for(i=0;i<size;i++)
		{
				if(l[i]==a)
				{
					
				System.out.println("the element found at: "+ (i+1)  + "position");
					break;
				}
				
			}
		if(i==size)
		{
			System.out.println("the element not found");
		}
		
		
		}
	}


