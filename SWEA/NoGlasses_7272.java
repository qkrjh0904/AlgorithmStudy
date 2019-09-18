import java.util.Scanner;

public class NoGlasses_7272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			String answer = "SAME";
			String s1 = sc.next();
			String s2 = sc.next();
			if (s1.length() != s2.length()) {
				answer = "DIFF";
				System.out.println("#" + test_case + " " + answer);
				continue;
			}
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			for(int i=0; i<c1.length; ++i) {
				if(c1[i]=='B' && c2[i]!='B') {
					answer = "DIFF";
					break;
				}
				if(c2[i]=='B' && c1[i]!='B') {
					answer = "DIFF";
					break;
				}
				if(("ADOPQR".contains(c1[i]+""))&&!("ADOPQR".contains(c2[i]+""))) {
					answer = "DIFF";
					break;
				}
				if(("ADOPQR".contains(c2[i]+""))&&!("ADOPQR".contains(c1[i]+""))) {
					answer = "DIFF";
					break;
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
