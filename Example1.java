class Demo
{
	int a=10;
	static float b=20.5f;
	void m2()
	{
		System.out.println("In Demo class -m2 method");
		Sample s1=new Sample();
		s1.m1();
	}
	static class Sample
	{
		void m1()
		{
			System.out.println("In static class sample-m1 method");
			Demo dd=new Demo();
			System.out.println(dd.a+b);
		}
	}
}
class Example1
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.m2();
	}
}
