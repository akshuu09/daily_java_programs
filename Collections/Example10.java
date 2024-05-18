package collectionsProgram;

import java.util.ArrayList;

public class Example10 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		
		// 1 approach
		ArrayList al2=new ArrayList(al1);
		al2.add(100);
		al2.add(200);
		System.out.println(al2);
		System.out.println(al2.containsAll(al1));
		al2.remove(0);
		System.out.println(al2);
		System.out.println(al2.containsAll(al1));
		al2.removeAll(al1);
		System.out.println(al2);
		al2.retainAll(al1);
		System.out.println(al2);
		
		
	}

}
