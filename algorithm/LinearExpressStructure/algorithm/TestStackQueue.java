package algorithm;

public class TestStackQueue {
	public static void main(String[] String) {
		GenericStack<String> stack = new GenericStack<String>();
		stack.push("BeiJing");
		stack.push("ShangHai");
		stack.push("GuangZhou");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack + "\n" + stack.peek());
		
		GenericQueue<String> queue = new GenericQueue<String>();
		queue.enqueue("BeiJing");
		queue.enqueue("ShangHai");
		queue.enqueue("GuangZhou");
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue + "\n" + stack.getSize());
		
		
	}
}
