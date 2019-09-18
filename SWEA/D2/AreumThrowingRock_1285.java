import java.util.Scanner;

public class AreumThrowingRock_1285 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			int answer=0;
			int n = sc.nextInt();
			int[] dist = new int[n];
			
			for(int i=0; i<n; ++i){
				int temp = sc.nextInt();
				temp = Math.abs(temp);
				dist[i] = temp;
			}
			
			int min = Integer.MAX_VALUE;
			for(int i=0; i<n; ++i){
				if(min>dist[i])
					min = dist[i];
			}
			
			for(int i=0; i<n; ++i){
				if(min==dist[i])
					answer++;
			}
			
			System.out.println("#" + test_case + " " + min + " " + answer);
		}

	}

}
