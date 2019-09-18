package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM8_15657 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();;
	static int[] num;
	static int n;
	static int m;
	public static void main(String[] args) throws Exception {
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
		System.out.println(sb);
	}

	private static void go(ArrayList<Integer> a, int index) throws Exception{
		
		if (a.size() == m) {
			for (int i : a) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = index; i < n; ++i) {
			a.add(num[i]);
			go(a, i);
			a.remove(a.size() - 1);
		}
	}
}
