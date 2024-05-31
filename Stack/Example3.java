package stack;

import java.util.Stack;

public class Example3 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.push("Data");
		s1.push('A');
		s1.push(100);
		s1.push(10.5f);
		System.out.println(s1);
		System.out.println(s1.search("Data"));
		System.out.println(s1.search('A'));
		System.out.println(s1.search(100));
		System.out.println(s1.search(10.5f));
		
	}

}
