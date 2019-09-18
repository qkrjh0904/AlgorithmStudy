import java.util.Arrays;
import java.util.Scanner;

public class SudokuVerification_1974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int answer = 0;
			int[][] sudoku = new int[9][9];
			for (int i = 0; i < 9; ++i) {
				for (int j = 0; j < 9; ++j) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			if (check(sudoku))
				answer = 1;

			System.out.println("#" + test_case + " " + answer);
		}
	}

	private static boolean check(int[][] sudoku) {
		boolean[] c1 = new boolean[9]; // 행 체크
		boolean[] c2 = new boolean[9]; // 열 체크

		for (int i = 0; i < 9; ++i) {
			Arrays.fill(c1, false);
			Arrays.fill(c2, false);
			for (int j = 0; j < 9; ++j) {
				if (c1[sudoku[i][j] - 1] || c2[sudoku[j][i] - 1])
					return false;
				c1[sudoku[i][j] - 1] = true;
				c2[sudoku[j][i] - 1] = true;
			}
		}

		
		for(int k=0; k<9; k+=3){
			for(int l=0; l<9; l+=3){
				Arrays.fill(c1, false);
				for (int i = 0; i < 3; ++i) {
					for (int j = 0; j < 3; ++j) {
						if (c1[sudoku[i+k][j+l] - 1])
							return false;
						c1[sudoku[i+k][j+l] - 1] = true;
					}
				}
			}
		}
		return true;
	}

}
