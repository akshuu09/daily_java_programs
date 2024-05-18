package collectionsProgram;

import java.util.ArrayList;

public class Example12 {

	public static void main(String[] args) {
		
		//Generic collection
		ArrayList<Emp> al1=new ArrayList<Emp>();
		al1.add(new Emp(101,"Akshta"));
		
		// 1 approach
		for(Emp e:al1)
		{
			System.out.println(e.empId+" "+e.empName);
		}
		
		//2 approach
		Emp e=al1.get(0);
		System.out.println(e.empId+" "+e.empName);
		
	}

}
