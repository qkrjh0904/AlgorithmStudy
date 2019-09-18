package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DFSAndBFS_1260 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean[] visited;
	static ArrayList<Integer>[] a;

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		a = new ArrayList[n + 1];
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; ++i) {
			a[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; ++i) {
			String[] num = br.readLine().split("\\s");
			int node1 = Integer.parseInt(num[0]);
			int node2 = Integer.parseInt(num[1]);
			a[node1].add(node2);
			a[node2].add(node1);
		}
		for (ArrayList<Integer> list : a) {
			if (list == null)
				continue;
			list.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return o1 - o2;
				}
			});
		}
		dfs(v);
		Arrays.fill(visited, false);
		System.out.println();
		bfs(v);
	}

	private static void dfs(int v) {
		if(visited[v]) {
			return;
		}
		System.out.print(v + " ");
		visited[v] = true;
		for (int i = 0; i < a[v].size(); ++i) {
			dfs(a[v].get(i));
		}
		
	}

	private static void bfs(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		while (!q.isEmpty()) {
			int idx = q.poll();
			visited[idx] = true;
			System.out.print(idx + " ");
			for (int i = 0; i < a[idx].size(); ++i) {
				if(!visited[a[idx].get(i)]) {
					q.add(a[idx].get(i));
					visited[a[idx].get(i)] = true;
				}
			}
		}
	}

}
