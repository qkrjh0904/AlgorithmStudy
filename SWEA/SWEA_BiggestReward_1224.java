import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Cont {
	int a;
	int b;

	public Cont(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

public class SWEA_BiggestReward_1224 {
	static int size;
	static int answer;
	static int maxVal;
	static ArrayList<Cont> per;
	static ArrayList<Integer> n;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; ++tc) {
			answer = 0;
			String[] s = br.readLine().split("\\s");
			String[] temp = s[0].split("");
			size = temp.length;
			int limit = Integer.parseInt(s[1]);
			ArrayList<Integer> tempN = new ArrayList<>();
			per = new ArrayList<>();
			n = new ArrayList<>();
			for (int i = 0; i < temp.length; ++i) {
				n.add(Integer.parseInt(temp[i]));
				tempN.add(Integer.parseInt(temp[i]));
			}
			
			Collections.sort(tempN, Collections.reverseOrder());
			maxVal = 0;
			for (int i = 0; i < tempN.size(); ++i) {
				maxVal += tempN.get(i);
				maxVal *= 10;
			}
			maxVal /= 10;
			if(tempN.size()<limit) {
				if((limit-tempN.size()/2)%2==0)
					answer = maxVal;
				else{
					while(limit>tempN.size()) {
						limit -= 2;
					}
					ArrayList<Integer> list = new ArrayList<>();
					go(0, list);
					get(0, 0, limit);
				}
			}else {
				// 바꿀 수 있는 모든 경우의 수 구하기
				ArrayList<Integer> list = new ArrayList<>();
				go(0, list);
				get(0, 0, limit);
			}

			System.out.println("#" + tc + " " + answer);
		}
	}

	private static void get(int index, int cnt, int limit) {
		if (cnt == limit) {
			// ArrayList안의 수를 숫자로 변환
			int max = 0;
			for (int i = 0; i < n.size(); ++i) {
				max += n.get(i);
				max *= 10;
			}
			max /= 10;
			answer = Math.max(answer, max);
			return;
		}
		

		for (int i = 0; i < per.size(); ++i) {
			Collections.swap(n, per.get(i).a, per.get(i).b);
			get(i, cnt + 1, limit);
			Collections.swap(n, per.get(i).a, per.get(i).b);
		}
	}

	private static void go(int index, ArrayList<Integer> list) {
		if (list.size() == 2) {
			per.add(new Cont(list.get(0), list.get(1)));
			return;
		}

		for (int i = index; i < size; ++i) {
			list.add(i);
			go(i + 1, list);
			list.remove(list.size() - 1);
		}
	}

}
