package algorithm;

public class BubbleSort2 {
	public static void bubbleSort(int[] list){
		for(int i = 1; i < list.length; i++){
			for(int j = 0; j < list.length - i; j++){
				if(list[j] > list[j+1]){
					int tmp = list[j];
					list[j] = list[j+1];
					list[j+1] = tmp;
				}
			}
		}
	}

}
