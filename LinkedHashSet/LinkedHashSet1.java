package linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(100);
		lhs1.add(200);
		lhs1.add(3000);
		System.out.println(lhs1);
		lhs1.add(100);
		lhs1.add(null);
		System.out.println(lhs1);
	}

}
