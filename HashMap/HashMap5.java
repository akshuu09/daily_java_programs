package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {
		HashMap hm2=new HashMap();
		hm2.put(101, "Java");
		hm2.put(102, "Python");
		hm2.put(103, "DataBase");
		System.out.println(hm2);
		Set s=hm2.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
