import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CropHarvest_2805 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int answer;
	static int[][] map;
	static boolean[][] visited;
	static int n;
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; ++test_case) {
			answer = 0;
			n = Integer.parseInt(br.readLine());
			map = new int[n][n];
			visited = new boolean[n][n];
			for (int i = 0; i < n; ++i) {
				String line = br.readLine();
				for (int j = 0; j < n; ++j) {
					map[i][j] = line.charAt(j) - '0';
				}
			}

			go(n / 2, n / 2);
			System.out.println("#" + test_case + " " + answer);
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					visited[i][j] = false;
				}
			}
		}

	}

	private static void go(int r, int c) {
		Queue<Integer> row = new LinkedList<>();
		Queue<Integer> col = new LinkedList<>();
		row.add(r);
		col.add(c);
		visited[r][c] = true;
		int level = 0;
		while (!row.isEmpty()) {
			int qSize = row.size();
			if(level==(n+1)/2)
				break;
			for(int k =0; k < qSize; k++) {
				int dr = row.poll();
				int dc = col.poll();
				visited[dr][dc] = true;
				answer += map[dr][dc];
				if(dr+1>=n || dr-1<0 || dc+1>=n || dc-1<0)
					continue;
				for (int i = 0; i < 4; ++i) {
					if(!visited[dr+dy[i]][dc+dx[i]]) {
						row.add(dr+dy[i]);
						col.add(dc+dx[i]);
						visited[dr+dy[i]][dc+dx[i]] = true;
					}
				}
			}
			level++;
			
			
			
		}
	}

}
