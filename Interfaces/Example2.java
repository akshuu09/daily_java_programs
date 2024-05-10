interface Sample1
	{
		void m1();
		void m2();
	}
class Example2 extends Sample
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
	public static void main(String args[])
	{
		Example2 e2=new Example2();
		e2.m1();
		e2.m2();
		Sample1 s1=new Example2();
		s1.m1();
		s1.m2();
		
	}
}
