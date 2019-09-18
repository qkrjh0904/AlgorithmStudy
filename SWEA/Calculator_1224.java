import java.util.Scanner;
import java.util.Stack;

public class Calculator_1224 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; ++test_case) {
			int n = sc.nextInt();
			String s = sc.next();
			s = toPostfix(s);
			System.out.println("#" + test_case + " " + calcPostfix(s));
		}

	}

	private static int calcPostfix(String s) {
		String[] data = s.split(" ");
		Stack<Integer> num = new Stack<>();
		int answer = 0;
		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < data.length; ++i) {
			if (data[i].equals("/") || data[i].equals("*") || data[i].equals("+") || data[i].equals("-")) {
				temp2 = num.pop();
				temp1 = num.pop();
				if (data[i].equals("*")) {
					num.push(temp1 * temp2);
				} else if (data[i].equals("/")) {
					num.push(temp1 / temp2);
				} else if (data[i].equals("+")) {
					num.push(temp1 + temp2);
				} else {
					num.push(temp1 - temp2);
				}
				continue;
			}
			num.push(Integer.parseInt(data[i]));
		}
		answer = num.pop();
		return answer;
	}

	private static String toPostfix(String s) {
		Stack<Character> op = new Stack<>();
		char[] c = s.toCharArray();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length; ++i) {
			if (c[i] >= '0' && c[i] <= '9') {
				sb.append(c[i]);
				if (i + 1 < c.length && c[i + 1] >= '0' && c[i + 1] <= '9')
					continue;
				sb.append(" ");
			} else {
				if (c[i] == ')') {
					while (op.peek() != '(') {
						sb.append(op.pop() + " ");
					}
					op.pop(); // '(' 제거
					continue;
				}
				if (op.isEmpty() || icp(c[i]) > isp(op.peek())) {
					op.push(c[i]);
					continue;
				}
				while (!op.isEmpty() && icp(c[i]) <= isp(op.peek())) {
					sb.append(op.pop() + " ");
				}
				op.push(c[i]);

			}
		}
		while (!op.isEmpty()) {
			sb.append(op.pop() + " ");
		}
		return sb.toString();
	}

	private static int isp(char c) {
		if (c == '*' || c == '/')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		else
			return 0;
	}

	private static int icp(char c) {
		if (c == '*' || c == '/')
			return 2;
		else if (c == '+' || c == '-')
			return 1;
		else
			return 3;
	}

}
