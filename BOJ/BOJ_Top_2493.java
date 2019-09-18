
import java.util.Scanner;
import java.util.Stack;

public class Top_2493_baekjoon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> idx = new Stack<>();

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int n = Integer.parseInt(s1);
		String[] nums = s2.split("\\s");
		
		sb.append("0");
		
		stack.push(Integer.parseInt(nums[0]));
		idx.push(1);
		
		int h = 0;
		for (int i = 2; i <= n; ++i) {
			h = Integer.parseInt(nums[i - 1]);
			while (!stack.isEmpty()) {
				if (stack.peek() >= h) {
					sb.append(" " + idx.peek());
					stack.push(h);
					idx.push(i);
					break;
				} else {
					stack.pop();
					idx.pop();
				}
			}
			if (stack.isEmpty()) {
				stack.push(h);
				idx.push(i);
				sb.append(" " + 0);
			}

		}
		System.out.println(sb);


	}

}
