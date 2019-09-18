package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BipartiteGraph_1707 {
	static int nodeNum;
	static int edgeNum;
	static ArrayList<Integer>[] nodes;
	static int[] group;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 0; test_case < T; ++test_case) {
			String[] s = br.readLine().split("\\s");
			nodeNum = Integer.parseInt(s[0]);
			edgeNum = Integer.parseInt(s[1]);
			nodes = new ArrayList[nodeNum + 1];
			visited = new boolean[nodeNum + 1];
			group = new int[nodeNum + 1];
			for (int i = 0; i <= nodeNum; ++i)
				nodes[i] = new ArrayList<>();
			int n1, n2;
			for (int i = 0; i < edgeNum; ++i) {
				s = br.readLine().split("\\s");
				n1 = Integer.parseInt(s[0]);
				n2 = Integer.parseInt(s[1]);
				nodes[n1].add(n2);
				nodes[n2].add(n1);
			}
			// 시작 노드, 그룹
			for(int i=1; i<=nodeNum; ++i) {
				dfs(i, 1);
			}
			

			boolean flag = true;
			out: for (int i = 1; i <= nodeNum; ++i) {
				for (int j = 0; j < nodes[i].size(); ++j) {
					if (group[i] == group[nodes[i].get(j)]) {
						flag = false;
						break out;
					}
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static void dfs(int n, int g) {
		if (visited[n]) {
			return;
		}
		visited[n] = true;
		group[n] = g;
//		System.out.println(Arrays.toString(group));
		for (int i = 0; i < nodes[n].size(); ++i) {
			dfs(nodes[n].get(i), 3 - g);
		}
	}
}
