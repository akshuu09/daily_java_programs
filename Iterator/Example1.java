package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	  
	    // Get the iterator
	    Iterator<String> it = cars.iterator();
	  
	    // Print the first item
	    System.out.println(it.next());
	}

}
