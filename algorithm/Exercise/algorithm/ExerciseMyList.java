package algorithm;

public interface ExerciseMyList<E> {
	public void add(E e);
	public void add(int index, E e);
	public E get(int index);
	public int indexOf(E e);
	public int lastIndexOf(E e);
	public boolean cotains(E e);
	public boolean remove(E e);
	public E remove(int index);
	public boolean clear();
	public boolean isEmpty();
	public int size();
	public Object set(int index, E e);
}
