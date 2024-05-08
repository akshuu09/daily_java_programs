abstract class Demo
{
	abstract method m1();
	abstract method m2();
}
class Example5 extends Demo
{
	void m1()
	{
		System.out.println("memethod in normal class");
	}
	public static void main(String absc[] )
	{
		Example5 e5=new Example5();
		e5.m1();
	}
}
//Example5.java:3: error: cannot find symbol
        //abstract method m1();