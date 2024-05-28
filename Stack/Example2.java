package stack;

import java.util.Stack;

public class Example2 {

	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push("Stack Data");
		s.push('A');
		s.push(100);
		s.push(10.5f);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.empty());
		
		
	}

}
