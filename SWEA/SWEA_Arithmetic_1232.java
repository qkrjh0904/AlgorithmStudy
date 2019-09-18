import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Node {
	String data;
	int left;
	int right;

	public Node(String data, int left, int right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node(String data, int left) {
		this.data = data;
		this.left = left;
	}

	public Node(String data) {
		this.data = data;
	}

}

public class SWEA_Arithmetic_1232 {
	static Stack<Double> stack = new Stack<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; ++tc) {
			int n = Integer.parseInt(br.readLine());
			Node[] nodes = new Node[n + 1];
			for (int i = 1; i <= n; ++i) {
				String[] s = br.readLine().split("\\s");
				if (s.length == 4)
					nodes[i] = new Node(s[1], Integer.parseInt(s[2]), Integer.parseInt(s[3]));
				else if (s.length == 3)
					nodes[i] = new Node(s[1], Integer.parseInt(s[2]));
				else
					nodes[i] = new Node(s[1]);
			}

			System.out.print("#" + tc + " ");
			postOrder(nodes, 1);
			double answer = stack.pop();
			System.out.println((int) answer);

		}

	}

	private static void postOrder(Node[] nodes, int n) {
		if (n == 0)
			return;
		postOrder(nodes, nodes[n].left);
		postOrder(nodes, nodes[n].right);
		if (nodes[n].data.equals("+") || nodes[n].data.equals("-") || nodes[n].data.equals("*")
				|| nodes[n].data.equals("/")) {
			double n2 = stack.pop();
			double n1 = stack.pop();
			if (nodes[n].data.equals("+")) {
				stack.add(n1 + n2);
			} else if (nodes[n].data.equals("-")) {
				stack.add(n1 - n2);
			} else if (nodes[n].data.equals("*")) {
				stack.add(n1 * n2);
			} else {
				stack.add(n1 / n2);
			}
		} else {
			stack.add(Double.parseDouble(nodes[n].data));
		}

	}

}
