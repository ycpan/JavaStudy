package algorithm;
import java.util.*;

public class ExerciseQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("HaiNan");
		queue.offer("HeBei");
		queue.add("LanZhou");
		queue.add("SiChuan");
		while(queue.size() > 0)
			System.out.print(queue.remove() + " ");
 	}
}
