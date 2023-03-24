// 3. Write a program to take 3 numbers and find the greatest of all


class Greatest
{
	public static void main(String args[])
	{
		int a=10,b=20,c=40;
		if(a>b && a>c)//cheching condition for a is greatest
		{
			System.out.println("a is greatest");
		}
		else if(b>a && b>c)//cheching condition for b greatest
		{
			System.out.println("b is greatest");
		}
		else
		{
			System.out.println("c is greatest");
		}
	}
}