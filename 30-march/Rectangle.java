//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
//two methods to print the area and perimeter of the rectangle respectively. 
//Its constructor having parameters for length and breadth is used to initialize length and breadth
 //of the rectangle.
//Print the area and perimeter of a rectangle

import java.util.Scanner;
public class Rectangle
{
	double length,breadth;
	Rectangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lenth:");
		this.length=sc.nextDouble();
		System.out.print("Enter breadth:");
		this.breadth=sc.nextDouble();
	}
	void area()
	{
		System.out.println("Area="+(length*breadth));
	}
	void perimeter()
	{
		System.out.println("Perimeter="+(2*(length+breadth)));
	}
public class Findarea
	{
		public static void main(String args[])
		{
			Rectangle r=new Rectangle();
			r.area();
			r.perimeter();
		}
}
}