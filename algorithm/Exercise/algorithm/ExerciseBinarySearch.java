package algorithm;

public class ExerciseBinarySearch {
	public static void main(String[] args) {
		int [] li = {1,3, 5, 8, 15, 23, 32, 47};
		for(int e: li)
			System.out.print(e + " ");
		System.out.println();
		System.out.println(exerciseBinarySearch(li,0));
	}
	public static int exerciseBinarySearch(int[] list,int key){
		int low = 0;
		int high = list.length - 1;
		while(low <= high){
			int middle = (low + high) / 2;
			if(key < list[middle])
				high = middle - 1;
			if(key == list[middle])
				return middle;
			if(key > list[middle])
				low = middle + 1;
		}
		return -low - 1;//返回该插入的位置加一取负值
	}
}
