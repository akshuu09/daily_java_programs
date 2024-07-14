class Example1
{
	Example1() // default constructor
	{
		this(100);    // transfer control to another constructor
		System.out.println("The Constructor");
	}
	Example1(int a)
	{
		System.out.println("1 args const");
	}
	
	public static void main(String args[])
	{
		Example1 e1=new Example1();      // object creation
		// Default Constructor is calling while object creation.
	}

}