package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class NumOfIsland_4963 {
	static int[] dx = { 0, 0, 1, -1, 1, 1, -1, -1 };
	static int[] dy = { 1, -1, 0, 0, 1, -1, 1, -1 };
	static int[][] map;
	static int w, h;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s;
		while (true) {
			int answer = 0;
			s = br.readLine().split("\\s");
			w = Integer.parseInt(s[0]);
			h = Integer.parseInt(s[1]);
			if (w == 0 && h == 0) // 입력이 0 0이 주어지면 탈출
				break;
			map = new int[h][w];
			for (int i = 0; i < h; ++i) {
				s = br.readLine().split("\\s");
				for (int j = 0; j < w; ++j) {
					map[i][j] = Integer.parseInt(s[j]);
				}
			}
			
			for (int i = 0; i < h; ++i) {
				for (int j = 0; j < w; ++j) {
					if (map[i][j] == 1) {
						bfs(j, i);
						answer++;
					}
				}
			}
			System.out.println(answer);
		}
		
	}

	private static void bfs(int n1, int n2) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(n1, n2));
		Point p;
		int cnt = 0;
		while (!q.isEmpty()) {
			cnt++;
			p = q.poll();
			int x = p.x;
			int y = p.y;
			map[y][x] = 0;
			int tx, ty;
			for (int i = 0; i < 8; ++i) {
				tx = x + dx[i];
				ty = y + dy[i];
				if (tx < 0 || ty < 0 || tx >= w || ty >= h) {
					continue;
				}
				if (map[ty][tx] == 1) {
					map[ty][tx] = 0;
					q.add(new Point(tx, ty));
				}
			}
		}
	}
}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}