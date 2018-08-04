package algorithms.binarysearchtree;

public class BSTTestClient {

	public static void main(String[] args) {
		
		BST bst=new BST();
		bst.insert(10, "ten");
		bst.insert(18, "ten");
		bst.insert(16, "ten");
		bst.insert(17, "ten");
		bst.insert(19, "ten");
		bst.insert(21, "ten");
		bst.insert(45, "fourtyfive");
		System.out.println(bst.findMin());
		System.out.println(bst.findMax());
		System.out.println(bst.remove(45));
		System.out.println(bst.findMax());
		
	}
}
