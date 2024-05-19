package collectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Example14 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add("Nothing");
		al1.add("Or");
		al1.add("Everything");
		System.out.println(al1);
		Iterator i=al1.iterator();
		while(i.hasNext())
		{
			String s=(String)i.next();
			System.out.println(s);
		}
	}

}
