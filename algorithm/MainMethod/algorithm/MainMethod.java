package algorithm;

public class MainMethod {
	public static void main(String[] args){
		int [] li = {3, 5, 1, 8, 5, 3, -2, 7};
		BubbleSort.bubbleSort2(li);
		System.out.println();
		for(int i = 0; i < li.length; i++){
			System.out.print(li[i] + " ");
		}
	}

}
