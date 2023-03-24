class Calculator
{
	int a,b;
	Calculator(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("Addition="+(a+b));//addition
		System.out.println("Substraction="+(a-b));//substraction
		System.out.println("Multipication="+(a*b));//multiplicaation
		System.out.println("Division="+(a/b));//division
	}
}
class Result
{
	public static void main(String args[])
	{
		Calculator c1=new Calculator(30,50);//assinging valuse
		c1.display();
	}
}