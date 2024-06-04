package linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet lhs2=new LinkedHashSet();
		lhs2.add(10);
		lhs2.add(20);
		lhs2.add(30);
		System.out.println(lhs2);
		
		LinkedHashSet lhs3=new LinkedHashSet(lhs2);
		lhs3.add('a');
		lhs3.add('b');
		lhs3.add('c');
		System.out.println(lhs3);
		
		LinkedHashSet lhs4=new LinkedHashSet();
		lhs4.addAll(lhs2);
		lhs4.add("Core");
		lhs4.add("Java");
		System.out.println(lhs4);
	}

}
