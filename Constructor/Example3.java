class Example3
{
	int studId;
	String studName;
	Example3(int studId,String studName)
	{
		this.studId=studId;
		this.studName=studName;
	}
	Example3()
	{
		this(01,"Akshta");
		System.out.println("0 args Constructor");
	}

	public static void main(String args[])
	{
		Example3 e3=new Example3();
	}
}

/*
Within Constructor we can use this()method,& this keyword together */