import java.util.ArrayList;
import java.util.Scanner;

public class PutOperator_14888 {

	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static int answer;

	static int[] nums; // 숫자 저장
	static int[] op; // 연산자 저장
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		nums = new int[n];
		op = new int[n - 1];
		visited = new boolean[n - 1];

		for (int i = 0; i < n; ++i) {
			nums[i] = sc.nextInt();
		}

		int index = 0;
		for (int i = 0; i < 4; ++i) {
			int temp = sc.nextInt();
			for (int j = 0; j < temp; ++j) {
				op[index++] = i;
			}
		}

		ArrayList<Integer> list = new ArrayList<>();
		permutation(n - 1, list);
		System.out.println(max);
		System.out.println(min);
	}

	private static void permutation(int maxSize, ArrayList<Integer> list) {
		if (maxSize == list.size()) {
			calc(maxSize, list);
			return;
		}

		for (int i = 0; i < maxSize; ++i) {
			if (visited[i])
				continue;
			visited[i] = true;
			list.add(op[i]);
			permutation(maxSize, list);
			visited[i] = false;
			list.remove(list.size() - 1);
		}

	}

	private static void calc(int maxSize, ArrayList<Integer> list) {
		int temp = nums[0];
		for (int i = 0; i < maxSize; ++i) {
			if (list.get(i) == 0) {
				temp += nums[i+1];
			} else if (list.get(i) == 1) {
				temp -= nums[i+1];
			} else if (list.get(i) == 2) {
				temp *= nums[i+1];
			} else {
				temp /= nums[i+1];
			}
		}
		if(min>temp)
			min = temp;
		if(max<temp)
			max = temp;
		
	}
}
