package collectionsProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example22 {

	public static void main(String[] args) {
		
		//1 approach-->list
		String[] a= {"Cyber","Success","Traning"};
		List<String>l=Arrays.asList(a);
		System.out.println(l);
		
		//2 approach-->ArrayList
		String[] skills= {"Java","Testing","Python"};
		ArrayList<String>al=new ArrayList<String>(Arrays.asList(skills));
		System.out.println(al.size());
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
