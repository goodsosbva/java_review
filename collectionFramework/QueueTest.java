package collectionFramework;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if (len == 0) {
			System.out.println("큐가 비어 있음");
			return null;
		}
		
		return arrayQueue.remove(0);
	}
	public String peek() {
		int len = arrayQueue.size();
		
		if (len == 0) {
			System.out.println("큐가 비어 있음");
			return null;
		}
		
		return arrayQueue.get(0);
	}
}

public class QueueTest {

	public static void main(String[] args) {
MyQueue queue = new MyQueue();
		
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		
		
		System.out.println(queue.peek());	    //a
		System.out.println(queue.peek());		//a
		System.out.println(queue.peek());		//a
		System.out.println(queue.deQueue());	//a
		System.out.println(queue.deQueue());	//b
		System.out.println(queue.deQueue());	//c
		System.out.println(queue.deQueue());	//큐가 비어 있음

	}

}
