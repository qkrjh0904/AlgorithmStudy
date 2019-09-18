import java.util.Scanner;

public class GoRCCar_1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int answer = 0;
			int n = sc.nextInt();
			int v = 0;	// RC카의 속도
			
			for (int i = 0; i < n; ++i) {
				int command = sc.nextInt();
				if (command == 1) {
					int aValue = sc.nextInt();
					v += aValue;
				} else if (command == 2) {
					int aValue = sc.nextInt();
					v -= aValue;
				}
				if(v<0)
					v = 0;
				answer += v;
			}

			System.out.println("#" + test_case + " " + answer);
		}

	}

}
