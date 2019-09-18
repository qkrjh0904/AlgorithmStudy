import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_창용마을무리의개수_7465_박정호_O {
	static int[] parent;
	static int N, M;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] s;
		for (int test_case = 1; test_case <= T; ++test_case) {
			s = br.readLine().split("\\s");
			N = Integer.parseInt(s[0]);
			M = Integer.parseInt(s[1]);

			parent = new int[N + 1];
			makeset();
			for (int i = 0; i < M; ++i) {
				s = br.readLine().split("\\s");
				int a = Integer.parseInt(s[0]);
				int b = Integer.parseInt(s[1]);
				union(a, b);
//				System.out.println(Arrays.toString(parent));
			}
			
			int answer = 0;
			for(int i=1; i<=N; ++i) {
				if(parent[i]==i)
					answer++;
			}
			System.out.println("#"+test_case+" "+answer);
			
		}

	}

	private static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		if(px!=py)
			parent[py] = px;
	}

	private static int find(int x) {
		if (parent[x] == x)
			return x;
		return parent[x] = find(parent[x]);
	}

	private static void makeset() {
		for (int i = 1; i <= N; ++i) {
			parent[i] = i;
		}
	}
	
	

}
