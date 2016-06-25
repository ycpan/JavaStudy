package algorithm;

public class BinarySearch {
	
	public static void main(String[] args){
		int[] list = { 1, 3, 5, 8, 10, 20};
		System.out.println(binarySearch(list,2));
	} 
	
	public static int binarySearch(int list[],int key){
		int low = 0;
		int high = list.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(key < list[mid])
				high = mid -1;
				
			if(list[mid] == key)
				return mid;
			if(key > list[mid])
				
				low = mid + 1;
			
		}
		return (high );
		
	}
	

}