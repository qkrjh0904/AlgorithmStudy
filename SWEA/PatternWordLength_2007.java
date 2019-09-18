import java.util.Scanner;

public class PatternWordLength_2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			int answer = 0;
			String str = sc.next();
			char[] s = str.toCharArray();
			
			boolean flag = false;
			for(int i=1; i<=30; ++i){
				int loop = 30/i;
				String temp = "";
				for(int j=0; j<i; ++j)
					temp += s[j];
				for(int j=0; j<loop; ++j){
					
				}
			}
			
			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
