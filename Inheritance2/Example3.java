class Demo2
{
	static int a=10;
	void m1()
	{
		System.out.println("under m1 method in parent class");
	}
}
class Example3
{
	void m1()
	{
		System.out.println("under m1 method in child class");
	}
	public static void main(String args[])
	{
		Example3 obj = new Example3();
		obj.m1();
		System.out.println(Demo2.a);
	}
}