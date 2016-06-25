package algorithm;

public class QuicSort {
	
	public static void quickSort(int [] list){
		quickSort(list,0,list.length - 1);
		
	}
	private static void quickSort(int[] list,int first,int last){
		if(last > first){
			int pivotIndex = partition(list,first,last);
			quickSort(list,first,pivotIndex - 1);
			quickSort(list,pivotIndex + 1,last);
		}
		
		
	}
	private static int partition(int[] list,int low,int high){
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
		return low;
	}
	
	public static void quickSort1(int [] list){
		quickSort1(list,0,list.length - 1);
		
	}
	private static void quickSort1(int[] list,int first,int last){
		if(last > first){
			int pivotIndex = part(list,first,last);
			quickSort1(list,first,pivotIndex - 1);
			quickSort1(list,pivotIndex + 1,last);
		}
		
		
	}
	private static int part(int[] list,int first,int last){
		int low = first + 1;
		int high = last;
		int pivot = list[first];
		while(low < high){
			while(low < high &&  list[low] <= pivot){
				low++;
			}
			while(low < high && list[high] > pivot){
				high--;
			}
			if(high > low){
				Swap.swap(list, low, high);
			}
			
		}
		while(high > first && list[high] >= pivot){
			high--;
		}
		
		if(list[high] < pivot){      
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else
			return first;
	}
	
	

}
