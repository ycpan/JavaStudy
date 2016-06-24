package algorithm;

public class BubbleSort {
	public static void main(String[] args){
		int [] li = {3, 5, 1, 8, 5, 3, -2};
		bubbleSort(li);
		System.out.println();
		for(int i = 0; i < li.length; i++){
			System.out.print(li[i] + " ");
		}
	}
	public static void bubbleSort(int [] list){
		for(int j = list.length - 1; j > 0 ; j--){
			for(int i = 0; i < j; i++){
					if(list[j] < list[i]){
					int tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
	}
}
