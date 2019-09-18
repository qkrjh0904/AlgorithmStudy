package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NAndM7_15656 {
	static StringBuilder sb;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));;
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
		go(a);
		bw.flush();
		bw.close();
	}	

	private static void go(ArrayList<Integer> a) throws Exception{
		
		if (a.size() == m) {
			sb = new StringBuilder();
			for (int i : a) {
				sb.append(i+" ");
			}
			bw.write(sb.toString()+"\n");
			return;
		}

		for (int i = 0; i < n; ++i) {
			a.add(num[i]);
			go(a);
			a.remove(a.size() - 1);
		}
	}
}
