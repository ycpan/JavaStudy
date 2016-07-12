package algorithm;

public class ExerciseTestPriorityQueuePeek {
	public static void main(String[] args) {
		java.util.PriorityQueue<Integer> priorityQueue = 
			new java.util.PriorityQueue<Integer>();
		priorityQueue.add(8);
		priorityQueue.add(3);
		priorityQueue.add(7);
		priorityQueue.add(1);
		priorityQueue.add(9);
		for(Integer e: priorityQueue)
			System.out.print(e + " ");
		System.out.println();
//		for(int i = 0; i < priorityQueue.size(); i++){
		while(!priorityQueue.isEmpty()) {
			System.out.print(priorityQueue.remove() + " ");
			//priorityQueue.remove();
		}
		
	}
}
