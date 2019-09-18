package d2;

import java.util.Scanner;

public class SimpleFractionalDecomposition_1945 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case) {
			int[] nums = new int[5];
			int n = sc.nextInt();
			
			while(n%2==0) {
				nums[0]++;
				n/=2;
			}
			while(n%3==0) {
				nums[1]++;
				n/=3;
			}
			while(n%5==0) {
				nums[2]++;
				n/=5;
			}
			while(n%7==0) {
				nums[3]++;
				n/=7;
			}
			while(n%11==0) {
				nums[4]++;
				n/=11;
			}
			
			System.out.print("#"+test_case);
			for(int i=0; i<5; ++i)
				System.out.print(" " + nums[i]);
			System.out.println();
		}

	}

}
