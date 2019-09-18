
public class BTTest {

	static class Node {
		char data; // node의 데이터
		Node left; // 왼쪽 자식노드를 가리킴
		Node rigth; // 오른쪽 자식노드를 가리킴

		public Node(char data) {
			this.data = data;
		}
	}

	static class BinaryTree {
		Node root;

		Node insert(char data, Node parent, int type) {
			Node node = new Node(data); // node 하나 생성
			if (parent == null) { // 부모가 없다면 root에 저장
				root = node;
			} else { // 부모가 있다면 type에 따라 부모노드의 왼쪽 or 오른쪽에 배치
				if (type == 1) {
					parent.left = node;
				} else {
					parent.rigth = node;
				}
			}
			return node;
		}
		
		void print(int n) {
			switch(n) {
			case 1:
				preOrder(root);
				break;
			case 2:
				inOrder(root);
				break;
			case 3:
				postOrder(root);
				break;
				
			}
		}

		// 전위 순회
		void preOrder(Node node) {
			if (node == null)
				return;
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.rigth);
		}

		// 중위 순회
		void inOrder(Node node) {
			if (node == null)
				return;
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.rigth);
		}

		// 후위 순회
		void postOrder(Node node) {
			if (node == null)
				return;
			postOrder(node.left);
			postOrder(node.rigth);
			System.out.print(node.data + " ");
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node nodeA = tree.insert('A', null, 0);	// root노드
		Node nodeB = tree.insert('B', nodeA, 1);
		Node nodeC = tree.insert('C', nodeA, 2);
		Node nodeD = tree.insert('D', nodeB, 1);
		Node nodeE = tree.insert('E', nodeB, 2);
		Node nodeF = tree.insert('F', nodeC, 1);
		Node nodeG = tree.insert('G', nodeC, 2);
		Node nodeH = tree.insert('H', nodeE, 1);
		Node nodeI = tree.insert('I', nodeE, 2);

		// 1. preOrder 2. inOrder 3. postOrder
		tree.print(2);
	}

}
