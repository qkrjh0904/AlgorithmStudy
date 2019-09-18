package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MazeExploration_2178 {
	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		int r = Integer.parseInt(s[0]);
		int c = Integer.parseInt(s[1]);
		int[][] map = new int[r][c];
		boolean[][] visit = new boolean[r][c];
		
		Queue<Pair> q = new LinkedList<>();
		for (int i = 0; i < r; ++i) {
			s = br.readLine().split("");
			for (int j = 0; j < c; ++j) {
				map[i][j] = Integer.parseInt(s[j]);
			}
		}
		q.add(new Pair(0, 0));
		visit[0][0] = true;
		
		int answer=Integer.MAX_VALUE;
		int level = 2;
		Pair p;
		int row, col;
		while (!q.isEmpty()) {
			int qSize = q.size();
			for (int i = 0; i < qSize; ++i) {
				p = q.poll();
				row = p.r;
				col = p.c;
				if(answer<=level)
					continue;
				if(row==r-1&&col==c-1) {
					answer = Math.min(answer, level);
				}
				
				int tr, tc;
				for (int j = 0; j < 4; ++j) {
					tr = row + dr[j];
					tc = col + dc[j];
					if (tr < 0 || tc < 0 || tr >= r || tc >= c)
						continue;
					if(map[tr][tc]==1 && !visit[tr][tc]) {
						map[tr][tc] = level;
						visit[tr][tc] = true;
						q.add(new Pair(tr, tc));
					}
				}
			}
			level++;
		}
		
		System.out.println(answer-1);
	}
}

class Pair {
	int r;
	int c;

	public Pair(int r, int c) {
		this.r = r;
		this.c = c;
	}

}