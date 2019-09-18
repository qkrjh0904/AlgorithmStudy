import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_JosephusProblem_1158 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("\\s");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		ArrayList<Integer> list = new ArrayList<>();

		boolean[] check = new boolean[n];
		int cnt = 0;
		int index = m - 1;
		while (true) {
			check[index] = true;
			cnt++;
			list.add(index + 1);
			if(cnt==n)
				break;

			// 이미 선택된 사람들을 제외한 m번째 사람의 index설정
			int i = 0;
			while (i != m) {
				index++;
				if (index == n)
					index = 0;
				if (!check[index]) {
					i++;
				}
			}
		}

		System.out.print("<" + list.get(0));
		for (int i = 1; i < n; ++i) {
			System.out.print(", " + list.get(i));
		}
		System.out.println(">");

	}

}
