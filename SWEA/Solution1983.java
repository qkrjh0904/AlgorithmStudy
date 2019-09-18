import java.util.Arrays;
import java.util.Scanner;

public class Solution1983 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case) {
			String answer = "";
			String[] scores = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };
			int n = sc.nextInt();
			int k = sc.nextInt();
			double[] score = new double[n];
			double mid = 0;
			double fin = 0;
			double hw = 0;
			double kScore = 0;
			for(int i=0; i<n; ++i) {
				mid = sc.nextDouble();
				fin = sc.nextDouble();
				hw = sc.nextDouble();
				score[i] = mid*0.35 + fin*0.45 + hw*0.2;
			}
			kScore = score[k-1];
			Arrays.sort(score);
			int kIdx = 0;
			for(int i=0; i<n; ++i) {
				if(score[i]==kScore) {
					kIdx = i;
					break;
				}
			}
			int bundle = n/10;
			answer = scores[kIdx/bundle];
			
			
			System.out.println("#"+test_case+" "+answer);
		}


	}

}
