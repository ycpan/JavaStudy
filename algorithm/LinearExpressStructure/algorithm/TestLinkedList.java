package algorithm;

public class TestLinkedList {
	public static void main(String[] args){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.addFirst("America");
		System.out.println("1" + list);
		list.add(0,"China");
		System.out.println("2" + list);
		list.add("Russia");
		System.out.println("3" + list);
		list.add(2,"Germany");
		System.out.println("4" + list);
		list.add(3,"Poland");
		System.out.println("5" + list);
		list.remove(0);
		System.out.println("6" + list);
		list.remove(list.size - 1);
		System.out.println("7" + list);
		
	}
}
