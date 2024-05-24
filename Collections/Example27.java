package collectionsProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Example27 {

	public static void main(String[] args)
	{
		ArrayList<Swiggy>al=new ArrayList<Swiggy>();
		al.add(new Swiggy(301,"Idly Vada"));
		al.add(new Swiggy(203,"Poha"));
		al.add(new Swiggy(201,"Misal"));
		al.add(new Swiggy(401,"Chai"));
		al.add(new Swiggy(101,"Panipuri"));
		al.add(new Swiggy(221,"Bread Toast"));
		
		//extract data
		for(Swiggy s:al)
		{
			System.out.println(s.itemId+" "+s.itemName);
		}
		
		System.out.println("_________________________________");
		
		Collections.sort(al);
		for(Swiggy s:al)
		{
			System.out.println(s.itemId+"-"+s.itemName);
		}
		
		
		
	}

}
