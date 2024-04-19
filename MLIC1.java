// MethodLocalInnerClass...
class Demo1
{
	void method()
	{
		class Demo2
		{
			int a=100;

		}
		Demo2 dd2=new Demo2();
		System.out.println(dd2.a);
	}
}
class MLIC1
{
	public static void main(String args[])
	{
		System.out.println("Start.....");
		Demo1 dd1=new Demo1();
		dd1.method();
		System.out.println(".....Stop");
	}
}
