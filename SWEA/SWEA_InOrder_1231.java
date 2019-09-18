import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_InOrder_1231 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc=1; tc<=10; ++tc) {
			int n = Integer.parseInt(br.readLine());
			String[] node = new String[n + 1];
			for (int i = 1; i <= n; ++i) {
				String[] s = br.readLine().split("\\s");
				node[i] = s[1];
			}

			System.out.print("#"+tc+" ");
			inOrder(node, 1);
			System.out.println();
		}
		
	}

	private static void inOrder(String[] node, int n) {
		if (n >= node.length)
			return;
		if (node[n] == null)
			return;
		inOrder(node, n * 2);
		System.out.print(node[n]);
		inOrder(node, n * 2 + 1);

	}

}
