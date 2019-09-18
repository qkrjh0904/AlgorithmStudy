import java.util.Scanner;

public class LeaveCompany_14501 {
	static int[] time;
	static int[] pay;
	static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		time = new int[n];
		pay = new int[n];

		for (int i = 0; i < n; ++i) {
			time[i] = sc.nextInt();
			pay[i] = sc.nextInt();
		}

		// n, 현재 일수, 현재 이익
		go(n, 1, 0);
		System.out.println(max);
	}

	private static void go(int n, int now, int sum) {
		if (n + 1 == now) {
			if (max < sum)
				max = sum;
			return;
		}
		if (n+1 <now) {
			return;
		}

		go(n, now+time[now-1], sum+pay[now-1]);
		go(n, now+1, sum);
	}

}
