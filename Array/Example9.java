class Example9
{
	public static void main(String args[])
	{
		Emp e1=new Emp(101, "Akshta");
		Emp e2=new Emp(202, "Diksha");
		Emp e3=new Emp(303, "Rutuja");
		Emp[] e=new Emp[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for(int i=0; i<e.length; i++)
		{
			Emp ee=e[i];
			System.out.println(ee.empId+" - "+ee.empName);
		}
	}
}