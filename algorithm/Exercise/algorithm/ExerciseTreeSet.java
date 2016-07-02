package algorithm;
import java.util.*;

public class ExerciseTreeSet {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("ShangHai");
		set.add("NewYork");
		set.add("Tykyo");
		set.add("Chichgo");
		set.add("GuangZhou");
		for(String e: set)
			System.out.print(e.toUpperCase() + " ");
		System.out.println();
		set.remove("Chichgo");
		set.add("DuBai");
		System.out.println(set);
		System.out.println("first:" + set.first());
		System.out.println("last:" + set.last());
		System.out.println("headSet:" + set.headSet("GuangZhou"));
		System.out.println("tailSet:" + set.tailSet("NewYork"));

		System.out.println("lower:" + set.lower("NewYork"));
		System.out.println("lower:" + set.lower("N"));
		System.out.println("floor:" + set.floor("N"));
		System.out.println("ceiling:" + set.ceiling("N"));
		System.out.println("higher:" + set.higher("N"));
		System.out.println("pollFirst:" + set.pollFirst());
		System.out.println("pollLast:" + set.pollLast());
		System.out.println("new tree set: \n" + set);
		
		
	}
}
