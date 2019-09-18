
class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}

class Tree {
	Node root;

	boolean isEmpty() {
		return root == null;
	}

	void insert(int data) {
		// 일단 node하나 생성

		Node newNode = new Node(data);

		if (isEmpty()) {
			root = newNode;
			return;
		}

		Node node = root;
		while (node != null) {
			// 이미 있는 data라면 return
			if (node.data == data) {
				return;
			} else if (node.data < data) {	// 현재 node의 데이터보다 클 경우
				if (node.right == null) {
					node.right = newNode;
					return;
				}else {
					node = node.right;
				}
			} else {	// 현재 node의 데이터보다 작은 경우
				if(node.left==null) {
					node.left = newNode;
					return;
				}else {
					node = node.left;
				}
			}
		}
	}

	boolean search(int data) {
		if (isEmpty())
			return false;

		Node node = root;
		while (node != null) {
			// 찾으면 return true
			if (node.data == data) {
				return true;
			} else if (node.data < data) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		// 못찾고 while문 빠져나오면 return false
		return false;
	}
	
	void inOrder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data + " ");
		inOrder(node.left);
		inOrder(node.right);
	}
}

public class Heap {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(9);
		tree.insert(4);
		tree.insert(3);
		tree.insert(6);
		tree.insert(12);
		tree.insert(15);
		tree.insert(13);
		tree.insert(17);
		
		System.out.println(tree.search(9));
		System.out.println(tree.search(4));
		System.out.println(tree.search(3));
		System.out.println(tree.search(6));
		System.out.println(tree.search(15));
		System.out.println(tree.search(12));
		System.out.println(tree.search(13));
		System.out.println(tree.search(17));
		System.out.println(tree.search(11));
		
		
		tree.inOrder(tree.root);
	}
}
