package hashSet;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(50);
		hs1.add(null);
		hs1.add(10);
		System.out.println(hs1);
	}

}
