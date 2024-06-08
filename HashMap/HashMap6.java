package hashMap;

import java.util.HashMap;

public class HashMap6 {

	public static void main(String[] args) {
		HashMap hm1=new HashMap();
		hm1.put(11, "AA");
		hm1.put(12, "BB");
		System.out.println(hm1);
		HashMap hm2=new HashMap(hm1);
		hm2.put(111, "CC");
		hm2.put(222, "DD");
		System.out.println(hm2);
		HashMap hm3=new HashMap();
		hm3.putAll(hm2);
		hm3.put(101, "P");
		hm3.put(102, "Q");
		System.out.println(hm3);
		
		
	}

}
