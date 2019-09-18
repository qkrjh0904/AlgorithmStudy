import java.util.ArrayList;
import java.util.Scanner;

public class TSP2_10971 {
	static int answer = Integer.MAX_VALUE;
	static boolean[] visited;
	static int[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		int n = sc.nextInt();
		visited = new boolean[n];
		map = new int[n][n];

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				map[i][j] = sc.nextInt();
			}
		}

		permutation(n, num);
		System.out.println(answer);
	}

	private static void permutation(int n, ArrayList<Integer> num) {
		if (n == num.size()) {
			boolean flag = true;
			for (int i = 0; i < n - 1; ++i) {
				if (map[num.get(i)][num.get(i + 1)] == 0) { // 갈 수 없는 경우 return
					flag = false;
					break;
				}
			}
			if (map[num.get(n - 1)][num.get(0)] == 0)
				flag = false;
			if (!flag)
				return;

			int temp = 0;
			for (int i = 0; i < n - 1; ++i) {
				temp += map[num.get(i)][num.get(i + 1)];
			}
			temp += map[num.get(n - 1)][num.get(0)];

			if (answer > temp)
				answer = temp;
			return;
		}

		for (int i = 0; i < n; ++i) {
			if (visited[i])
				continue;
			visited[i] = true;
			num.add(i);
			permutation(n, num);
			visited[i] = false;
			num.remove(num.size() - 1);
		}

	}

}
