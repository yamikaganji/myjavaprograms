package basicjavaprograms;
//java program to demonstrate local variables
public class Test1 {
	void age()
	{
		int age=0;//local variables should be intialized
		age=age+3;
		System.out.println("age is:"+age);
	}
	public static void main(String args[])
	{
		Test1 t=new Test1();
		t.age();
	}

}
