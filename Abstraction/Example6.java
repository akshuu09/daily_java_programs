abstract class Class1
{
	abstract void myMethod1();
	abstract void myMethod2();
}
abstract class Class2 extends Class1
{
	void myMethod1()
	{
		System.out.println("This is the implementation of myMethod1");

	}
	void myMethod2()
	{
		System.out.println("This is the implementation of myMethod2");
	}
}
class Example6
{
	public static void main(String args[])
	{
	    Class2 c2=new Class2();
		c2.myMethod1();
		c2.myMethod2();
	}
}