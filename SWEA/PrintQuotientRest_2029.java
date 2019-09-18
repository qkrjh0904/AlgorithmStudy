import java.util.Scanner;

public class PrintQuotientRest_2029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case){
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("#" + test_case + " " + n1/n2 + " " + n1%n2);
		}

	}

}
