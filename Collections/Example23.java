package collectionsProgram;

import java.util.ArrayList;

public class Example23 {

	public static void main(String[] args) {
		ArrayList<String> subject=new ArrayList<String>();
		subject.add("Artificial Intelligence");
		subject.add("Machine learning");
		subject.add("Data structure");
		subject.add("Distributed system");
		String[] s=subject.toArray(new String[subject.size()]);
		for(String as:s)
		{
			System.out.println(as);
		}
	}

}
