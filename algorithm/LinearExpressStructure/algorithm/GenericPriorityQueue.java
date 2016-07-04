package algorithm;

public class GenericPriorityQueue<E extends Comparable<E>> {
	private Heap<E> heap =  new Heap<E>();
	public void enqueue(E o) {
		heap.add(o);
	}
	public E dequeue() {
		return heap.remove();
	}
	public int getSize() {
		return heap.getSize();
	}
	public String toString() {
		return "PriorityQueue:" + heap.toString();
	}
}
