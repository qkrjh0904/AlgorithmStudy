import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_Bomulsum_2589 {
	static int r, c;
	static int[][] map;
	static int answer;
	static int[] dr = { 0, 0, 1, -1 };
	static int[] dc = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		r = Integer.parseInt(s[0]);
		c = Integer.parseInt(s[1]);
		map = new int[r][c];

		// 육지는 1로, 바다는 0으로 치환
		char[] ch;
		for (int i = 0; i < r; ++i) {
			ch = br.readLine().toCharArray();
			for (int j = 0; j < c; ++j) {
				if (ch[j] == 'W')
					map[i][j] = 0;
				else
					map[i][j] = 1;
			}
		}
		// 모든 육지에서 가장 먼 거리 찾는 bfs 탐색
		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c; ++j) {
				if (map[i][j] == 1) {
					bfs(i, j);
				}
			}
		}
		
		System.out.println(answer);

	}

	private static void bfs(int r1, int c1) {
		Queue<Pair1> q = new LinkedList<Pair1>();
		boolean[][] visit = new boolean[r][c];
		q.add(new Pair1(r1, c1));

		int level = 0;
		Pair1 p;
		int tr, tc;
		while (!q.isEmpty()) {
			int qSize = q.size();
			for (int i = 0; i < qSize; ++i) {
				p = q.poll();
				tr = p.r;
				tc = p.c;
				visit[tr][tc] = true;
				int ttr, ttc;
				for (int j = 0; j < 4; ++j) {
					ttr = tr + dr[j];
					ttc = tc + dc[j];
					if(ttr<0 || ttc<0 || ttr>=r || ttc>=c)
						continue;
					if(map[ttr][ttc]==1 && !visit[ttr][ttc]) {
						q.add(new Pair1(ttr, ttc));
					}
					visit[ttr][ttc] = true;
					
				}
			}
			level++;

		}
		if(answer<level-1)
			answer = level-1;
	}
}

class Pair1 {
	int r;
	int c;

	public Pair1(int r, int c) {
		this.r = r;
		this.c = c;
	}

}