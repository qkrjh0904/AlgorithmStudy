import java.util.Scanner;

public class TwoNumberArrays_1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];
			for (int i = 0; i < n1; ++i)
				arr1[i] = sc.nextInt();
			for (int i = 0; i < n2; ++i)
				arr2[i] = sc.nextInt();
			
			if (n1 > n2) {
				int temp = n1;
				n1 = n2;
				n2 = temp;
				int[] tempArr = arr1;
				arr1 = arr2;
				arr2 = tempArr;
			}

			int temp = 0;
			int answer = 0;
			for (int k = 0; k < n2 - n1 + 1; ++k) {
				temp = 0;
				for (int i = 0; i < n1; ++i) {
					temp += (arr1[i] * arr2[i + k]);
				}
				answer = Math.max(answer, temp);
			}

			System.out.println("#" + test_case + " " + answer);
		}

	}

}
