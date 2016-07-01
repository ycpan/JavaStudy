package algorithm;
import java.util.*;

public class TestArrayAndLinkedList {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(-5);
		list.add(8);
		list.add(100);
		list.add(100);
		list.add(20);
		list.add(0,10);
		list.add(3,30);
		System.out.println("A list of integers in the arrayList: ");
		System.out.println(list);
		
		LinkedList<Object> linkedList = new LinkedList<Object>(list);
		linkedList.add("red");
		linkedList.removeLast();
		linkedList.addFirst("green");
		System.out.println("Display the linkedList forward: ");
		ListIterator<Object> listIterator = linkedList.listIterator();
		while(listIterator.hasNext())
			System.out.print(listIterator.next() + " ");
		System.out.println();
		System.out.println("Display the linkedList backforward: ");
		//ListIterator<Object> listIterator = linkedList.listIterator();
		while(listIterator.hasPrevious())
			System.out.print(listIterator.previous() + " ");
		
	}
}
