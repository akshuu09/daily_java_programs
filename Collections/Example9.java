package collectionsProgram;

import java.util.ArrayList;

public class Example9 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		
		// 1 approach
		ArrayList al2=new ArrayList(al1);
		al2.add(100);
		al2.add(200);
		al2.add(300);
		System.out.println(al2);
		
		//2 approach
		ArrayList al3=new ArrayList();
		al3.addAll(al1);
		al3.add(1000);
		al3.add(2000);
		al3.add(3000);
		System.out.println(al3);
	}

}
