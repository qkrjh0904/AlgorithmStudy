import java.util.Arrays;
import java.util.Scanner;

public class NAndM9_15663 {
	static int[] a = new int[9];
	static int[] num = new int[9];
	static int[] cnt = new int[9];

	static int n;
	static int m;
	static int size;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] temp = new int[n];
		for (int i = 0; i < n; ++i) {
			temp[i] = sc.nextInt();
		}
		Arrays.sort(temp);

		int index = 0;
		int count = 1;
		for (int i = 0; i < n - 1; ++i) {
			if (temp[i] == temp[i + 1]) {
				count++;
			} else {
				num[index] = temp[i];
				cnt[index] = count;
				count = 1;
				index++;
			}
		}
		num[index] = temp[n - 1];
		cnt[index] = count;
		size = index;
		go(0);
	}

	private static void go(int index) {
		if (index == m) {
			for (int i = 0; i < m; ++i)
				System.out.print(num[a[i]] + " ");
			System.out.println();
			return;
		}
		for (int i = 0; i <= size; ++i) {
			if (cnt[i] > 0) {
				cnt[i]--;
				a[index] = i;
				go(index + 1);
				cnt[i]++;
			}
		}
	}

}
