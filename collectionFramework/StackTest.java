package collectionFramework;

import java.util.ArrayList;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비어 있음");
			return null;
		}
		return arrayStack.remove(len - 1);
		
	}
}

public class StackTest {
		

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		}

	
}
