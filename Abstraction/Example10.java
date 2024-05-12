abstract class Class1
{
	int a;
	Class1()
	{
		a=10;
		System.out.println("0 args Constructor");
	}
	abstract void m1();
} 
class Example10 extends Class1
{
	void m1()
	{
		System.out.println("Method in child class");
	}
	public static void main(String args[])
	{
		Example10 e10=new Example10();
		e10.m1();
	}
}
// non-static variables are also called in the concept of inheritance