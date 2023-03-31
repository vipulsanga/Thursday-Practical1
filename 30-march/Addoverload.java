// Write a program in java showing overloading of Add method with 2 and 3 parameters.
//In the user passes 2 values method with 2 parameter should be called if he passes 3
//values method with 3 parameters should be called

public class Addoverload {

	
		public void add(int a,int b)
		{
			System.out.println("method with 2 parameters:"+(20+30));
		}
		public void add(int a,int b,int c)
		{
			System.out.println("method with 3 parameters:"+(10+20));
		}


	
public class Useoverload
{
	public static void main(String args[])
	{
		Addoverload a1=new Addoverload();
		a1.add(10,20);
		a1.add(1,2,3);
	}
}
}
