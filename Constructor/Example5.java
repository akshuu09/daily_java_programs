class Example5
{
	int a;
	Example5()
	{
		this(200);
		System.out.println("Constructor 1..");
	}
	Example5(int a)
	{
		this.a=a;
		System.out.println("Constructor 2..."+this.a);
	}
	void m1()
	{
		this();
		System.out.println("Method m1");
	}
	public static void  main(String args[])
	{
		Example5 e5=new Example5();
		e5.m1();
	}
}

/*
Example5.java:16: error: call to this must be first statement in constructor
                this();
we can not use this() stmt/method it can only used in the constructor 
but this keyword is used in method.*/