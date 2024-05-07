abstract class Sample
{
	abstract void m1();
}
class Demo extends Sample
{
   void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Example2
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.m1();
	}
}