class Example12
{
	
	public static void main(String args[])
	{
		m1();
		
		int[] aa=m1();
		for(int i=0; i<aa.length; i++)
		{
			System.out.println(aa[i]);
		}

	}
	static int[] m1()
	{
		System.out.println("Inside m1 method");
		int[] a={10,20,30};
		return a;
	}
}