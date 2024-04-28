import java.io.Serializable;
class Student implements Serializable
{
	
		int studid;
		String studname;
		Student(int studid,String studname)
	{
		this.studid=studid;
		this.studname=studname;

	}
	
}