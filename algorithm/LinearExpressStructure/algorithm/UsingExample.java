package algorithm;

public class UsingExample {
	public static void main(String[] args){
		GenericStack<String> list = new GenericStack<String>();
		list.push("BeiJing");
		list.push("ShangHai");
		System.out.println(list.peek());
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.isEmpty());
	}

} 
