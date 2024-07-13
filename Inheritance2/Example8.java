class A
{
	 public int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		//System.out.println("Addition is:"+c);
	}
}
class B extends A
{
	public int multi()
	{
		int p=3;
		int s=9;
		int x=p*s;
		return x;
		//System.out.println("Multiplication is:"+x);
	}
}
class Example8
{
	public static void main(String args[])
	{
		B a1=new B();
		System.out.println(a1.add());
		System.out.println(a1.multi());
		System.out.println("Ends....");
	}
}