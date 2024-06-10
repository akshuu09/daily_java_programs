package treeSet;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add(100);
		ts1.add(300);
		ts1.add(400);;
		ts1.add(5000);
		System.out.println(ts1);
		
		ts1.add(100);
		ts1.add(300);
		ts1.add(400);;
		ts1.add(5000);
		System.out.println(ts1);
	}

}
