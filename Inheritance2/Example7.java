class A
{
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition is:"+c);
	}
}
class B extends A
{
	void multi()
	{
		int p=3;
		int s=9;
		int x=p*s;
		System.out.println("Multiplication is:"+x);
	}
}
class Example7 extends B
{
	public static void main(String args[])
	{
		Example7 a1=new Example7();
		a1.add();
		a1.multi();
		System.out.println("Ends....");
	}
}