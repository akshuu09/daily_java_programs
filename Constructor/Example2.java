class Example2
{
	int a;
	String str;
	Example2(int a,String str)
	{
		this(101,"Software");
		this.a=a;
		this.str=str;
	}
	Example2()
	{
		
		System.out.println("Constructor...");
	}
	public static void main(String agrs[])
	{
		Example2 e2=new Example2();
	}
}

/*Example2.java:7: error: recursive constructor invocation
                this(101,"Software");

java does not support recursive constructor calling */