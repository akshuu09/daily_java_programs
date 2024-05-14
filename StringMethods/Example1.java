class Demo
{
	int var1=100;
	class Sample
	{
		float var2=200.5f;
	}
}
class Example1
{
	public static void main(String agrs[])
	{
		Demo d=new Demo();
		System.out.println(d.var1);
		Demo.Sample s=d.new Sample();
		System.out.println(s.var2);
	}

}