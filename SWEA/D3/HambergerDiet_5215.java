import java.util.Scanner;

public class HambergerDiet_5215 {
	static int resourceNum = 0;
	static int limitCalorie = 0;
	static int answer = Integer.MIN_VALUE;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int c = 0; c < T; ++c) {
			resourceNum = sc.nextInt(); // 재료수
			limitCalorie = sc.nextInt(); // 제한 칼로리
			int[][] data = new int[21][2];
			for (int i = 0; i < resourceNum; ++i) {
				data[i][0] = sc.nextInt(); // 재료의 맛 점수 입력
				data[i][1] = sc.nextInt(); // 재료의 칼로리 입력
			}

			// 주어진 제한 칼로리 이하의 조합중에서 가장 맛에 대한 점수가 높은 햄버거의 점수를 출력
			go(data, 0, 0, 0);
			System.out.println("#" + (c + 1) + " " + answer);
			answer = Integer.MIN_VALUE;
		}
	}

	private static void go(int[][] data, int index, int score, int calorie) {
		if (index >= resourceNum) {
//			System.out.println(index + " " + score + " " + calorie + " " + answer);
			if (answer < score)
				answer = score;
			return;
		}

		if (calorie + data[index][1] <= limitCalorie) {
			go(data, index + 1, score + data[index][0], calorie + data[index][1]);
		}
		go(data, index + 1, score, calorie);

	}

}