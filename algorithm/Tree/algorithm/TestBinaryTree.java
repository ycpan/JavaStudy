package algorithm;

public class TestBinaryTree {
	public static void main(String[] args) {
		ExerciseBinaryTree<String> tree = new ExerciseBinaryTree<String>();
		tree.insert("George");
		tree.insert("Michael");
		tree.insert("Tom");
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");
		printTree(tree);
		System.out.println("\n after delete George:");
		tree.delete("George");
		printTree(tree);
		System.out.println("\n after delete Adam:");
		tree.delete("Adam");
		printTree(tree);
		System.out.println("\n after delete Michael:");
		tree.delete("Michael");
		printTree(tree);
		}

	public static void printTree(ExerciseBinaryTree<String> tree) {
		System.out.print("\nInorder (sorted):");
		tree.inorder();
		System.out.print("\nposorder (sorted):");
		tree.posorder();
		System.out.print("\npreorder (sorted):");
		tree.preorder();
		System.out.print("\nthe numbers of tree node is:" +
				tree.getSize());
	}
}
