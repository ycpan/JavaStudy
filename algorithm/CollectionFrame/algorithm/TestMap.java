package algorithm;
import java.util.*;

public class TestMap {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("LiuYiFei", 28);
		hashMap.put("LinZhiLing", 25);
		hashMap.put("ZhangJie", 29);
		hashMap.put("WuYanZu", 30);
		System.out.println(hashMap);//�����������е�
		
		Map<String, Integer> treeMap = new TreeMap<String,Integer>(hashMap); 
		System.out.print(treeMap.get("LinZhiLing").hashCode());
		System.out.println();
		System.out.println(treeMap);//����ǰ���ֵ�������е�
		
		Map<String,Integer> linkedHashMap =
			new LinkedHashMap<String,Integer>(16,0.75f,true);
		linkedHashMap.put("LiuYiFei", 28);
		linkedHashMap.put("LinZhiLing", 25);
		linkedHashMap.put("ZhangJie", 32);
		linkedHashMap.put("WuYanZu", 30);
		System.out.println();
		System.out.println("The age for LiuYiFei is " + 
				linkedHashMap.get("LiuYiFei").intValue());
		System.out.println(linkedHashMap);//����ǰ�����˳�����е�
	}
}
