package basicjavaprograms;
//java program to demonstrate object creation

public class Student {
	int stuage;	
	
	public Student(int year)
	{
		
		System.out.println("acdemic year"+year);
	}
	void setAge(int age)
	{
		stuage=age;
	}
	void getAge()
	{
		System.out.println("age of the student is"+stuage);
	}
	public static void main(String args[])
	{
		Student info=new Student(2021);
		info.setAge(5);
		info.getAge();
	}
	

}
