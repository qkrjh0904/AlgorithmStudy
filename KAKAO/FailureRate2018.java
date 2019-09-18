package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Fail {
	double failRate;
	int stage;

	public Fail(double failRate, int stage) {
		this.failRate = failRate;
		this.stage = stage;
	}
}

public class FailureRate2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {1, 1, 2, 2, 2, 3, 3, 3};
//		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//		int[] stages = { 4, 4, 4, 4, 4 };
		solution(N, stages);
	}

	// 실패율 = 스테이지 도달했지만 클리어하지 못함/스테이지에 도달한 플에이어수
	// N : 전체 스테이지 개수
	// stages : 사용자가 현재 멈춰있는 스테이지의 번호
	// answer : 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호를 담아 return
	private static void solution(int N, int[] stages) {
		int[] answer = new int[N];

		// 각 스테이지별 멈춰있는 사용자 수 저장
		int stageLeng = stages.length;
		int[] cnt = new int[N + 2];
		for (int i = 0; i < stageLeng; ++i) {
			cnt[stages[i]]++;
		}

		// 각 스테이지를 통과했거나, 아직수행중인 사람의 수
		int[] clear = new int[N + 1];
		int total = stageLeng;
		for (int i = 1; i <= N; ++i) {
			clear[i] = total;
			total -= cnt[i];
		}

		// 실패율 구하기
		double[] fail = new double[N + 1];
		for (int i = 1; i < N + 1; ++i) {
			if(clear[i]==0)
				fail[i] = 0;
			else
				fail[i] = (double) cnt[i] / clear[i];
		}

		ArrayList<Fail> list = new ArrayList<>();
		for (int i = 1; i <= N; ++i) {
			list.add(new Fail(fail[i], i));
		}
		Collections.sort(list, new Comparator<Fail>() {

			@Override
			public int compare(Fail o1, Fail o2) {
				int temp = 1;
				if (o2.failRate < o1.failRate)
					temp = -1;
				else if (o2.failRate == o1.failRate) {
					temp = o1.stage - o2.stage;
				}
				return temp;
			}
		});
		System.out.println(Arrays.toString(cnt));
		System.out.println(Arrays.toString(clear));
		System.out.println(Arrays.toString(fail));
		

		for (int i = 0; i < N; ++i) {
			answer[i] = list.get(i).stage;
		}
		System.out.println(Arrays.toString(answer));
	}

}
