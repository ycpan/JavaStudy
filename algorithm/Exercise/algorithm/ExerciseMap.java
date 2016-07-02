package algorithm;
import java.util.*;

public class ExerciseMap {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>(); 
		hashMap.put("ZhangLiangYing", 34);
		hashMap.put("DengChao", 44);
		hashMap.put("HeJie", 24);
		System.out.println(hashMap + "\n");
		Map<String,Integer> treeMap = new TreeMap<String, Integer>(hashMap);
		treeMap.put("LiuJiaLing", 26);
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Map.Entry<String,Integer> e: entrySet)
			System.out.println("key:" + e.getKey() +
					" value:" + e.getValue());
		Map<String,Integer> linkedHashMap = 
			new LinkedHashMap<String,Integer>(16, 0.75f, true);
		linkedHashMap.put("ZhangLiangYing", 34);
		linkedHashMap.put("DengChao", 44);
		linkedHashMap.put("HeJie", 24);
		System.out.println("The age for DengChao:" + 
				linkedHashMap.get("DengChao").intValue() );
		System.out.println(linkedHashMap);
		
	}
}
