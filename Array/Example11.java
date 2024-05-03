class Example11
{
	public static void main(String agrs[])
	{
		Emp1[] e=new Emp1[3];
		e[0]=new Emp1(101, "Shinde Krishna");
		e[1]=new Emp1(102, "Shinde Abhijeet");
		e[2]=new Emp1(103, "Shinde Sunil");
		for(Emp1 ee:e)
		{
			System.out.println(ee.emp1Id+"-"+ee.emp1Name);
		}
	}
}