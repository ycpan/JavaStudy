package algorithm;

public class HeapExercise<E extends Comparable<E>> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	public HeapExercise(){
		
	}
	public HeapExercise(E[] objects){
		for(int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	public void add(E newObject){
		list.add(newObject);
		int currentIndex = list.size() - 1;
		while(currentIndex > 0){
			int currentParentIndex = (currentIndex - 1) / 2;
			if(list.get(currentIndex).compareTo(list.get(currentParentIndex)) > 0){
				E temp = list.get(currentParentIndex);
				list.set(currentParentIndex, list.get(currentIndex));
				list.set(currentIndex, temp);
						
			}
			else
				break;
			currentIndex = currentParentIndex;
		}
	}
	public E remove(){
		//if(!list.isEmpty()) return null;
		if(list.size() == 0) return null;
		E removeObject = list.get(0);
		
		list.set(0,list.get(list.size() - 1));
		list.remove(list.size() - 1);
		int currentIndex = 0;
		while(currentIndex < list.size()){
			int leftChildren = 2 * currentIndex + 1;
			int rightChildren = 2 * currentIndex + 2;
			if(leftChildren >= list.size()) break;
			E max = list.get(leftChildren);
			int maxIndex = leftChildren;
			if(rightChildren < list.size()){
				if(list.get(leftChildren).compareTo(list.get(rightChildren)) < 0){
					max = list.get(rightChildren);
					maxIndex = rightChildren;
				}
			}
			if(list.get(currentIndex).compareTo(max) < 0){
				E temp = list.get(currentIndex);
				list.set(currentIndex, max);
				list.set(maxIndex, temp);
				currentIndex = maxIndex;
			}
			else 
				break;
			
		}
		return removeObject;
	}
	public int getSize(){
		return list.size();
	}
}
