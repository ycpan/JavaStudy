package algorithm;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.insert("BeiJing");
		tree.insert("NanJing");
		tree.insert("ShangHai");
		tree.insert("BeiJing");
		tree.insert("WuHan");
		System.out.print("inorder sorted:");
		tree.inorder();
		System.out.print("\npreorder sorted:");
		tree.preorder();
		System.out.print("\nposorder sorted:");
		tree.posorder();
		System.out.print("\nIs NanJing in the tree? " + tree.search("NanJing"));
		System.out.print("\nPath from root to NanJing is:");
		java.util.ArrayList<BinaryTree.TreeNode<String>> path =
			tree.path("NanJing");
		for(int i = 0; i < path.size(); i++)
			System.out.print(path.get(i).element + " ");
		Integer[] numbers = {4,1,7,5,9,0,3,2,7,8};
		BinaryTree<Integer> intTree = new BinaryTree<Integer>(numbers);
		System.out.print("\ninorder (sorted):");
		intTree.inorder();
		java.util.Iterator<Integer> iterator = intTree.inorderIterator();
		System.out.println();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
//		BinaryTree<Integer>.InorderIterator iterator1 = intTree.inorderIterator<E>;
//		System.out.println();
//		while(iterator.hasNext()){
//			System.out.print(iterator.next() + " ");
//		}
		
 		
	}
}
