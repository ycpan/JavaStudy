package algorithm;
import java.util.*;
import java.io.*;

public class CollectionFrameAppExercise {
	public static void main(String[] args) {
//		appExercise1();
//		System.out.println("The args[0] is:" + args[0]);
		System.out.println("The args.length is:" + args.length);
		keyWordsCount(args);
		
	}
	public static void appExercise1() {
		Set<String> hashSet1 = new HashSet<String>();
		Set<String> hashSet2 = new HashSet<String>();
		hashSet1.add("George");
		hashSet1.add("Jim");
		hashSet1.add("John");
		hashSet1.add("Blake");
		hashSet1.add("Kevin");
		hashSet1.add("Mechael");
		hashSet2.add("George");
		hashSet2.add("Katie");
		hashSet2.add("Kevin");
		hashSet2.add("Michelle");
		hashSet2.add("Ryan");
		Set<String> merge = new HashSet<String>(hashSet1);
		merge.addAll(hashSet2);
		Set<String> diverse = new HashSet<String>(hashSet1);
		diverse.removeAll(hashSet2);
		Set<String> retain = new HashSet<String>(hashSet1);
		retain.retainAll(hashSet2);
		System.out.println(merge);
		System.out.println(diverse);
		System.out.println(retain);
	}
	public static void keyWordsCount(String[] args) {
		if(args.length != 1){
			System.out.println("usage: java "
					+ "CollectionFrameAppExercise file.java");
			System.exit(0);
		}
		String[] keyWords = {"abstract", "finally", "public",
		      "boolean", "float", "return", "break", "for", "short", "byte",
		      "goto", "static", "case", "if", "super", "catch", "implements",
		      "switch", "char", "import", "synchronized", "class",
		      "instanceof", "this", "const", "int", "throw", "continue",
		      "interface", "throws", "default", "long", "transient", "do",
		      "native", "try", "double", "new", "void", "else", "package",
		      "volatile", "extends", "private", "while", "final",
		      "protected", "true", "null"
		};
		Set<String> hashMap = new HashSet<String>(Arrays.asList(keyWords));
		int count = 0;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(args[0]));
			String s = null;
			while((s = in.readLine()) != null){
//				System.out.println(s);
				StringTokenizer st = new StringTokenizer(s);
				while(st.hasMoreTokens()) {
					if(hashMap.contains(st.nextToken()))
						count++;
				}
			}
			System.out.println("The number of key words is:" + count);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
}
