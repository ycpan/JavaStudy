package algorithm;

public class GenericQueue<E> {
	private java.util.LinkedList<E> list =
			new java.util.LinkedList<E>();
	public void enqueue(E e) {
		list.addLast(e);
	}
	public E dequeue(){
		return list.removeLast();
	}
	public int getSize(){
		return list.size();
	}
	public String toString() {
		return "Queue:" + list.toString();
	}
}
