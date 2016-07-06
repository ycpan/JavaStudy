package algorithm;

public class ExerciseBinaryTree<E extends Comparable<E>> extends
	ExerciseAbstractTree<E> {
	protected ExerciseTreeNode<E> root;
	public ExerciseBinaryTree() {
		
	}
	public ExerciseBinaryTree(E[] objects) {
		super(objects);
	}
	
	public boolean search(E e) {
		ExerciseTreeNode<E> current = root;
		while(current != null){
			if(e.compareTo(current.element) < 0)
				current = current.left;
			else if(e.compareTo(current.element) > 0)
				current = current.right;
			else
				return true;
		}
		return false;
	}

	public boolean insert(E e) {
		if(root == null) {
			root = createNewTreeNode(e);
		}
		else{
			
			ExerciseTreeNode<E> current = root;
			ExerciseTreeNode<E> parent = null;
			
			while(current != null){
				if(e.compareTo(current.element) < 0){
					parent = current;
					current = current.left;
				}
				else if(e.compareTo(current.element) > 0){
					parent = current;
					current = current.right;
				}
				else
					return false;
			}
			if(e.compareTo(parent.element) < 0){
				parent.left = createNewTreeNode(e);
			}
//			if(e.compareTo(parent.element) > 0){
			else {
			parent.right = createNewTreeNode(e);
			}
		}
			size++;
			return true;
	}
	protected ExerciseTreeNode<E> createNewTreeNode(E e) {
		return new ExerciseTreeNode<E>(e);
	}

	public boolean delete(E e) {
		ExerciseTreeNode<E> current = root;
		ExerciseTreeNode<E> parent = null;
		while(current != null){
			if(e.compareTo(current.element) < 0){
				parent = current;
				current = current.left;
			}
			if(e.compareTo(current.element) > 0){
				parent = current;
				current = current.right;
			}
			else
				break;
		}
		if(current == null)
			return false;
		if(current.left == null){
			if(parent == null)
				root = current.right;
			else{
				if(e.compareTo(parent.element) < 0)
					parent.left =current.right;
				if(e.compareTo(parent.element) > 0)
					parent.right = current.right;
			}
		}
		else{
			ExerciseTreeNode<E> mostRight = current.left;
			ExerciseTreeNode<E> parentOfMostRight = parent;
			while(mostRight.right != null){
				parentOfMostRight = mostRight;
				parentOfMostRight = parentOfMostRight.right;
			}
			current.element = mostRight.element;
			if(parentOfMostRight.right == mostRight)
				parentOfMostRight.right = mostRight.left;
			else
				parentOfMostRight.left = mostRight.left;
				
		}
		size--;
		return true;
	}

	public void inorder() {
		inorder(root);
	}
	private void inorder(ExerciseTreeNode<E> root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}
	public void posorder() {
		posorder(root);
	}
	private void posorder(ExerciseTreeNode<E> root) {
		if(root == null) return;
		posorder(root.left);
		posorder(root.right);
		System.out.print(root.element + " ");
	}
	public void preorder() {
		preorder(root);
	}
	private void preorder(ExerciseTreeNode<E> root) {
		if(root == null) return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public int getSize() {
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	
	public static class ExerciseTreeNode<E> {
		E element;
		ExerciseTreeNode<E> left;
		ExerciseTreeNode<E> right;
		public ExerciseTreeNode(E e){
			element = e;
		}
	}
	public java.util.ArrayList<ExerciseTreeNode<E>> path(E e) {
		java.util.ArrayList<ExerciseTreeNode<E>> list = 
				new java.util.ArrayList<ExerciseTreeNode<E>>();
		ExerciseTreeNode<E> current = root;
		while(current != null){
			list.add(current);
			if(e.compareTo(current.element) < 0)
				current = current.left;
			else if(e.compareTo(current.element) > 0)
				current = current.right;
			else
				break;
		}
		return list;
	}
	public java.util.ArrayList<E> path1(E e) {
		java.util.ArrayList<E> list = new java.util.ArrayList<E>();
		ExerciseTreeNode<E> current = root;
		while(current != null){
			list.add(current.element);
			if(e.compareTo(current.element) < 0)
				current = current.left;
			else if(e.compareTo(current.element) > 0)
				current = current.right;
			else
				break;
		}
		return list;
	}
	public java.util.Iterator<E> iterator(){
		return inorderIterator();
	}
	public java.util.Iterator<E> inorderIterator(){
		return new InorderIterator();
	}
	class InorderIterator implements java.util.Iterator<E> {
		private java.util.ArrayList<E> list = 
				new java.util.ArrayList<E>();
		private int current = 0;
		public InorderIterator(){
			inorder();
		}
		public void inorder(){
			inorder(root);
		}
		private void inorder(ExerciseTreeNode<E> root) {
			if(root == null) return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}
		public boolean hasNext() {
			if(current < list.size()) return true;
			return false;
		}
		public E next() {
			return list.get(current++);
		}
		public void remove(){
			delete(list.get(current));
			list.clear();
			inorder();
		}
	}
	public void clear(){
		root = null;
		size = 0;
	}

}
