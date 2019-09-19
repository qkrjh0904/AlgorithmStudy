import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SWEA_사람네트워크2_1263_박정호_O {
	static int N;
	static int[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		String[] s;
		for (int test_case = 1; test_case <= T; ++test_case) {
			s = br.readLine().split("\\s");
			N = Integer.parseInt(s[0]);
			map = new int[N][N];

			int idx = 1;
			int temp;
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					temp = Integer.parseInt(s[idx++]);
					if (temp == 1) {
						map[i][j] = 1;
					}
				}
			}

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < N; ++i) {
				min = Math.min(min, bfs(i));
			}

			System.out.println("#" + test_case + " " + min);
		}

	}

	private static int bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		boolean[] visit = new boolean[N];
		visit[start] = true;
		int level = 1;
		int cnt = 0;
		while (!q.isEmpty()) {
			int qSize = q.size();
			for (int k = 0; k < qSize; ++k) {
				int now = q.poll();
				for (int i = 0; i < N; ++i) {
					if (!visit[i] && map[now][i] == 1) {
						visit[i] = true;
						cnt += level;
						q.add(i);
					}
				}
			}
			level++;
		}
//		System.out.println(start+" : "+cnt);
		return cnt;
	}

}
