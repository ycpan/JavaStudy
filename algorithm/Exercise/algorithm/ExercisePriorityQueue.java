package algorithm;
import java.util.*;

public class ExercisePriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<String> priorityQueue1 = new PriorityQueue<String>();
		priorityQueue1.offer("TianJin");
		priorityQueue1.offer("ShangHai");
		priorityQueue1.offer("TianJin");
		priorityQueue1.offer("BeiJing");
		while(priorityQueue1.size() > 0)
			System.out.print(priorityQueue1.remove() + " ");
		PriorityQueue<String> priorityQueue2 =
			new PriorityQueue<String>(4,Collections.reverseOrder());
		priorityQueue2.offer("TianJin");
		priorityQueue2.offer("ShangHai");
		priorityQueue2.offer("TianJin");
		priorityQueue2.offer("BeiJing");
		System.out.println();
		while(priorityQueue2.size() > 0)
			System.out.print(priorityQueue2.remove() + " ");
	}
}
