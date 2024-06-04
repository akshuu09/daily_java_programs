package linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	public static void main(String[] args) {
		LinkedHashSet<Character> lhs3=new LinkedHashSet<Character>();
		lhs3.add('a');
		lhs3.add('b');
		lhs3.add('c');
		Iterator<Character> i=lhs3.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
