import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SWEA_ArithmeticEffectiveness_1233 {
	static Stack<Double> stack = new Stack<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; ++tc) {
			int n = Integer.parseInt(br.readLine());
			int answer = 1;
			for (int i = 1; i <= n; ++i) {
				String[] s = br.readLine().split("\\s");
				if (s.length == 2 && (s[1].equals("+") || s[1].equals("-") || s[1].equals("*") || s[1].equals("/"))) {
					answer = 0;
				}
			}

			System.out.println("#" + tc + " " + answer);

		}

	}

}
