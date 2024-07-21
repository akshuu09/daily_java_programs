class Demo1
{
	static void method(){
		System.out.println("Under static method");
	}
}
class Example2 extends Demo1
{
	public static void main(String args[])
	{
		Example2 obj =new Example2();
		obj.method();
	}
}