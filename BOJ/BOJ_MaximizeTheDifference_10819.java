import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaximizeTheDifference_10819 {
	static boolean[] visited;
	static int[] num;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> picked = new ArrayList<>();
		int n = sc.nextInt();
		num = new int[n];
		visited = new boolean[n];
		for (int i = 0; i < n; ++i) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		// n: 전체 원소의 수
		// picked: 지금까지 고른 원소들의 번호
		permutation(n, picked);
		System.out.println(max);
	}

	private static void permutation(int n, ArrayList<Integer> picked) {
		// base case
		// List가 전체 원소 개수만큼 차면 출력후 리턴
		if (picked.size() == n) {
			int result = calc(picked);
			if (max < result)
				max = result;
			return;
		}

		for (int i = 0; i < n; ++i) {
			if (visited[i]) // 방문 했었다면 다음으로
				continue;
			visited[i] = true; 	// 방문 안했다면 방문 체크
			picked.add(num[i]); // list에 추가
			permutation(n, picked);
			picked.remove(picked.size() - 1);
			visited[i] = false;
		}

	}

	private static int calc(ArrayList<Integer> picked) {
		int result = 0;
		for (int i = 0; i < picked.size() - 1; ++i) {
			result += Math.abs(picked.get(i) - picked.get(i + 1));
		}
		return result;
	}

}
