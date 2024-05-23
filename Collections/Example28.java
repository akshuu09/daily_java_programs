package collectionsProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Example28 {

	public static void main(String[] args) {
		ArrayList<Flipkart> al=new ArrayList<Flipkart>();
		al.add(new Flipkart(11999, "HomeDecor"));
		al.add(new Flipkart(2999,  "Toy&Baby"));
		al.add(new Flipkart(10999, "Mens"));
		al.add(new Flipkart(12999, "Womens"));
		al.add(new Flipkart(15999, "Cosmetics Products"));
		al.add(new Flipkart(21999, "Electronics"));
		
		for(Flipkart f1:al)
		{
			System.out.println(f1.itemPrice+" "+f1.itemName);
		}
		
		System.out.println("__________________________________");
		Collections.sort(al,new ComFlipkartPrice());
		for(Flipkart f1:al)
		{
			System.out.println(f1.itemPrice+"-"+f1.itemName);
		}
		
	}

}
