package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
	int r;
	int c;
	public Pair(int r, int c) {
		this.r = r;
		this.c = c;
	}
	
}
public class Tomato_7576 {
	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		int c = Integer.parseInt(s[0]);
		int r = Integer.parseInt(s[1]);
		int[][] map = new int[r][c];
		boolean[][] visit = new boolean[r][c];
		
		Queue<Pair> q = new LinkedList<>();
		for (int i = 0; i < r; ++i) {
			s = br.readLine().split("\\s");
			for (int j = 0; j < c; ++j) {
				map[i][j] = Integer.parseInt(s[j]);
				if (map[i][j] == 1) {
					q.add(new Pair(i, j));
				}
			}
		}

		int day = 2;
		Pair p;
		int row, col;
		while (!q.isEmpty()) {
			int qSize = q.size();
			for (int i = 0; i < qSize; ++i) {
				p = q.poll();
				row = p.r;
				col = p.c;
				int tr, tc;
				for (int j = 0; j < 4; ++j) {
					tr = row + dr[j];
					tc = col + dc[j];
					if (tr < 0 || tc < 0 || tr >= r || tc >= c)
						continue;
					if(map[tr][tc]==0 && !visit[tr][tc]) {
						map[tr][tc] = day;
						visit[tr][tc] = true;
						q.add(new Pair(tr, tc));
					}
				}
			}
			
			day++;
		}
		for(int i=0; i<r; ++i) {
			for(int j=0; j<c; ++j) {
				if(map[i][j]==0) {
					System.out.println(-1);
					return;
				}
			}				
		}
		
		System.out.println(day-3);
	}

}
