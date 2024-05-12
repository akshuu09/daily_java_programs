abstract class Sample1
{
	int a;
	Sample1()
	{
		a=20;
		System.out.println("0 args const");
	}
	abstract void m1();
     
}
class Example11 extends Sample1
{
	Example11()
	{
		super();
		System.out.println("0 args const---child class");
	}
	void m1()
	{
		System.out.println("M1 method in child class");
	}
	public static void main(String args[])
	{
		Example11 e11=new Example11();
		e11.m1();
	}
}

//non-static/instance bllock execute super() is present in constructor