package basicjavaprograms;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]  myList= {1.9,2.9,3.4,3.5};
		//print all elements in array
		for(int i=0;i<myList.length;i++)
		{
			System.out.println(myList[i]);
			
		}
		//adding all the elements
		double sum=0;
		for(int i=0;i<myList.length;i++)
		{
			sum=sum+myList[i];
			
		}
		System.out.println("the sum is:"+ sum);
		//finding the largest element
		double max=myList[0];
		for(int i=1;i<myList.length;i++)
		{
		if(myList[i]>max)
		{
		max=myList[i];	
		}
		
		}
		System.out.println("max is"+max);

	}

}
