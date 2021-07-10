package basicjavaprograms;

import java.util.Scanner;

public class Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("choose your option below:");
		System.out.println("1.hello1 \n2.hello2 \n3.hello3 \n4.hello4 \n5.hello5 \n6.exit");
		while(true)
		{
		int op=sc.nextInt();
		switch(op)
		{
		case 1:System.out.println("hello1");
		break;
		case 2:System.out.println("hello2");
		break;
		case 3:System.out.println("hello3");
		break;
		case 4:System.out.println("hello4");
		break;
		case 5:System.out.println("hello5");
		break;
		case 6:System.exit(0);
		default:System.out.println("invalid input ");

		System.out.println("choose your option below:");
		System.out.println("1.hello1 \n2.hello2 \n3.hello3 \n4.hello4 \n5.hello5 \n6.exit");
		}
		
		}
	}

}
