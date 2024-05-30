package vector;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("vectorData");
		v1.add('S');
		v1.add(100);
		v1.add(3.5f);
		v1.add(null);
		v1.add(100);
		System.out.println(v1);
	}

}
