import java.util.Arrays;
import java.util.Scanner;

public class SortingNums_1966 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int n = sc.nextInt();
			int[] nums = new int[n];
			for(int i=0; i<n; ++i){
				nums[i] = sc.nextInt();
			}
			Arrays.sort(nums);
			
			System.out.print("#" + test_case + " ");
			for(int i=0; i<n; ++i)
				System.out.print(nums[i] + " ");
			System.out.println();
		}

	}

}
