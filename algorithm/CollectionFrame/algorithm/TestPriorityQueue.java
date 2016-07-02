package algorithm;
import java.util.*;

public class TestPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<String>();
		priorityQueue1.add("Beijng");
		priorityQueue1.add("ShangHai");
		priorityQueue1.add("NanJing");
		priorityQueue1.add("ShangHai");
		System.out.println(priorityQueue1);
		while(priorityQueue1.size() > 0)
		System.out.print(priorityQueue1.remove() + " ");
		System.out.println();
		PriorityQueue<String> priorityQueue2 = new PriorityQueue<String>(4,Collections.reverseOrder());
		priorityQueue2.add("Beijng");
		priorityQueue2.add("ShangHai");
		priorityQueue2.add("NanJing");
		priorityQueue2.add("ShangHai");
		while(priorityQueue2.size() > 0)
			System.out.print(priorityQueue2.remove() + " ");
		
	}

}
