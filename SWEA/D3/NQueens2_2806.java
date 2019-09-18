import java.util.Arrays;
import java.util.Scanner;

public class NQueens2_2806 {
	static int n;
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			answer = 0;
			n = sc.nextInt();
			int[] queen = new int[n];

			go(queen, 0);
			System.out.println("#" + test_case + " " + answer);
		}
	}

	private static void go(int[] queen, int depth) {
		if(!promising(queen, depth))
			return;
		if (depth==n) {
			answer++;
			return;
		}

		for (int i = 0; i < n; ++i) {
			queen[depth] = i;
			go(queen, depth + 1);
		}
	}

	private static boolean promising(int[] queen, int depth) {
		boolean flag = true;
		for(int i=0; i<depth-1; ++i) {
			for(int j=i+1; j<depth; ++j) {	//같은 열에 있는지 확인
				if(queen[i]==queen[j]) {
					flag = false;
					break;
				}
			}
			for(int j=i+1; j<depth; ++j) {	//같은 대각선에 있는지 확인
				if(Math.abs(i-j)==Math.abs(queen[i]-queen[j])) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}



}
