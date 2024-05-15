package collectionsProgram;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		System.out.println(al1);
		al1.add(10);
		al1.add("Security");
		al1.add('A');
		al1.add(20.5f);
		
		Sample ss=new Sample(10,20.5f);
		al1.add(ss);
		System.out.println(al1);
		
	}

}
