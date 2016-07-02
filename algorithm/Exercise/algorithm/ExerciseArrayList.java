package algorithm;
import java.util.*;

public class ExerciseArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("BeiJing");
		list.add("TianJin");
		list.add("ShangHai");
		list.add("ChangSha");
		list.add(0,"WuHuan");
		list.add(3,"NanJing");
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next() + " ");
		while(iterator.hasPrevious())
			System.out.println(iterator.previous().toUpperCase() + " ");
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add(0,"BeiJing");
		linkedList.add("TianJin");
		System.out.println(linkedList);
		linkedList.removeLast();
		linkedList.addFirst("ShenZhen");
		System.out.println(linkedList);
		
		
	}
}
