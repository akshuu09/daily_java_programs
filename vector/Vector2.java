package vector;

import java.util.Iterator;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("Technologies");
		v1.add("Robotics");
		v1.add("Earthquake");
		v1.add("Security");
		System.out.println(v1);
		
		Iterator<String> ii=v1.iterator();
		while(ii.hasNext())
		{
			
		}
		
	}

}
