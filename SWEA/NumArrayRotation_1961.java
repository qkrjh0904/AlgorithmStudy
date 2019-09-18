import java.util.Scanner;

public class NumArrayRotation_1961 {
	private static int[][] rotation(int x, int n, int[][] board){
		for(int num=0; num<x; ++num){
			int[][] temp = new int[n][n];
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					temp[j][(n-1)-i] = board[i][j];
				}
			}
			board = temp;
		}
		return board;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int n = sc.nextInt();
			int[][] board = new int[n][n];
			String[] answer = new String[n];
			
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					board[i][j] = sc.nextInt();
				}
				answer[i] = "";
			}
			
			board = rotation(1, n, board);
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					answer[i] += Integer.toString(board[i][j]);
				}
				answer[i]+= " ";
			}
			board = rotation(1, n, board);
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					answer[i] += Integer.toString(board[i][j]);
				}
				answer[i]+= " ";
			}
			board = rotation(1, n, board);
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					answer[i] += Integer.toString(board[i][j]);
				}
			}
			
			

			System.out.println("#" + test_case);
			for(int i=0; i<n; ++i){
				System.out.println(answer[i]);
			}
		}

	}
	

}
