package algorithm;

public class ShellSort {
	public static void shellSort(int[] list){
		for(int gap = list.length / 2; gap > 0; gap = gap / 2){ 
			for(int i = 0; i < gap; i ++){
				for(int j = i + gap; j < list.length ; j = j + gap){
					if(list[j] < list[j - gap]){
						int k,temp = list[j];
						for(k = j - gap; k >= 0 && list[k] > temp; k = k - gap){
							list[k + gap] = list[k];
						}
						list[k + gap] = temp;
					}
				}
				
			}
		}
	}
}
