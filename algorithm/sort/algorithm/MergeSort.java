package algorithm;

public class MergeSort {
	public static void mergeSort(int [] list){
		
		if(list.length > 1){
			int[] firstHalf = new int[list.length / 2];
			int[] secondHalf = new int[list.length - list.length / 2];
			System.arraycopy(list,0, firstHalf,0,list.length / 2);
			mergeSort(firstHalf);
		
			System.arraycopy(list,list.length / 2,secondHalf,0,list.length - list.length / 2);
			mergeSort(secondHalf);
		
			int[] temp = merge(firstHalf,secondHalf);
			System.arraycopy(temp,0,list,0,temp.length);
		}
	}
	private static int[] merge(int[] firstHalf,int[] secondHalf){
		int[] tmp = new int[firstHalf.length + secondHalf.length];
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		while(count1 < firstHalf.length  && count2 < firstHalf.length){
			
			if(firstHalf[count1] <= secondHalf[count2]){
				tmp[count++] = firstHalf[count1++];
			}
			else
				tmp[count++] = secondHalf[count2++];
		}
		while(count1 < firstHalf.length){
			tmp[count++] = firstHalf[count1++];
		}
		while(count2 < secondHalf.length){
			tmp[count++] = secondHalf[count2++];
		}
		return tmp;
		
	}

}
