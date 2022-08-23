package lectures.linkedList;



public class DoublyLinkedList {
	
	Node head;
	
	public Node find(int value) {
		Node temp = head;
		while(temp != null) {
			if(temp.value == value)
				return temp;
			temp = temp.next;
		}
		return null;
	}
	
	public void insert(int after, int value) {
		Node previous = find(after);
		
		if(previous == null) {
			System.out.println("Does not exist");
			return;
		}
		
		Node node = new Node(value);
		node.next = previous.next;
		previous.next = node;
		node.previous = previous;
		if(node.next != null) {
			node.next.previous = node;// it may give null pointer exception as node.next may be null
		}
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		node.previous = null;
		if(head != null) {
			head.previous = node;
		}
		head = node;
	}
	
	public void insertLast(int value) {
		Node node = new Node(value, null, null);
		
		if(head == null) {
			node.previous = null;
			head = node;
			return;
		}
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = node;
		node.previous = last;
	}
	
	public void display() {
		Node temp = head;
		Node last = null;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			last = temp;
			temp = temp.next;
		}
		System.out.println("End");
		
		System.out.println("Printing in reverse");
		while(last != null) {
			System.out.print(last.value + " -> ");
			last = last.previous;
		}
		System.out.println("Start");
		
	}
	
	private class Node{
		private int value;
		private Node next;
		private Node previous;
		
		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next, Node previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
			
		
		
		
	}



	

}
