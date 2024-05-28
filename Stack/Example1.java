package stack;

import java.util.Stack;

public class Example1 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Stack Data");
		s.push('A');
		s.push(100);
		s.push(10.5f);
		System.out.println(s);
	}

}