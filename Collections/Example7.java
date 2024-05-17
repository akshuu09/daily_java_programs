package collectionsProgram;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Failure");
		al.add('X');
		al.add(true);
		al.add(10.5f);
		System.out.println(al);
		al.add(1,"Cyber");
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
	}

}
