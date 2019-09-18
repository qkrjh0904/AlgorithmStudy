package d2;

import java.util.Scanner;

public class SimpleDecompress_1946 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case) {
			int n = sc.nextInt();
			int cnt=1;
			System.out.println("#"+test_case);
			for(int i=0; i<n; ++i) {
				String alpa = sc.next();
				int leng = sc.nextInt();
				for(int j=0; j<leng; ++j) {
					System.out.print(alpa);
					if(cnt%10==0) {
						System.out.println();
						cnt = 0;
					}
					cnt++;
				}
			}
			System.out.println();
		}
			

	}

}
