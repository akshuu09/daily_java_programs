abstract class Sample
{
	abstract void m1();
	abstract void m2();
}
class Example2 extends Sample
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	void m2()
	{
		System.out.println("Inside m2 method");
	}
	public static void main(String args[])
	{
		Example2 e2=new Example2();
		e2.m1();
		e2.m2();
	}
}