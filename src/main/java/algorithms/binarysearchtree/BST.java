package algorithms.binarysearchtree;

public class BST {

	Node root;

	public void insert(int key, String value) {
		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent;
		while (true) {
			parent = current;
			if (key < current.key) {
				current = current.leftChild;
				if (current == null) { // Its parent is the leaf node
					parent.leftChild = newNode;
					return;
				}
			} else {
				current = current.rightChild;
				if (current == null) {
					parent.rightChild = newNode;
					return;
				}
			} // else loop end
		} // while loop end

	}

	public int findMin() {
		Node current = root;
		Node leftLast = null;
		if (current == null) {
			return -1;
		}

		while (current != null) {
			leftLast = current;
			current = current.leftChild;
		}
		return leftLast.key;
	}

	public int findMax() {
		Node current = root;
		Node rightLast = null;
		if (current == null) {
			return -1;
		}

		while (current != null) {
			rightLast = current;
			current = current.rightChild;
		}
		return rightLast.key;
	}
//Repair this to handle the root element
	public boolean remove(int key) {

		// if ToBeRemoved node is a root
		Node current = root;
		Node currentParent = root;
		if (current.key == key) {
			current = null;
			return true;
		}
		boolean isLeftChild = false;
		// Searching to find the node with the key to delete
		while (current.key != key) {
			currentParent = current;
			if (key < current.key) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null) {
				return false;
			}
		}
		// found to delete
		Node NodeToDelete = current;

		// if ToBeRemoved Node is a leaf

		if (current.leftChild == null && current.rightChild == null) {
			if (isLeftChild) {
				currentParent.leftChild = null;
			} else {
				currentParent.rightChild = null;
			}
			return true;
		}
		// if ToBeRemoved Node has one child
		else if (current.leftChild == null) {
			if (isLeftChild)
				currentParent.leftChild = current.rightChild;
			else
				currentParent.rightChild = current.rightChild;

			return true;
		} else if (current.rightChild == null) {
			if (isLeftChild)
				currentParent.leftChild = current.leftChild;
			else
				currentParent.rightChild = current.leftChild;
			return true;
		}

		// if ToBeRemoved has 2 childrens (tricky)
		else {
			//find the least node in the sub tree of the current node
			
			Node tcurrent=current;
			Node tcurrentParent=currentParent;
			Node tLeftLast=null;
			
			while(tcurrent!=null) {
				tcurrentParent=tcurrentParent.leftChild;
				tLeftLast=tcurrent;
				tcurrent=tcurrent.leftChild;
			}
			tLeftLast.leftChild=current.leftChild;
			tLeftLast.rightChild=current.rightChild;
			if(isLeftChild) {
				tcurrentParent.leftChild=tLeftLast;
			}
			else
				tcurrentParent.rightChild=tLeftLast;
			
			tcurrentParent.leftChild=null;
			
			
		}

		return true;
	}
	
	public void traverseTree() {
		
	}

}
