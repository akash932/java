package lectures.linkedList;

//import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
//		LList list = new LList();
//		list.insertFirst(3);
//		list.insertFirst(2);
//		list.insertFirst(8);
//		list.insertFirst(17);
//		list.insertLast(18);
//		list.insertAtIndex(3, 15);
//		list.display();
//		System.out.println(list.get(1));
//		System.out.println(list.find(8));// both will give the same result
//		System.out.println(list.deleteIndex(4));
//		list.display();
//		System.out.println(list.size);
//		System.out.println(list.head.value);
//		System.out.println(list.tail.value);
		
//		DoublyLinkedList list = new DoublyLinkedList();
//		
//		list.insertFirst(3);
//		list.insertFirst(2);
//		list.insertFirst(8);
//		list.insertFirst(17);
//		list.insertLast(19);
//		list.insert(17, 65);
//		
//		list.display();
		
//		LinkedList<Integer> list2 = new LinkedList<>(); 
		
		CircularLinkedList list = new CircularLinkedList();
		list.insert(23);
		list.insert(3);
		list.insert(19);
		list.insert(75);
		list.display();
		
		list.delete(75);
		
		list.display();
	}
}
