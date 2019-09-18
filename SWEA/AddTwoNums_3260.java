import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class AddTwoNums_3260 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			Stack<Character> st1 = new Stack<>();
			Stack<Character> st2 = new Stack<>();
			Stack<Integer> answer = new Stack<>();
			String s1 = sc.next();
			String s2 = sc.next();
			String temp = "";
			if (s1.length() < s2.length()) {
				temp = s1;
				s1 = s2;
				s2 = temp;
			}

			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();

			for (int i = 0; i < c1.length; ++i)
				st1.push(c1[i]);
			for (int i = 0; i < c2.length; ++i)
				st2.push(c2[i]);

			int over = 0;
			while (st2.size() != 0) {
				int n1 = Integer.parseInt(st1.pop() + "");
				int n2 = Integer.parseInt(st2.pop() + "");

				int n = n1 + n2 + over;
				if (n < 10) {
					answer.push(n);
					over = 0;
				} else {
					answer.push((n) % 10);
					over = (n) / 10;
				}

			}

			while (st1.size() != 0) {
				int n = Integer.parseInt(st1.pop() + "");
				n += over;
				if (n < 10) {
					answer.push(n);
					over = 0;
				} else {
					answer.push((n) % 10);
					over = (n) / 10;
				}
			}
			if (over > 0)
				answer.push(over);

			String ans = "";
			while (answer.size() != 0) {
				ans += answer.pop();
			}
			System.out.println("#" + test_case + " " + ans);

		}

	}

}
