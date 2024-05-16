package collectionsProgram;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Emp> e=new ArrayList<Emp>();
		e.add(new Emp(101,"sonali"));
		e.add(new Emp(102,"vaishnavi"));
		e.add(new Emp(103,"revati"));
		for(Emp ee:e)
		{
			System.out.println(ee.empId+" "+ee.empName);
		}
	}

}
