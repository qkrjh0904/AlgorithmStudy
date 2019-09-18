import java.util.Scanner;

public class AddOnlyOdd_2072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case){
			int answer=0;
			for(int i=0; i<10; ++i){
				int temp = sc.nextInt();
				if(temp%2==1)
					answer+=temp;
			}
			
			System.out.println("#"+test_case+" "+answer);
		}

	}

}
