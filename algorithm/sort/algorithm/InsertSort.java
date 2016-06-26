package algorithm;

public class InsertSort {
	public static void insertSort(int[] list){
		for(int i = 1; i < list.length; i++){
			if(list[i] < list[i - 1]){
				int j, t = list[i];
				for(j = i - 1;j >= 0 && list[j] > t; j--){
					list[j + 1] = list[j];
				}
				list[j + 1] = t;
			}
		}
	} 
	
	

}
