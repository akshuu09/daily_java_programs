package listSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {

	public static void main(String[] args) {
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Java");
		    cars.add("Python");
		    cars.add("Javascript");
		    cars.add("SQL");

		    Collections.sort(cars, Collections.reverseOrder()); // Sort myNumbers

		    for (String i : cars) {
		      System.out.println(i);
	}

}
}
