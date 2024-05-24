package collectionsProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Example26 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(635);
		al1.add(896);
		al1.add(568);
		al1.add(32);
		al1.add(43);
		System.out.println(al1);
		
		Collections.sort(al1);
		System.out.println(al1);
		
	}

}
