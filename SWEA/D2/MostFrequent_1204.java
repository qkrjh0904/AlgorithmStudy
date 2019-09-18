import java.util.Scanner;

public class MostFrequent_0718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case) {
			int n = sc.nextInt();
			int[] scoreCnt = new int[101];
			int temp = 0;
			for (int i = 0; i < 1000; ++i) {
				scoreCnt[sc.nextInt()]++;
			}
			int max = 0;
			for (int i = 0; i < 100; ++i) {
				if (max < scoreCnt[i])
					max = scoreCnt[i];
			}
			int answer=0;
			for(int i=100; i>=0; --i) {
				if(max==scoreCnt[i]) {
					answer = i;
					break;
				}
			}
			System.out.println("#"+test_case+" "+answer);
		}
	}

}
