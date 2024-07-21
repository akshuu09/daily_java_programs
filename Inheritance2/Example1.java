class Demo
{
	
	void method()
	{
		System.out.println(" non static method");
	}
}
class Example1 extends Demo
{
	public static void main(String args[])
	{
		Example1 obj = new Example1();
		obj.method();
	
	}
}