package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumOfConnectedComponents_11724 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] map = new int[1001][1001];
	static boolean[] visited = new boolean[1001];
	static int cnt;

	public static void main(String[] args) throws Exception {
		String[] s = br.readLine().split("\\s");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int n1, n2;
		for (int i = 0; i < m; ++i) {
			s = br.readLine().split("\\s");
			n1 = Integer.parseInt(s[0]);
			n2 = Integer.parseInt(s[1]);
			map[n1][n2] = map[n2][n1] = 1;
		}

		for (int i = 1; i <= n; ++i) {
			if (!visited[i]) {
				dfs(n, i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	private static void dfs(int n, int start) {
		if (visited[start]) {
			return;
		}
		visited[start] = true;
		for (int i = 1; i <= n; ++i) {
			if (map[start][i] == 1) {
				dfs(n, i);
			}
		}
	}
}
