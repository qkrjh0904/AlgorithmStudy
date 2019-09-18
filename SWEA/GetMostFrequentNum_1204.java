import java.util.Scanner;

public class GetMostFrequentNum_1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			int tcase = sc.nextInt();
			int[] nums = new int[101];
			
			for(int i=0; i<1000; ++i){
				int temp = sc.nextInt();
				nums[temp]++;
			}
			
			int max = 0;
			int answer=0;
			for(int i=100; i>=0; --i){
				if(max<nums[i]){
					max = nums[i];
					answer = i;
				}
			}
			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
