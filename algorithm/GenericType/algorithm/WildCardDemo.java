package algorithm;

public class WildCardDemo {
	public static void main(String[] args){
		GenericStack<Integer> intStack = new GenericStack<Integer>();
		intStack.push(3);
		intStack.push(2);
		intStack.push(-2);
		System.out.println("the max number is:" + max(intStack));
	}
	public static double max(GenericStack<? extends Number> stack){
		double max = stack.pop().doubleValue();
		while(!stack.isEmpty()){
			double vlaue = stack.pop().doubleValue();
			if(max < vlaue)
				max = vlaue;
		}
		return max;
	}
	
	
	

}
