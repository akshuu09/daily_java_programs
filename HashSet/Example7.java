package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Example7 {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding duplicate elements
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                           + h.contains("India"));

        // Removing items from HashSet
        // using remove() method
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                           + h);

        // Display message
        System.out.println("Iterating over list:");

        // Iterating over hashSet items
        Iterator<String> i = h.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements
            // using next() method
            System.out.println(i.next());

	}

}
