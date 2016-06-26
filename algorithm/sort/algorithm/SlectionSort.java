package algorithm;
//BubbleSsort swap the array's position,but SlectionSort does not;
public class SlectionSort {
	public static void slectionSortIncorrectedMethod(int[] list){
		for(int i = 0; i < list.length - 1; i++){
			for(int j = i + 1; j < list.length; j++){
				if(list[i] > list[j]) Swap.swap(list, i, j);
				
			}
		}
	}
	public static void slectionSort(int[] list){
		for(int i = 0; i < list.length - 1; i++){
			int currentMin = list[i];
			int currentMinIndex = i;
			for(int j = i + 1; j < list.length; j++){
				if(currentMin > list[j]){
					currentMin = list[j];
					currentMinIndex = j;
				}
				
			}
			if(currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
			
		}
	}
	
	

}
