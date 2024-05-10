 class Demo1
{
	Demo1()
	{
		System.out.println("constructor 1---");
	}
}
class Super
{
	Super()
	{
		super();
		System.out.println("constructor 2.....");
	}

	public static void main(String args[])
	{
		Super ss=new Super();
		Demo1 d1=new Demo1();
	}
}
// Calling another constructor with super() method..