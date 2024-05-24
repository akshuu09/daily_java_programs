
//Sorting the collection

package collectionsProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Example25 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Paneer");
		al.add("Misal");
		al.add("Pizza");
		al.add("Burger");
		al.add("Sweet");
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}
