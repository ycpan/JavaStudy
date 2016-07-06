package algorithm;

public abstract class ExerciseAbstractTree<E extends Comparable<E>>
	implements ExerciseTree<E>{
	protected int size = 0;
	public ExerciseAbstractTree(){
		
	}
	public ExerciseAbstractTree(E[] objects){
		for(int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}
	public void inorder(){
		
	}
	public void posorder(){
		
	}
	public void preorder(){
		
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public java.util.Iterator<E> iterator(){
		return null;
	}
	
}
