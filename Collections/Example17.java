package collectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Example17 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add("dev");
		al1.add("text");
		al1.add("cust");
		
		//Normal cursor
		Iterator i1=al1.iterator();
		while(i1.hasNext())
		{
			String s1=(String)i1.next();
			System.out.println(s1);
		}
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Sr dev");
		al2.add("Sr text");
		
		//Generic cursor
		Iterator<String> i2=al2.iterator();
		while(i2.hasNext())
		{
		   System.out.println(i2.next());
		}
	}

}
