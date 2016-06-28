package algorithm;

public class ExerciseAlgorithm {
	public static void mergeSort(int[] list){
		if(list.length > 1){
			int[] firstHalf = new int[list.length / 2];
			int secondLength = list.length - list.length / 2;
			int[] secondHalf = new int[secondLength];
			System.arraycopy(list,0,firstHalf,0,list.length / 2);
			mergeSort(firstHalf);
			System.arraycopy(list,list.length / 2,secondHalf,0,secondLength);
			mergeSort(secondHalf);
			int[] temp = merge(firstHalf,secondHalf);
			System.arraycopy(temp,0,list,0,list.length);
		}
	}
	private static int[] merge(int[] firstHalf,int[] secondHalf){
		int firstHalfIndex = 0;
		int secondHalfIndex = 0;
		int tempIndex = 0;
		int[] temp = new int[firstHalf.length + secondHalf.length]; 
		while(firstHalfIndex < firstHalf.length && secondHalfIndex < secondHalf.length){
			if(firstHalf[firstHalfIndex] <= secondHalf[secondHalfIndex])
				temp[tempIndex++] = firstHalf[firstHalfIndex++];
			temp[tempIndex++] = secondHalf[secondHalfIndex++];
		}
		while(firstHalfIndex < firstHalf.length)
			temp[tempIndex++] = firstHalf[firstHalfIndex++];
		while(secondHalfIndex < secondHalf.length)
			temp[tempIndex++] = secondHalf[secondHalfIndex++];
		return temp;
		
	}
}
