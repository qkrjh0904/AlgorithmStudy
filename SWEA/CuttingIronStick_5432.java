import java.util.Scanner;
import java.util.Stack;

public class CuttingIronStick_5432 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int answer=0;
			String s = sc.next();
			char[] c = s.toCharArray();
			Stack<Character> stack = new Stack<>();
			for(int i=0; i<c.length; ++i) {
				if(c[i]=='(') {
					stack.push(c[i]);
				}
				else if(c[i]==')' && c[i-1]=='('){
					stack.pop();
					answer += stack.size();
				}
				else if(c[i]==')' && c[i-1]==')'){
					stack.pop();
					answer += 1;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
