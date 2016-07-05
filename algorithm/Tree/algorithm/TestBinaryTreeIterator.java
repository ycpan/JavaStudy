package algorithm;

public class TestBinaryTreeIterator {
	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		java.util.Iterator<String> iterator = tree.inorderIterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().toUpperCase() + " ");
		}
		
	}
}
