class Example14
{
	public static void main(String args[])
	{
		Stud1[] s=new Stud1[3];
		s[0]=new Stud1(1,"A");
		s[1]=new Stud1(2,"B");
		s[2]=new Stud1(3,"C");
		for(Stud1 ss:s)
		{
			System.out.println(ss.studId+"--"+ss.studName);
		}
	}
}