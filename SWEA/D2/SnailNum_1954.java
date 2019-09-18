import java.util.Scanner;

public class SnailNum_1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int n = sc.nextInt();
			int[][] board = new int[n][n];
			int dir = 0;
			int cnt=1;
			int r=0;
			int c=0;
			for (int k = 0; k < n * 2 - 1; ++k) {
				if (dir == 0) {
					while(c<n && board[r][c]==0){
						board[r][c] = cnt;
						c++;
						cnt++;
					}
					c--;
					r++;
				} else if (dir == 1) {
					while(r<n && board[r][c]==0){
						board[r][c] = cnt;
						r++;
						cnt++;
					}
					r--;
					c--;
				} else if (dir == 2) {
					while(c>=0 && board[r][c]==0){
						board[r][c] = cnt;
						c--;
						cnt++;
					}
					c++;
					r--;
				} else {
					while(r>=0 && board[r][c]==0){
						board[r][c] = cnt;
						r--;
						cnt++;
					}
					r++;
					c++;
				}
				dir++;
				dir %= 4;
				
			}

			System.out.println("#" + test_case);
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
