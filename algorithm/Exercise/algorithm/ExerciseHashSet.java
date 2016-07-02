package algorithm;
import java.util.*;

public class ExerciseHashSet {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>();
		set.add("BeiJing");
		set.add("TianJin");
		set.add("ShangHai");
		set.add("BeiJing");
		set.add("LanZhou");
		System.out.println(set);
		set.remove("BeiJing");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		System.out.println("the set size is:" + set.size());
		System.out.println("LanZhou is in set:" + set.contains("LanZhou"));
		
	}
}
