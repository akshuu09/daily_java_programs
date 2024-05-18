package collectionsProgram;

import java.util.ArrayList;

public class Example11 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(new Emp(101,"Soham"));
		
		//1 approach
		for(Object o:al1)
		{
			Emp e=(Emp)o;
		    System.out.println(e.empId+" "+e.empName);
		}
		
		// 2 approach
		Object o=al1.get(0);
		Emp e=(Emp)o;
		System.out.println(e.empId+" "+e.empName);
	}

}
