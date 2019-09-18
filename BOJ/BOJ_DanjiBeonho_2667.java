package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DanjiBeonho_2667 {
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int n;
	static ArrayList<Integer> ans = new ArrayList<>();
	static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		for (int i = 0; i < n; ++i) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < n; ++j) {
				map[i][j] = Integer.parseInt(s[j]);
			}
		}
		int cnt = 0;
		// 지도에 1이 있으면(집이면) bfs탐색하는 코드
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (map[i][j] == 1) {
					bfs(j, i);
					cnt ++;
				}
			}
		}
		Collections.sort(ans);
		System.out.println(cnt);
		for(int i : ans)
			System.out.println(i);
	}

	private static void bfs(int n1, int n2) {
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(n1, n2));
		Pair p;
		int cnt = 0;
		while (!q.isEmpty()) {
			cnt++;
			p = q.poll();
			int x = p.x;
			int y = p.y;
			map[y][x] = 0;
			int tx, ty;
			for (int i = 0; i < 4; ++i) {
				tx = x + dx[i];
				ty = y + dy[i];
				if (tx < 0 || ty < 0 || tx >= n || ty >= n) {
					continue;
				}
				if (map[ty][tx] == 1) {
					map[ty][tx] = 0;
					q.add(new Pair(tx, ty));
				}
			}
		}
		ans.add(cnt);
	}
}

class Pair {
	int x;
	int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}