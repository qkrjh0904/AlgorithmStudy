import java.util.Arrays;
import java.util.Scanner;


public class LongestUpperPermutation {
	static int answer = Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int c = 0; c < T; ++c) {
			int l = sc.nextInt();
			int[] nums = new int[l];
			int[] len = new int[l];
			for (int i = 0; i < l; ++i) {
				nums[i] = sc.nextInt();
			}
			
			for(int i=0; i<l; ++i) {
				len[i] = 1;
				for(int j=0; j<i; ++j) {
					if(nums[i]>nums[j] && len[i]<len[j]+1)
						len[i] = len[j]+1;
				}
			}
			for(int i=0; i<len.length; ++i) {
				if(answer<len[i])
					answer = len[i];
			}
			
			System.out.println("#"+(c+1)+" "+answer);
			answer = Integer.MIN_VALUE;
		}
		 
	}
}