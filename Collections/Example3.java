package collectionsProgram;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		Emp e1=new Emp(101,"Emp1");
		Stud s1=new Stud(1,"Stud1");
		Integer i1=1000;
		ArrayList al=new ArrayList();
		al.add(e1);
		al.add(s1);
		al.add(i1);
		for(Object o:al)
		{
			if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				System.out.println(e.empId+" "+e.empName);
			}
			else if(o instanceof Stud)
			{
				Stud s=(Stud)o;
				System.out.println(s.studId+" "+s.studName);
			}
			else if(o instanceof Integer)
			{
				Integer i=(Integer)o;
				System.out.println(i);
			}
		}
	}

}
