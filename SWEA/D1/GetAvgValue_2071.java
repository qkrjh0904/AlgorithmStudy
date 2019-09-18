import java.util.Scanner;

public class GetAvgValue_2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case){
			int answer=0;
			int sum=0;
			for(int i=0; i<10; ++i){
				int temp = sc.nextInt();
				sum+=temp;
			}
			if(sum%10>=5)
				answer = sum/10+1;
			else
				answer = sum/10;
			
			System.out.println("#"+test_case+" "+answer);
		}
	}

}
