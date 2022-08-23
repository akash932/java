package lectures.stacksAndQueues;

public class StackCustom {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	
	private int ptr = -1;
	
	public StackCustom() {
		this(DEFAULT_SIZE);
	}
	
	public StackCustom(int size) {
		this.data = new int[size];
	}
	
	public boolean push(int item) {
		if(isFull()) {
			System.out.println("Stack is full! ");
			return false;
		}	
		ptr ++;
		data[ptr] = item;
		return true;
	}
	
	public int pop() throws StackException {
		if(isEmpty()) {
			throw new StackException("Cannot pop from an empty stack!!");
		}
		return data[ptr--];
	}
	
	public int peek() throws StackException {
		if(isEmpty()) {
			throw new StackException("Cannot peek from an empty stack!!");
		}
		return data[ptr];
	}
	
	protected boolean isFull() {
		return ptr == data.length - 1; // ptr is at last index. and if we do ptr++, it will go out of bounds
	}
	
	private boolean isEmpty() {
		return ptr == -1;
	}
}
