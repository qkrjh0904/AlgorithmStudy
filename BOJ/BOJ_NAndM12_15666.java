import java.util.Arrays;
import java.util.Scanner;

public class NAndM12_15666 {
	static StringBuilder sb = new StringBuilder();
	static int[] num = new int[8];
	static int[] a = new int[8];

	static int n;
	static int m;
	static int cnt;

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
		for (int i = 0; i < n - 1; ++i) {
			if (temp[i] == temp[i + 1]) {
				continue;
			}
			num[index++] = temp[i];
			cnt++;
		}
		num[index] = temp[n-1];
		cnt++;
		go(0, 0);
		System.out.println(sb);
	}

	private static void go(int index, int min) {
		if(index==m){
			for(int i=0; i<m; ++i)
				sb.append(num[a[i]] + " ");
			sb.append("\n");
			return;
		}
		
		for(int i=min; i<cnt; ++i){
			a[index] = i;
			go(index+1, i);
		}
	}

}
