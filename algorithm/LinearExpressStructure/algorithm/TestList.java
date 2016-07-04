package algorithm;

public class TestList {
	public static void main(String[] srgs) {
		MyList<String> list = new MyArrayList<String>();
		list.add("America");
		System.out.println("(1) " + list) ;
		list.add(0,"China");
		System.out.println("(2) " + list) ;
		list.add("Russia");
		System.out.println("(3) " + list) ;
		list.add("France");
		System.out.println("(4) " + list) ;
		list.add("America");
		System.out.println("(5) " + list) ;
		list.remove("America");
		System.out.println("(6) " + list) ;
		list.remove(2);
		System.out.println("(7) " + list) ;
		list.remove(list.size() - 1);
		System.out.println("(8) " + list) ;
	}
}
