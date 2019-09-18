import java.util.Scanner;

public class ThreeCaseSums_3408 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			long s1 = 0, s2 = 0, s3 = 0;
			long n = sc.nextInt();
			s1 = n*(n+1)/2;
			s3 = ((n*2)*(n*2+1)/2 - n)/2+n;
			s2 = s3-n;
			
			System.out.println("#" + test_case + " " + s1 + " " + s2 + " " + s3);
		}

	}

}
