package algorithm;

public class HeapSortExercise {
	public static <E extends Comparable<E>> void heapSortExercise(E[] list){
		HeapExercise<E> heap = new HeapExercise<E>(list);
		for(int i = list.length - 1; i >= 0; i--)
			list[i] = heap.remove();
	}
}
