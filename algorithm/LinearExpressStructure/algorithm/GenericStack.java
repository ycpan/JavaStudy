package algorithm;

public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	public GenericStack(){
		
	}//构造函数，默认可以不写，注意构造方法不是GenericStack<E>().
	public int getSize(){
		return list.size();
	}
	public E peek(){
		return list.get(getSize() - 1);
	}
	public E pop(){
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	public void push(E o){
		list.add(o);
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public String toString() {
		return "Stack:" + list.toString();
	}
}
