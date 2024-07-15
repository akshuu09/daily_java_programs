class Example4
{
	int a;
	String str;
	Example4(int a,String str)
	{
		this.a=a;
		this.str=str;
		System.out.println("argument constructor");

	}
	public static void main(String args[])
	{
		Example4 e4=new Example4(100,"Success");
	}
}