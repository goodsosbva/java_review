package collectionFramework;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("a");
		myList.add("a");
		myList.add("a");
		
		System.out.println(myList);
		
		myList.add("yas");
		System.out.println(myList);
		
		myList.addFirst("O");
		System.out.println(myList);
		
		System.out.println(myList.removeLast());
		System.out.println(myList);
		

	}

}
