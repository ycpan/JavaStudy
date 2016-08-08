package algorithm;



class TreeNode<E> {
	E element;
	TreeNode<E> left;
	TreeNode<E> right;
	public TreeNode(E e) {
		element = e;
	}
}
public class ExerciseTreeDfsAndBfs<E extends Comparable<E>> {
	protected TreeNode<E> root;
	protected int size = 0;
	public  boolean search(E element) {
		TreeNode<E> current = root;
		while(current != null) {
			if(element.compareTo(current.element) < 0 )
				current = current.left;
			if(element.compareTo(current.element) > 0)
				current = current.right;
			else
				return true;
		}
		return false;
		
	}
	public boolean insert(E e){
		
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		if(current == null){
			current = new TreeNode<E>(e);
			return true;
		}
		while(current != null) {
			if(e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			}
			if(e.compareTo(current.element) > 0) {
				parent = current;
				current = current.left;
			}
			else
				return false;
				
				
		}
		if(e.compareTo(parent.element) < 0)
			parent.left = new TreeNode<E>(e);
		else
			parent.right = new TreeNode<E>(e);
		return true;
			
		
	}
	public boolean delete(E e) {
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		
		while(current != null) {
			if(e.compareTo(current.element) < 0){
				parent = current;
				current = current.left;
			}
			if(e.compareTo(current.element) > 0 ) {
				parent = current;
				current = current.left;
			}
			else
				break;
				
		}
		if(current == null)
			return false;
		if(current.left == null) {
			if(parent == null)
				return false;
			if(e.compareTo(current.element) < 0)
				parent.left = current.right;
			if(e.compareTo(current.element) > 0)
				parent.right = current.right;
		}
		else{
			TreeNode<E> rightMostOfParent = current;
			TreeNode<E> rightMost = current.left;
			while(rightMost.right != null) {
				rightMostOfParent = rightMost;
				rightMost = rightMost.right;
			}
			current.element = rightMost.element;
			if(rightMostOfParent.right == rightMost )
				rightMostOfParent.right = rightMost.left;
			else
				rightMostOfParent.left = rightMost.left;
		}
		return true;
			
	}
	public void preOrder() {
		preOrder(root);
	}
	private void preOrder(TreeNode<E> node) {
		System.out.println(node.element);
		preOrder(node.left);
		preOrder(node.right);
	}
	public void bfs(TreeNode<E> root) {
		java.util.Queue<TreeNode<E>> queue1 = 
				new java.util.LinkedList<TreeNode<E>>();
		java.util.Queue<TreeNode<E>> queue2 = 
				new java.util.LinkedList<TreeNode<E>>();
		queue1.offer(root);
		while(queue1.isEmpty() || queue2.isEmpty()) {
			if(queue2.isEmpty()){
				while(!queue1.isEmpty()){
					TreeNode<E> temp = queue1.poll();
					if(temp.left != null)
						queue2.offer(temp.left);
					if(temp.right != null)
						queue2.offer(temp.right);
					System.out.print(temp.element + " ");
				}
			}
			else {
				while(!queue2.isEmpty()){
					TreeNode<E> temp = queue2.poll();
					if(temp.left != null)
						queue1.offer(temp.left);
					if(temp.right != null)
						queue1.offer(temp.right);
					
					System.out.print(temp.element + " ");
				}
			}
			System.out.println();
		} 
		
	}
	public void dfs(TreeNode<E> root) {
		java.util.Stack<TreeNode<E>> stack = 
				new java.util.Stack<TreeNode<E>>();
		stack.push(root);
		while(stack.isEmpty()) {
			TreeNode<E> temp = stack.pop();
			System.out.println(temp.element);
			if(temp.right != null)
				stack.push(temp.right);
			if(temp.left != null)
				stack.push(temp.left);
		}
	}
	
}
