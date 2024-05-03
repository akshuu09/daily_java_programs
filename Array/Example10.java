class Example10
{
	public static void main(String args[])
	{
		Stud s1=new Stud(01, "Akshta");
		Stud s2=new Stud(02, "Saroja");
		Stud s3=new Stud(03, "Divya");
		Stud[] s=new Stud[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		for(Stud ss:s)
		{
			System.out.println(ss.studId+" - "+ss.studName);
		}
	}
}