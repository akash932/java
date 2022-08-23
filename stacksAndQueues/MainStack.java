package lectures.stacksAndQueues;

public class MainStack {
	public static void main(String[] args) throws StackException {
		StackCustom stack = new StackCustom();
		
		stack.push(34);
		stack.push(45);
		stack.push(2);
		stack.push(9);
		stack.push(18);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
