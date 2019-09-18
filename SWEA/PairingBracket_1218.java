import java.util.Scanner;
import java.util.Stack;

public class PairingBracket_1218 {
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case=1; test_case<=10; ++test_case) {
			Stack<Character> stack = new Stack<Character>();
			int n = sc.nextInt();
			
			String s = sc.next();
			char[] data = s.toCharArray();
			boolean flag = true;
			for (int i = 0; i < n; ++i) {
				char c = data[i];
				if (c == '(' || c == '[' || c == '{' || c == '<') {
					stack.push(c);
				}
				else {
					if (stack.size() == 0) {
						flag = false;
						break;
					}
					if((stack.peek()=='(' && c==')') || (stack.peek()=='[' && c==']') 
							|| (stack.peek()=='{' && c=='}') || (stack.peek()=='<' && c=='>')) {
						stack.pop();
					}					
					else {
						flag = false;
						break;
					}
				}
			}
			
			if(flag && stack.size()==0)
				answer = 1;
			else
				answer = 0;
			
			System.out.println("#"+test_case+" "+answer);
		}

	}

}
