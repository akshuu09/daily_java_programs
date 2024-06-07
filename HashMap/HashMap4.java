package hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap4 {

	public static void main(String[] args) {
		HashMap hm2=new HashMap();
		hm2.put(101, "Java");
		hm2.put(102, "Python");
		hm2.put(103, "DataBase");
		System.out.println(hm2);
		Set s=hm2.keySet();
		System.out.println(s);
		Collection c=hm2.values();
		System.out.println(c);
	}

}
