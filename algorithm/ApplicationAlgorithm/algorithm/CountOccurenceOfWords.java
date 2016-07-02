package algorithm;
import java.util.*;

public class CountOccurenceOfWords {
	public static void main(String[] args) {
		String text = "Good morrning. Have a good class." +
			"Have a good vist.Have fun!";
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		String[] words  = text.split("[ \n\t\r.,;!]");
		for(int i = 0; i < words.length; i++){
			String key = words[i].toLowerCase();
			if(key.length() > 0){
				if(treeMap.get(key) == null)
					treeMap.put(key,1);
				else {
					int value = treeMap.get(key).intValue();
					value++;
					treeMap.put(key,value);
				}
			}
			
		}
		Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
		for(Map.Entry<String,Integer> e:entrySet)
			System.out.print(e.getValue() + "\t" + e.getKey() + "\n");
		
	}
}
