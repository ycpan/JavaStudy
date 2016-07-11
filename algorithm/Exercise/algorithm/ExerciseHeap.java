package algorithm;

public class ExerciseHeap<E extends Comparable<E>> {
	private java.util.ArrayList<E> list =
			new java.util.ArrayList<E>();
	public ExerciseHeap(){
		
	}
	
	public ExerciseHeap(E[] objects) {
		for( int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	public void add(E newObject) {
		list.add(newObject);
		int currentIndex = list.size() - 1;
		while ( currentIndex > 0) {
			int parentIndex = (currentIndex - 1) / 2;
			if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0){
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(parentIndex));
				list.set(parentIndex, temp);
			}
			else
				break;
			currentIndex = parentIndex;
		}
	}
	public E remove() {
		if(list.size() == 0) return null;
		E removeObject = list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		
		int currentIndex = 0;
		while(currentIndex < list.size()) {
			int childLeft = 2 * currentIndex + 1;
			int childRight = 2 * currentIndex + 2;
			if(childLeft >= list.size())
				break;
			int childMax = childLeft;
			if(childRight < list.size()) {
				
				if(list.get(childRight).compareTo(list.get(childMax)) > 0)
					childMax = childRight;
			}
			if(list.get(currentIndex).compareTo(list.get(childMax)) < 0) {
				E temp = list.get(currentIndex);
				list.set(currentIndex, list.get(childMax));
				list.set(childMax, temp);
			}
			else 
				break;
			currentIndex = childMax;
		}
		return removeObject;
		
	}
	public int getSize() {
		return list.size();
	}


}
