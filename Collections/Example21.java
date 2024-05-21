package collectionsProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example21 {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(101,"Mahesh"));
		al.add(new Emp(202,"Krishna"));
		al.add(new Emp(303,"Sam"));
		al.add(new Emp(404,"John"));
		
		for(Emp e:al)
		{
			System.out.println(e.empId+"  "+e.empName);
		}
		System.out.println("__________________________");
		
		//ListIterator
		ListIterator<Emp> li=al.listIterator();
		while(li.hasNext())
		{
			Emp e=li.next();
			if(e.empName.equals("John"))
			{
				li.remove();
				li.add(new Emp(404,"Samir"));
			}
		}
		for(Emp e:al)
		{
			System.out.println(e.empId+"--"+e.empName);
		}
		
	}

}
