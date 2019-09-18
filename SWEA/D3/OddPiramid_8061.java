package d2;

import java.util.Scanner;

public class OddPiramid_8061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case) {
			long n = sc.nextInt();
			long n1 = 2*n*n-4*n+3;
			long n2 = 2*n*n-1;
			System.out.println("#"+test_case+" " +n1 + " " + n2);
		}
		

	}

}
