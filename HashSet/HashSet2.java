package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {

	public static void main(String[] args) {
		HashSet hs2=new HashSet();
		hs2.add(30);
		hs2.add(20);
		hs2.add(21);
		hs2.add(59);
		hs2.add(null);
		
		Iterator<Integer> i2=hs2.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}

}
