//Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". Create a 
//child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type". 
//Create an object of the Car class and call both the "drive" and "Type" methods.
public class Vehical
{
	String brand="BMW";
	String model="Model A";
	int year=2020;
	void drive()
	{
		System.out.println("Brand="+brand);
		System.out.println("Model="+model);
		System.out.println("Year="+year);
		
	}
}
class Car extends Vehical
{
	String color="Red";
	void type()
	{
		System.out.println("car color="+color);
	}
}
class Useclass 
{
	public static void main(String args[])
	{
	Car c=new Car();
	c.drive();
	c.type();
	}
}
