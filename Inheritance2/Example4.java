class A
{
	int a=100;
	void m1()
	{
		System.out.println("Class A"+a);
	}
}
class B extends A
{
	int b=200;
	void m2()
	{
		System.out.pritnln("Class B"+b);
	}
}
class C extends A
{
	int c=300;
	void m3()
	{
		System.out.println("Class C"+c);
	}
}
class D
{
	int d=400;
	void m4()
	{
		System.out.println("Class D"+d);
	}
}
class Example4
{
	public static void main(String agrs[])
	{
		A a1=new A();System.out.println(a1.a);a1.m1();

		B b1=new B();System.out.println(b1.b);b1.m2();
		System.out.println(b1.a);b1.m1();

		C c1=new C();System.out.println(c1.c);c1.m3();
		System.out.println(c1.a);c1.m1();

		D d1=new D();System.out.println(d1.d);d1.m4();
		System.out.println(d1.a);d1.m1();
	}
}