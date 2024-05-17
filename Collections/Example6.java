package collectionsProgram;

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Failure");
		al.add('A');
		al.add(100);
		al.add(true);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		Integer i1=100;
		al.remove(i1);
		System.out.println(al);
	}

}
