class Sample implements Cloneable
{
	int studId;
	String studName;
	Sample(int studId,String studName)
	{
		this.studId=studId;
		this.studName=studName;
	}
	void studInfo()
	{
		System.out.println("Stud id is"+studId+"Stud name is"+studName);
	}
	protected Object clone()
	{
		try
		
			{
				return super.clone();//new obj
			}
			
		
		catch (CloneNotSupportedException cn)
		{
			return this;//current obj ->new Sample();
		}
	}
}
class CloneExample
{
	public static void main(String args[])
	{
		Sample s1=new Sample(101,"Krishna");
		//obj1.studInfo();
		Object obj2=s1.clone();
		System.out.println(s1);
		System.out.println(obj2);
	}
}