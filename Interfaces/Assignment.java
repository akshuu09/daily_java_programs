abstract class Demo
{
	Demo()
	{
		System.out.println("0 args const--sample");
	}
}

class Assignment extends Demo
{
	public static void main(String args[])
	{
		Demo d=new Assignment();

	}
}