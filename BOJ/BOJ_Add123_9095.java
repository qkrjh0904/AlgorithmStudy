import java.util.Scanner;

public class Add123_9095 {
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; ++i){
			answer = 0;
			int goal = sc.nextInt();
			// goal : 최종 목적지
			// sum : 현재까지 합
			go(goal, 0);
			System.out.println(answer);
		}

	}
	private static void go(int goal, int sum) {
		if(sum>goal){
			return;
		}
		if(sum==goal){
			answer++;
			return;
		}
		for(int i=1; i<=3; ++i){
			go(goal, sum+i);
		}
	}

}
