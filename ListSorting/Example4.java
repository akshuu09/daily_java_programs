package listSorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		List<String> list= new LinkedList<>();  
		list.add("Renu");  
		list.add("Heera");  
		list.add("Vijay");  
		list.add("Geetanjali");  
		System.out.println("List : "+list);  
		//will sort the string acc to the alphabets  
		Collections.sort(list);  
		System.out.println("Sorted List : "+list);  
	}

}
