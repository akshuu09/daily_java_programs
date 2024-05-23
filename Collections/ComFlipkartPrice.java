package collectionsProgram;

import java.util.Comparator;

public class ComFlipkartPrice implements Comparator {

	@Override
	public int compare(Object o1, Object o2)
	{
		Flipkart f1=(Flipkart)o1;
		Flipkart f2=(Flipkart)o2;
		int status=0;
		if(f1.itemPrice == f2.itemPrice)
		{
			status=0;
		}
		else if(f1.itemPrice > f2.itemPrice)
		{
			status=1;
		}
		else if(f1.itemPrice < f2.itemPrice)
		{
			status=-1;
		}
		return status;
				
	}

}
