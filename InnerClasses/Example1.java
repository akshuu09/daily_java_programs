class Demo1
{
	int var1=20;
	class Sample1
	{
		float var2=100.5f;
	}
}
class Example1
{
	public static void main(String args[])
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.var1);
		Demo1.Sample1 s1=d1.new Sample1();
		System.out.println(s1.var2);
	}
}