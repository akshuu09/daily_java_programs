package collectionsProgram;

import java.util.Enumeration;
import java.util.Vector;

public class Example13 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);
		Enumeration e=v.elements();//address
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
