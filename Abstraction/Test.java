abstract class Demo
{
	abstract void myChild();
	void myParent()
		{
		System.out.println("This is the non-abstract method");
	}
}
class Test extends Demo
{
	void myChild()
	{
		System.out.println("This is the abstract method");
	}

	public static void main(String args[])
	{
		Test t=new Test();
		t.myChild();
		t.myParent();
	}
}