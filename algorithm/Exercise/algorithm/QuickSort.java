package algorithm;

public class QuickSort {
	public static void quickSort(int[] list){
		quickSort(list,0,list.length - 1);
	}
	private static void quickSort(int[] list,int low,int high){
		if(low < high){
			int pivotIndex = part(list,low,high);
			quickSort(list,low,pivotIndex - 1);
			quickSort(list,pivotIndex + 1,high);
		}
	}
	private static int part(int[] list,int low,int high){
		int pivot = list[low];
		while(low < high){
			while(low < high && list[high] >= pivot)
				high--;
			list[low] = list[high];
			while(low < high && list[low] <= pivot)
				low++;
			list[high] = list[low];
		}
		list[low] = pivot;
		return low;
	}

}
