import java.util.Scanner;

public class BigSmallSame_2070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case){
			String answer = "";
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if(n1>n2)
				answer = ">";
			else if(n1<n2)
				answer = "<";
			else
				answer = "=";
			System.out.println("#"+test_case+" "+answer);
		}

	}

}
