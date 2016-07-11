package algorithm;

public class ExerciseHeapSort {
	public static void main(String[] args) {
		Integer[] list = {-3, 4, 5, 8, 1, 7, 2, 7};
		heapSort(list);
		for(Integer e: list)
			System.out.print(e + " ");
			
	}
	public static <E extends Comparable<E>> void 
		heapSort(E[] list) {
		ExerciseHeap<E> heap = new ExerciseHeap<E>();
		for(int i = 0; i < list.length; i++)
			heap.add(list[i]);
		for(int i = heap.getSize() - 1; i >= 0; i--)
			list[i] = heap.remove();
	}
	
		
}
