import java.util.Scanner;

public class TimeAdd_1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();

			int ansM = m1 + m2;
			int ansH = h1 + h2;
			if (ansM >= 60) {
				ansM %= 60;
				ansH++;
			}
			while (ansH > 12) {
				ansH -= 12;
			}

			System.out.println("#" + test_case + " " + ansH + " " + ansM);
		}

	}

}
