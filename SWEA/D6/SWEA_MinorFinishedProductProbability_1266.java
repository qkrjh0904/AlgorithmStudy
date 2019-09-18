import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_MinorFinishedProductProbability_1266 {
	static int[] prime = { 2, 3, 5, 7, 11, 13, 17 };
	static int[] comb = { 153, 816, 8568, 31824, 31824, 8568, 18 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; ++tc) {
			double answer = 0;
			String[] s = br.readLine().split("\\s");
			double a = Double.parseDouble(s[0]) / 100;
			double b = Double.parseDouble(s[1]) / 100;

			double pa = 0;
			double pb = 0;
			for (int i = 0; i < 7; ++i) {
				pa = pa + comb[i]*Math.pow(a, prime[i])*Math.pow(1-a, 18-prime[i]);
				pb = pb + comb[i]*Math.pow(b, prime[i])*Math.pow(1-b, 18-prime[i]);
			}
			answer = pa+pb-pa*pb;
			System.out.printf("#%d %6f\n", tc, answer);
		}
	}
}
