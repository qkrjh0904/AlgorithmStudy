import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SWEA_최소스패닝트리_3124_박정호_O {
	static int V, E;
	static ArrayList<Pair> list;
	static int[] parent;
	static long answer;

	static class Pair {
		int x;
		int y;
		int w;

		public Pair(int x, int y, int w) {
			super();
			this.x = x;
			this.y = y;
			this.w = w;
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + ", w=" + w + "]";
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] s;
		for (int test_case = 1; test_case <= T; ++test_case) {
			s = br.readLine().split("\\s");
			V = Integer.parseInt(s[0]);
			E = Integer.parseInt(s[1]);
			list = new ArrayList<>();
			for (int i = 0; i < E; ++i) {
				s = br.readLine().split("\\s");
				int x = Integer.parseInt(s[0]);
				int y = Integer.parseInt(s[1]);
				int w = Integer.parseInt(s[2]);

				list.add(new Pair(x, y, w));
			}

			Collections.sort(list, new Comparator<Pair>() {
				@Override
				public int compare(Pair o1, Pair o2) {
					return o1.w - o2.w;
				}
			});

			parent = new int[V + 1];
			makeset();

			answer = 0;
			int size = list.size();
			int cnt=0;
			for (int i = 0; i < size; ++i) {
				if(cnt==V-1)
					break;
				int x = list.get(i).x;
				int y = list.get(i).y;
				int w = list.get(i).w;
				int px = find(x);
				int py = find(y);
				if (px != py) {
					answer += w;
					parent[py] = px;
					cnt++;
				}
			}

			System.out.println("#" + test_case + " " + answer);
		}

	}

	private static int find(int x) {
		if (parent[x] == x)
			return x;
		return parent[x] = find(parent[x]);
	}

	private static void makeset() {
		for (int i = 1; i <= V; ++i)
			parent[i] = i;
	}

}
