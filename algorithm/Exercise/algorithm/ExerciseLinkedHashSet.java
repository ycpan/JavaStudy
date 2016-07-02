package algorithm;
import java.util.*;

public class ExerciseLinkedHashSet {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(8);
		set.add(2);
		set.add(-9);
		set.add(0);
		set.add(3);
		set.add(8);
		set.add(2);
		System.out.println(set);
		System.out.println("the hashCode is :" + set.hashCode());
		
	}
}
