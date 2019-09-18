import java.util.Scanner;

public class KillPari_2001 {
	static int answer=Integer.MIN_VALUE;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] map = new int[n][n];
			
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					if(i+m>n || j+m>n)
						continue;
					int temp=0;
					for(int mi=i; mi<i+m; ++mi) {
						for(int mj=j; mj<j+m; ++mj) {
							temp += map[mi][mj];
						}
					}
					if(answer<temp)
						answer = temp;
				}
			}
			System.out.println("#"+test_case+" "+answer);
			answer = Integer.MIN_VALUE;
		}

	}

}
