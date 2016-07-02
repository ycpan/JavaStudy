package algorithm;
import java.util.*;

public class TestQueue1 {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>();
		set.add("Beijing");
		set.add("ShangHai");
		set.add("TianJin");
		set.add("ZhengZhou");
		set.add("Beijing");
		System.out.println(set);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().toUpperCase() + " ");
		}
	}
}
