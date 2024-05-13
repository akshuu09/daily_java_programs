abstract class Class1
{
	int a;
	static
	{
		System.out.println("static block");
	}
	{
		a=10;
		System.out.println("non static block"+a);
	}
	void m1()
	{
		System.out.println("m1 method"+a);
	}
	Class1()
	{
		a=100;
		System.out.println("Constructor"+a);
	}
}
class Example13 extends Class1
{
	public static void main(String args[])
	{
		Example13 e13=new Example13();
		e13.m1();
	}
}