package basicjavaprograms;

import java.util.Iterator;

public class passby {
	
	public static void main(String[] args) {
		 int a;
		 a=2;
		 int arr[]= {1,2};
		 System.out.println("number berfore passing :"+a);
		 passByValue(a);
		 System.out.println("number berfore passing :"+a);
		 
		 System.out.println("before passing :");
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		 
		passbyReference(arr);
		
		System.out.println("After passing :");
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void passbyReference(int[] arr) {
		arr[1]=10;
		 System.out.println("Inside The function:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void passByValue(int a) {
		a=3;
		System.out.println("number inside function :"+a);
	}

}
