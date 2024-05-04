class Example13
{
	public static void main(String args[])
	{
		String[] s={"Cyber","Success","Traning"};
		Example13 ref=new Example13();
		ref.m1(s);
	}
	void m1(String[] ss)
	{
		System.out.println("Inside m1 method");
		for(String s:ss)
		{
			System.out.println(s);
		}
	}
}