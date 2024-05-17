package collectionsProgram;

import java.util.ArrayList;

public class Example8 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Cyber");
		al.add('A');
		al.add(true);
		System.out.println(al);
		System.out.println(al.contains('A'));
		System.out.println(al.size());
	}

}
