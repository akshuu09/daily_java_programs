package collectionsProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example19 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("k");
		al.add("s");
		al.add("h");
		al.add("u");
		System.out.println(al);
		ListIterator<String> li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("----------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
