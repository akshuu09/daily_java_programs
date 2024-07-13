//using return stmt

class A
{
	 public int add()   //int->method return  type
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
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
		
	}
}
class Example9
{
	public static void main(String args[])
	{
		B a1=new B();
		System.out.println(a1.add());
		System.out.println(a1.multi());
		System.out.println("Ends....");
	}
}