package algorithm;

public class MainMethod {
	public static void main(String[] args){
		int [] li = {3, 5, 1, 8, 5, 3, -2, 7};
		//ExerciseQuickSort.exerciseQuickSort(li);
		int pivotIndex = ExerciseQuickSort.part(li,0,li.length - 1);
		//MergeSort.mergeSort(li);
		//QuickSort.quickSort(li);
		//ShellSort.shellSort(li);
//		SlectionSort.slectionSort(li);
//		InsertSort.insertSort(li);
//		Integer [] li = {3, 5, 1, 8, 5, 3, -2, 7};
		//HeapSort.heapSort(li);
//		HeapSortExercise.heapSortExercise(li);
		//System.out.println(pivot);
		System.out.println(pivotIndex);
		for(int i = 0; i < li.length; i++){
			System.out.print(li[i] + " ");
		}
		
	}

}
