package lectures.linkedList;

public class LList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public LList() {
		this.size = 0;
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public Node get(int index) {
		Node node = head;
		int i = 0;
		while(i ++ < index)
			node = node.next;
		return node;
	}
	
	public Node find(int value) {
		Node temp = head;
		while(temp != null) {
			if(temp.value == value)
				return temp;
			temp = temp.next;
		}
		return null;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("Null");
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		
		size += 1;
	}
	
	public void insertLast(int value) {
		// using tail
//		Node node = new Node(value);
//		
//		tail.next = node;
//		tail = node;
//		size ++;
//		
//		if(tail == null) {
//			head = tail;
//		}
		
		//using head
		Node node = new Node(value);
	
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		tail = node;
		size ++;
		
	}
	
	public void insertAtIndex(int index, int value) {
		if(index == 0) {
			insertFirst(value);
			return;
		}			
		if(index == size) {
			insertLast(value);
			return;
		}
		Node temp = head;
		int j = 1;
		while(j ++ < index) {
			temp = temp.next;
		}
		Node node = new Node(value, temp.next);
		temp.next = node;
		size ++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if(head == null)
			tail = head;
		return val;
	}
	
	public int deleteLast() {
		if(size <= 1)
			return deleteFirst();
		Node secondLast = get(size - 2);
		int val = tail.value;
		tail = secondLast;
		tail.next = null;
		return val;
	}
	
	public int deleteIndex(int index) {
		if(index == 0)
			return deleteFirst();
		if(index == size - 1)
			return deleteLast();
		
		Node previous = get(index - 1);
//		Node node = previous.next;
		int val = previous.next.value;
		previous.next = previous.next.next;
//		node.next = null;// no need of this as there is no way to access this as the chaion is already broken
		return val;
	}

}
