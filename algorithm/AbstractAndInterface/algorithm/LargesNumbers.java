package algorithm;
import java.util.ArrayList;
import java.math.*;

public class LargesNumbers {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(45);
		list.add(3445.53);
		list.add(new BigInteger("1832903182930593210"));
		list.add(new BigDecimal("2.0329031874320134738203423293"));
		System.out.println("the largest number is:" + getLargestNumber(list));
//		System.out.println("the largest number is:" + java.util.Collections.sort( list<Number> ));
	}
	public static Number getLargestNumber(ArrayList<Number> list) {
		if(list == null || list.size() == 0) return null;
		Number number = list.get(0);
		for(int i = 1; i < list.size(); i++){
			if(number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		}
		return number;
	}
}
