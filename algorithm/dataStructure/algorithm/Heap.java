package algorithm;

public class Heap <E extends Comparable<E>> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	public Heap(){
	}
	public Heap(E[] objects ){
		for(int i = 0; i<objects.length; i++){
			add(objects[i]);
		}
	}
	public void add(E newObject){
		list.add(newObject);
		int currentIndex = list.size() - 1;
		
		while(currentIndex > 0){
			int parentIndex = (currentIndex - 1) / 2;
			if(list.get(currentIndex).compareTo(list.get(parentIndex)) > 0){
				E tmp = list.get(currentIndex);
				list.set(currentIndex,list.get(parentIndex));
				list.set(parentIndex, tmp);
			}
			else
				break;
			currentIndex = parentIndex;
		}
	}
	public E remove(){
		if(list.size() == 0) return null;
		E removeObject = list.get(0);
		list.set(0,list.get(list.size() - 1));
		list.remove(list.size() - 1);
		
		int currentIndex = 0;
		while(currentIndex < list.size()){
			int leftChildIndex = 2 * currentIndex + 1;
			int rightChildIndex = 2 * currentIndex + 2;
			if(leftChildIndex >= list.size()) break;
			int maxChildIndex = leftChildIndex;
			if(rightChildIndex < list.size()){
				if(list.get(maxChildIndex).compareTo(list.get(rightChildIndex)) < 0){
					maxChildIndex = rightChildIndex;
				}
			}
			if(list.get(currentIndex).compareTo(list.get(maxChildIndex)) < 0){
				E tmp = list.get(currentIndex);
				list.set(currentIndex,list.get(maxChildIndex));
				list.set(maxChildIndex,tmp);
			}
			else
				break;
			
		}
		return removeObject;
	}
	public int getSzie(){
		return list.size();
	}

}
