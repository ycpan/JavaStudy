package algorithm;

public class ExerciseMyArrayList<E> extends ExerciseMyAbstractList<E> {

	public static final int INTIAL_CAPACITY = 16; 
	@SuppressWarnings("unchecked")
	private E[] list = (E[])new Object[INTIAL_CAPACITY];
	public ExerciseMyArrayList(){
		
	}
	public ExerciseMyArrayList(E[] objects){
		super(objects);
//		for(int i = 0; i < objects.length; i++)
//			add(objects[i]);
	}
	public void add(int index, E e) {
		ensureCapacity();
		for(int i = size -1; i >= index; i--)
			list[i + 1] = list[i];
		list[index] = e;
		size++;
	}
	private void ensureCapacity() {
		if(size >= list.length){
			 @SuppressWarnings("unchecked")
			E[] newList = (E[]) new Object[size * 2 + 1];
			 System.arraycopy(list,0,newList,0,size);
			 list = newList;
		}
	}
	

	public E get(int index) {
		//if(index >= size || index < 0) return null;
		return list[index];
	}

	public int indexOf(E e) {
		for(int i = 0; i < size; i++)
			if(list[i] == e) return i;
		return -1;
		
	}

	public int lastIndexOf(E e) {
		for(int i = size - 1; i >= 0; i--)
			if(list[i] == e) return i;
		return -1;
	}

	public boolean cotains(E e) {
		for(int i = 0; i < size; i++)
			if(e.equals(list[i])) return true;
		return false;
	}

	public E remove(int index) {
		
		E temp = list[index];
		for(int i = index + 1; i < size; i++){
			list[i - 1] = list[i];
			
		}
		list[size - 1] = null;
		size--;
			return temp;
	}

	@SuppressWarnings("unchecked")
	public boolean clear() {
		list = (E[])new Object[INTIAL_CAPACITY];
		size = 0;
		return true;
	}


	public E set(int index, E e) {
		//if(index >= size || index < 0) return null;
		E temp = list[index];
		list[index] = e;
		return temp;
	}
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i < size; i ++){
			result.append(list[i]);
			if(i != size - 1)
				result.append(",");
			else
				result.append("]");
		}
		return "ExerciseMyArrayList:" + result.toString();
	}
	public void trimToSize(){
		if(size != list.length){
			@SuppressWarnings("unchecked")
			E[] newList = (E[]) new Object[list.length];
			System.arraycopy(list,0,newList,0,list.length);
			list = newList;
		}
	}
	
}
