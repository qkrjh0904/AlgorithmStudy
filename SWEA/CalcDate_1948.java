import java.util.Scanner;

public class CalcDate_1948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int answer=0;
			int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			
			if(m1==m2) {
				answer = d2-d1+1;
			}
			else {
				for(int i = m1; i<m2; ++i) {
					answer += month[i];
				}
				answer += d2;
				answer -= d1;
				answer += 1;
			}
			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
