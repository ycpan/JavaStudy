package algorithm;
import java.util.*;
public class ListStaticMethod {
	public static void main(String[] args){
		List<Integer> list1 = Arrays.asList(1,3,5,8,10);
		System.out.println(list1);
		System.out.println("(1)Index:" + Collections.binarySearch(list1, 4));
		System.out.println("(2)Index:" + Collections.binarySearch(list1, 3));
		List<String> list2 = Arrays.asList("black","blue","green","red","white");
		System.out.println(list2);
		System.out.println("(3)Index:" + Collections.binarySearch(list2,"red"));
		System.out.println("(4)Index:" + Collections.binarySearch(list2,"puple"));
		List<String> list3 = Arrays.asList("black","blue","green","red","white");
		List<String> list4 = Arrays.asList("black","blue","green","red","white");
		Collections.shuffle(list3,new Random(20));
		Collections.shuffle(list4,new Random(20));
		System.out.println(list3);
		System.out.println(list4);
	}

}
