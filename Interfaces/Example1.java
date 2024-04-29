abstract class Sample
{
	abstract void demo();
}
class Abstract extends Sample
{
	void demo()
	{
		System.out.println("In method demo");
	}
}
class Example1 
{
	
	public static void main(String args[])
	{
		System.out.println("Start.....");
		Abstract  as=new Abstract();
		as.demo();
		System.out.println(".....Stop");
		
	}
}