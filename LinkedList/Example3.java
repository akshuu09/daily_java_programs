package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

import collectionsProgram.Emp;



public class Example3 {

	public static void main(String[] args) 
	{
		LinkedList<Divinity> ll1=new LinkedList<Divinity>();
		ll1.add(new Divinity(1,"Shiv"));
		ll1.add(new Divinity(2,"Shivam"));
		ll1.add(new Divinity(3,"Shivay"));
		ll1.add(new Divinity(4,"Shivansh"));
		
		Iterator<Divinity> i=ll1.iterator();
		while(i.hasNext())
		{
			Divinity d=i.next();
			System.out.println(d.Id+"-"+d.Name);
		}
	}

}
