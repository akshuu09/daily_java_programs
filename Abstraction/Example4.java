abstract class Sample
{
	abstract void method1();
	abstract void method2();
} 
class Example4 extends Sample
{
	void method1()
	{
		System.out.println("parent Abstact method1 inherit in child class");
	}
	void method2()
	{
		System.out.println("parent Abstact method1 inherit in child class");
	}
	public static void main(String args[])
	{
		System.out.println("Star...");
		Example4 e4=new Example4();
		e4.method1(); e4.method2();
		System.out.println("...Stop");
	}
}