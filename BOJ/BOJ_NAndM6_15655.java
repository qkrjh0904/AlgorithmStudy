package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM6_15655 {
	static int[] num;
	static int n;
	static int m;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		StringTokenizer st2 = new StringTokenizer(s2);
		n = Integer.parseInt(st1.nextToken());
		m = Integer.parseInt(st1.nextToken());
		num = new int[n];
		for (int i = 0; i < n; ++i) {
			num[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(num);
		ArrayList<Integer> a = new ArrayList<>();
		go(a, 0);
	}

	private static void go(ArrayList<Integer> a, int index) {
		if (a.size() == m) {
			for (int i : a)
				System.out.print(i + " ");
			System.out.println();
			return;
		}

		for (int i = index; i < n; ++i) {
			a.add(num[i]);
			go(a, i+1);
			a.remove(a.size() - 1);
		}
	}
}
