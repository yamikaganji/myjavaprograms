package basicjavaprograms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size=sc.nextInt();
		int[] l=new int[size];
		int i;
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
		int m;
		int in=0;int fin=size-1;
		
		while(in<fin)
		{
			 m=(in+fin)/2;
		if(l[m]==a)
		{
			System.out.println("the element is found at "+ ( m+1)  + "  position");
			break;
		}
		else 
		{
			if(a<l[m])
			{
				fin=m-1;
				
			
			}
			else if (a>l[m])
			{
				in=m+1;
				
			}
			else 
			{
				fin=m-1;
			}
			
			
		}
	}
		
		if(in>fin)
		{
			System.out.println("the element not found");
		}
		
	}

}
