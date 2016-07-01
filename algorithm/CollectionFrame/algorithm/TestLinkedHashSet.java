package algorithm;
import java.util.*;
public class TestLinkedHashSet {
	public static void main(String[] args){
		Set<String> set = new LinkedHashSet<String>();
		set.add("BeiJing");
		set.add("ShangHai");
		set.add("TianJin");
		set.add("BeiJing");
		set.add("ZhengZhou");
		set.add("WuHan");
		System.out.println(set);
		for(Object element: set){
			System.out.print(element.toString().toUpperCase() + " ");
		}
		
	}
}
