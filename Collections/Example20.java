package collectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class Example20 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Pizza");
		al.add("Corn Pizza");
		al.add("Paneer Masala");
		al.add("Panner Tika");
		al.add("Vadapav");
		System.out.println(al);
		Iterator<String> ii=al.iterator();
		while(ii.hasNext())
		{
			//String s=ii.next();
			
			if(ii.next().equals("Vadapav"))
			{
				ii.remove();
			}
		}
		System.out.println(al);
	}

}
