package algorithm;

public class TestGenericPriorityQueue {
	public static void main(String[] args) {
		GenericPriorityQueue<String>  queue = 
			new GenericPriorityQueue<String>();
		queue.dequeue();
		queue.enqueue("BeiJing");
		queue.enqueue("ShangHai");
		queue.enqueue("FuZhou");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue);
		
	}
}
