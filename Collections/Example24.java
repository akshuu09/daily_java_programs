

//Sorting of  collection and extract data

package collectionsProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Example24 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Google");
		al.add("Amazon");
		al.add("Wipre");
		al.add("Cognizant");
		al.add("Flipkart");
		System.out.println(al);
		Collections.sort(al);
		
		Iterator i=al.iterator();
		for(String ss:al)
		{
			System.out.println(ss);
		}
		
		
	}

}
