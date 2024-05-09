abstract class Class1
{
	Class1()
	{
		System.out.println("The 0 args Constructor--Class1");
	}
} 
class Example9 extends Class1
{
	Example9()
	{
		super();
		System.out.println("The 0 args Constructor--Example9");
	}
	public static void main(String args[])
	{
		new Example9();
	}
}

/* Constructor are allow in abstract class
super() is used to call another const within the super class.*/