class ParentClass
{
	int var1=10;
	class ChildInnerClass
	{
		float var2=30.5f;
		void method()
		{
			System.out.println("Method in childInnerClass");
			System.out.println(var1+var2);
		}
	}
}
class Example2
{
	public static void main(String args[])
	{
		new ParentClass().new ChildInnerClass().method();
	}
}