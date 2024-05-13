 class Demo1
{
	Demo1()
	{
		System.out.println("constructor 1---");
	}
}
class Example12 
{
	Example12()
	{
		super();
		System.out.println("constructor 2.....");
	}

	public static void main(String args[])
	{
		Example12 e12=new Example12();
		Demo1 d1=new Demo1();
	}
}