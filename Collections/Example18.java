package collectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Example18 {

	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(101,"emp1"));
		al.add(new Emp(202,"emp2"));
		al.add(new Emp(303,"emp3"));
		
		Iterator i1=al.iterator();//Normal cursor
		while(i1.hasNext())
		{
			Emp ee=(Emp)i1.next();
			System.out.println(ee.empId+" "+ee.empName);
		}
		System.out.println("**************************");
		//generic cursor
		Iterator<Emp> i2=al.iterator();
		while(i2.hasNext())
		{
		   Emp e2=(Emp)i2.next();
		   System.out.println(e2.empId+" "+e2.empName);
		}
	}
}
