package algorithm;

public interface MyList<E> {
	public void add(E e);
	public void add(int index, E e);
	public E get(int index);
	public int indexOf(E e);
	public int lastIndexOf(E e);
	public Object set(int index, E e);//replace the element at the specify
	//position in this list with the specify element and return new set.
	public void clear();
	public E remove(int index);
	public boolean remove(E e);
	public boolean contains(E e);
	public boolean isEmpty();
	public int size();
	
}
