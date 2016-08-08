package algorithm;
import java.util.*;

public class ExerciseSumCollections {
	public static void main(String[] args) {
		//exerciseSet();
		//System.out.println("\n\n\n");
		//exerciseList();
//		exerciseQueue();
		exerciseMap();
	}
	public static void exerciseSet() {
		Set<String> set = new HashSet<String>();
		set.add("BeiJing");
		set.add("ShangHai");
		set.add("ShenZhen");
		System.out.println("The set is:\n" + set);
		System.out.println("The set contains ShenZhen:" + 
				set.contains("ShenZhen"));
		set.remove("ShenZhen");
		System.out.println("The set is:\n" + set);
		System.out.println("The set contains ShenZhen:" + 
				set.contains("ShenZhen"));
		Set<String> set1 = new LinkedHashSet<String>();
		set1.addAll(set);
		System.out.println("the LinkedHashSet is:\n" + set1);
		set1.add("NanJing");
		set1.add("BeiJing");
		System.out.print("The set1 is:");
		for(String e:set1)
			System.out.print( e + " ");
		System.out.println();
		
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		set2.add(4);
		set2.add(-5);
		Iterator<Integer> iterator = set2.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
	}
	public static void exerciseList(){
		List<String> list = new ArrayList<String>();
		list.add("BeiJing");
		list.add("ShangHai");
		list.add("NanJing");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		list.add(0, "ChangSha");
		System.out.println("\n" + list);
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.addAll(list);
		Iterator<String> iterator1 = list1.iterator();
		while(iterator1.hasNext())
			System.out.print(iterator1.next().toUpperCase() + " ");
		
		List<String> asList = Arrays.asList("BeiJing", "ShangHai", "TianJin");
		System.out.println("\n" + asList);
		
		String[] array = new String[2];
		array[0] = "BeiJing";
		array[1] = "TianJin";
		List<String> list2 = new LinkedList<String>(Arrays.asList(array));
		System.out.println(list2);
		System.out.println("The BeiJing index:" + 
				Collections.binarySearch(list2,"BeiJing"));
		System.out.println("The max is:" + Collections.max(list2));
	}
	public static void exerciseQueue() {
//		Queue<String> queue = new LinkedList<String>();
//		queue.add("BeiJing");
//		queue.add("ShangHai");
//		queue.add("NanJing");
//		queue.add("ShangHai");
//		System.out.println(queue);
//		System.out.println();
//		while(queue.size() != 0)
//			System.out.print(queue.remove() + " ");
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.add("BeiJing");
		queue1.add("ShangHai");
		queue1.add("NanJing");
		queue1.add("ShangHai");
		queue1.add("WuHan");
		queue1.add("ChangSha");
		Iterator<String> iterator = queue1.iterator();
		System.out.println("****");
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		while(queue1.size() > 0)
			System.out.print(queue1.remove() + " ");
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		queue2.offer("BeiJing");
		queue2.offer("ShangHai");
		queue2.offer("NanJing");
		queue2.offer("ShangHai");
		queue2.offer("WuHan");
		queue2.offer("ChangSha");
		Iterator<String> iterator1 = queue2.iterator();
		System.out.println("****");
		while(iterator1.hasNext())
			System.out.print(iterator1.next() + " ");
		System.out.println();
		while(queue2.size() != 0)
			System.out.print(queue2.remove() + " ");
	}
	public static void exerciseMap(){
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(0, "BeiJing");
		hashMap.put(3, "NanJing");
		hashMap.put(2, "WuHan");
		hashMap.put(1, "LaSha");
		System.out.println(hashMap);
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
		for(Map.Entry<Integer, String> e:entrySet )
			System.out.print(" key:" + e.getKey() + 
					" value:" + e.getValue());
		System.out.println();
		Map<Integer,String> treeMap = new TreeMap<Integer, String>();
		treeMap.putAll(hashMap);
		System.out.println(treeMap);
		Map<Integer, String> linkedHashMap = 
				new LinkedHashMap<Integer, String>();
		linkedHashMap.putAll(hashMap);
		System.out.println(linkedHashMap);
		
		Map<String, Integer> hashMap1 = new HashMap<String, Integer>();
		hashMap1.put("ZhangBoZhi", 28);
		hashMap1.put("ZhangJie", 20);
		hashMap1.put("LiuJiaLing", 25);
		hashMap1.put("LiMingHao", 32);
		System.out.println(hashMap1);
		Map<String, Integer> treeMap1 = new TreeMap<String, Integer>();
		treeMap1.putAll(hashMap1);
		System.out.println(treeMap1);
		Map<String, Integer> linkedHashMap1 = 
				new LinkedHashMap<String, Integer>();
		linkedHashMap1.putAll(hashMap1);
		System.out.println(linkedHashMap1);
		System.out.println("The LiuJiaLing age is" + 
		hashMap1.get("LiuJiaLing").intValue());
		
		Map<String,Integer> linkedHashMap2 = 
				new LinkedHashMap<String,Integer>(16, 0.75f, true);//按最后一次
		//访问顺序排序
			linkedHashMap2.put("ZhangLiangYing", 34);
			linkedHashMap2.put("DengChao", 44);
			linkedHashMap2.put("HeJie", 24);
			System.out.println("The age for DengChao:" + 
					linkedHashMap2.get("DengChao").intValue() );
			System.out.println(linkedHashMap2);
		
				
	}
	
	
	
	
	
}
