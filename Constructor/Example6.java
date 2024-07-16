class Demo
{
	int a;
	void m1()
	{
		System.out.println("Method of Demo class");
	}
	Demo(int a)
	{
		this.a=a;
		System.out.println("Constructor of Demo class");
	}
}
class Example6
{
	public static void main(String agrs[])
	{
		Demo d=new Demo(100);
		d.m1();
	}
}