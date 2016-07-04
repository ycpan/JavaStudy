package algorithm;

public class ExerciseQuickSort {
	public static void exerciseQuickSort(int[] list) {
		exerciseQuickSort(list,0,list.length - 1);
	}
	public static void exerciseQuickSort(int[] list, int low, int high) {
		if(low < high){
			int pivotIndex = part(list,low,high);
			exerciseQuickSort(list,low,pivotIndex - 1);
			exerciseQuickSort(list,pivotIndex + 1, high);
		}
	}
	public static int part(int[] list, int low, int high){
		int pivot = list[low];
		while(low < high ){
			while(low < high && list[high] >= pivot) 
				high--;
			list[low] = list[high];
			while(low < high && list[low] <= pivot)
				low++;
			list[high] = list[low];
		}
		list[low] = pivot;
		return low;//low = high
		
	} 
}
