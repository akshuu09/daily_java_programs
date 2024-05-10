interface Sample
	{
		void m1();
	}
class Example1 
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String args[])
	{
		System.out.println("Start.....");
	        Example1 e1=new Example1();
		e1.m1();
		System.out.println(".....Stop");
		
	}
}
