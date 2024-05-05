class Example18
{
	public static void main(String args[])
	{
		Object[] obj=new Object[3];
		obj[0]=new Stud(101, "Akshu");
		obj[1]=new Emp(201, "Chiu");
		obj[2]=(100);
		for(Object o:obj)
		{
			if(o instanceof Stud)
			{
				Stud s=(Stud)o;
			System.out.println(s.studId+"-"+s.studName);
			}
			else if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				System.out.println(e.empId+"-"+e.empName);
			}  
			else if(o instanceof Integer)
			{
		      Integer i=(Integer)o;
			  System.out.println(i);
			}
		}
	}
}