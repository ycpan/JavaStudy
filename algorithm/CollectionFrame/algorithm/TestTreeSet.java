package algorithm;
import java.util.*;

public class TestTreeSet {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>();
		set.add("BeiJing");
		set.add("ShangHai");
		set.add("TianJin");
		set.add("BeiJing");
		set.add("ZhengZhou");
		set.add("WuHan");
		TreeSet<String> treeSet = new TreeSet<String>(set);//���ֱȵ�������
		//TreeSet����Ч�ʸ��ߣ���Ϊ����ֻ����һ����
		System.out.println(treeSet);
		System.out.println("first()��" + treeSet.first());
		System.out.println("last()��" + treeSet.last());
		System.out.println("headSet()��" + treeSet.headSet("TianJin"));
		System.out.println("tailSet()��" + treeSet.tailSet("TianJin"));
		
		System.out.println("lower(\"T\")��" + treeSet.lower("T"));
		System.out.println("floor(\"T\")��" + treeSet.floor("T"));
		System.out.println("ceiling(\"T\")��" + treeSet.ceiling("T"));
		System.out.println("higher(\"T\")��" + treeSet.higher("T"));
		System.out.println("pollFirst()��" + treeSet.pollFirst());
		System.out.println("pollLast()��" + treeSet.pollLast());
		System.out.println("New treeSet��" + treeSet);
		
		
		
		
	}
}
