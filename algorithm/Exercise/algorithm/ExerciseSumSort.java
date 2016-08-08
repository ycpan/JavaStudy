package algorithm;

public class ExerciseSumSort {
	public static void main(String[] args) {
		int[] list = {8, -2, 3, -9, 0, 3, 1, 10};
//		quickSort(list);
//		inserttionSort(list);
		shellSort(list);
		for(int e: list)
			System.out.print(e + " ");
//		System.out.println();
//		System.out.println("The 1 pos is:" + binarySearch(list,2));
	}
	public static int binarySearch(int[] list,int key) {
		int low = 0;
		int high = list.length - 1;
		while(low <= high){
			int mid = (low + high) / 2;
			if(key < list[mid] )
				high = mid - 1;
			if(key == list[mid])
				return mid;
			if(key > list[mid])
				low = mid + 1;
		}
		return -low -1;
	}
	public static void quickSort(int[] list){
		quickSort(list, 0, list.length - 1);
	}
	public static void quickSort(int[] list, int first, int last){
		if(first < last){
			int pivotIndex = part(list,first,last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	public static int part(int[] list, int first, int last){
		int pivot = list[first];
		while(first < last) {
			while(first < last && list[last] >= pivot  )
				last--;
			list[first] = list[last];
			while(first < last && list[first] <= pivot)
				first++;
			list[last] = list[first];
			
		}
		
		list[first] = pivot;
		return first;
		
	}
	
	public static void mergeSort(int[] list) {
		if(list.length > 1){
			int[] first = new int[list.length / 2];
			System.arraycopy(list, 0, first, 0, list.length / 2);
			mergeSort(first);
			int secondLength = list.length - list.length / 2;
			int[] second = new int[secondLength]; 
			System.arraycopy(list, list.length / 2, second, 0, secondLength);
			mergeSort(second);
			int[] temp = merge(first, second);
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
	public static int[] merge(int[] first, int[] second ){
		int firstIndex = 0;
		int secondIndex = 0;
		int[] temp = new int[first.length + second.length];
		int tempIndex = 0;
		while(firstIndex < first.length && secondIndex < second.length) {
			if(first[firstIndex] <= second[secondIndex])
				temp[tempIndex++] = first[firstIndex++];
			else
				temp[tempIndex++] = second[secondIndex++];
		}
		while(firstIndex < first.length)
			temp[tempIndex++] = first[firstIndex++];
		while(secondIndex < second.length)
			temp[tempIndex++] = second[secondIndex++];
		return temp;
	}
	public static void inserttionSort(int[] list) {
		for(int i = 1; i < list.length; i++) {
			if(list[i] < list[i - 1]){
				int j, t = list[i];
				for(j = i - 1; j >= 0 && list[j] > t; j-- )
					list[j + 1] = list[j];
				list[j + 1] = t;
			}
		}
	}
	public static void shellSort(int[] list) {
		for(int gap = list.length / 2; gap > 0; gap = gap / 2){
			for(int k = 0; k < gap; k++){
				for(int i = k + gap; i < list.length; i = i + gap ) {
					if(list[i] < list[i - gap]){
						int j, t = list[i];
						for(j = i - gap; j >= 0 && list[j] >t; j = j - gap )
							list[j + gap] = list[j];
						list[j + gap] = t;
					}
				}
			}
		}
			
	}
	
}
