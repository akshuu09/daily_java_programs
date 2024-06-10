package treeSet;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add(100);
		ts1.add(300);
		ts1.add(400);;
		ts1.add(5000);//compareTo()
		//ts1.add("Success");//compareTo()
		System.out.println(ts1);
	}

}
