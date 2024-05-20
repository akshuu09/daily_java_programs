package collectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Example16 {

	public static void main(String[] args) {
	ArrayList al1=new ArrayList();
	al1.add("A");
	al1.add("k");
	al1.add("s");
	Iterator i1=al1.iterator();
	while(i1.hasNext())
	{
		String s1=(String)i1.next();
		System.out.println(s1);
	}
	//Generic collection
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("h");
	al2.add("t");
	al1.add("a");//duplicate not allowed
	Iterator i2=al2.iterator();
	while(i2.hasNext())
	{
		String s2=(String)i2.next();
		System.out.println(s2);
	}

	}

}
