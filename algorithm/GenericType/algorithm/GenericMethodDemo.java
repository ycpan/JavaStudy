package algorithm;

public class GenericMethodDemo {
	public static void main(String [] args){
		Integer[] integer = {1, 5, 9, 3, 8, -3};
		String[] string = {"BeiJing", "TianJin", "ShangHai"};
		GenericMethodDemo.<Integer>print(integer);
		GenericMethodDemo.<String>print(string);
	}
	public static <E> void print(E[] list){
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
