/*
 * 상하좌우 값의 합 중에서 가장 큰 값과 그 위치를 출력하라.
 */
public class ArrayTest3 {

	public static void main(String[] args) {
		int[][] arr = { 
				{ 3, 1, 5, 8 }, 
				{ 3, 4, 7, 9 }, 
				{ 2, 8, 6, 9 }, 
				{ 3, 5, 7, 6 } 
		};		
		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };

		int max = Integer.MIN_VALUE;
		int x, y;
		int tx = -1, ty = -1;
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j) {
				sum = 0;
				for (int k = 0; k < 4; ++k) {
					x = j + dx[k];
					y = i + dy[k];
					if (x < 0 || y < 0 || x >= arr.length || y >= arr.length)
						continue;
					sum += arr[x][y];
				}
				if (max < sum) {
					max = sum;
					tx = j;
					ty = i;
				}

			}
		}
		System.out.println("max : " + max + " tx : " + tx + " ty : " + ty);

	}

}
