import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class JO_Janggi_1106 {
	// 말이 이동할 수 있는 위치
	static int[] dr = { -2, -1, 1, 2, 2, 1, -1, -2 };
	static int[] dc = { 1, 2, 2, 1, -1, -2, -2, -1 };

	static boolean[][] visit;
	static int n, m;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		n = Integer.parseInt(s[0]);
		m = Integer.parseInt(s[1]);
		visit = new boolean[n][m];

		// 말(r1, c1), 졸(r2, c2) 위치 받기
		s = br.readLine().split("\\s");
		int r1 = Integer.parseInt(s[0])-1;
		int c1 = Integer.parseInt(s[1])-1;
		int r2 = Integer.parseInt(s[2])-1;
		int c2 = Integer.parseInt(s[3])-1;

		find(r1, c1, r2, c2);

	}

	private static void find(int r1, int c1, int r2, int c2) {
		Queue<Pair> q = new LinkedList<Pair>();
		q.add(new Pair(r1, c1));

		int level = 0;
		Pair p;
		out:while (!q.isEmpty()) {
			int qSize = q.size();
			int r, c;
			for (int i = 0; i < qSize; ++i) {
				p = q.poll();
				r = p.r;
				c = p.c;
				if (r == r2 && c == c2) {
					break out;
				}
				visit[r][c] = true;
				int tr, tc;
				for (int j = 0; j < 8; ++j) {
					tr = r + dr[j];
					tc = c + dc[j];
					if (tr < 0 || tc < 0 || tr >= n || tc >= m)
						continue;
					if (!visit[tr][tc]) {
						q.add(new Pair(tr, tc));
						visit[tr][tc] = true;
					}

				}
			}
			level++;
		}
		System.out.println(level);
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
