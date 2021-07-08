package basicjavaprograms;
//java program to demonstrate non-parameterized constructor

 public class ConsDemo1
{
	 int id;
		String name;
		ConsDemo1(int rno)
		{
			
			id=43;
			name="yamika";
			System.out.println("rno is"+ rno);
		}
		void show()
		{
			//System.out.println("name is"+ name);
			//System.out.println("id is"+ id);
			//System.out.println("rno is"+ rno);
			
		}
		
	public static void main(String args[])
	{
		ConsDemo1 s1=new ConsDemo1(4);
		System.out.println("name is"+s1. name);
		System.out.println("id is"+ s1.id);
		//s1.show();
	}
}
