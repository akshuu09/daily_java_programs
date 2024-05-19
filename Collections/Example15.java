package collectionsProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example15 {

	public static void main(String[] args) {
		// ListIterator
		ArrayList al=new ArrayList();
		al.add('a');
		al.add('k');
		al.add('s');
		al.add('h');
		al.add('u');
		System.out.println(al);
		
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			Character c=(Character)li.next();
			System.out.println(c);
		}
		

	}

}
