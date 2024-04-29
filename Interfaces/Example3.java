abstract class Demo
{
	abstract void method1();
	abstract void method2();
	abstract void method3();
}
class Example3 extends Demo
{
	void method1()
	{
		System.out.println("method1");
	}
	void method2()
	{
		System.out.println("method2");
	}
	public static void main(String args[])
	{
		Example3 e3=new Example3();
		e3.method1();
	}
}

// Output:
//error: Example3 is not abstract and does not override abstract method method3() in Demo
//class Example3 extends Demo