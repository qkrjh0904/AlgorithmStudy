
public class PracticeTest1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr.length; ++j) {
				arr[i][j] = (int)(Math.random()*25)+1;
			}
		}
		
		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };
		
		

		int x, y;
		int[][] sums = new int[5][5];
		int sum=0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr.length; ++j) {
				sum = 0;
				for (int k = 0; k < 4; ++k) {
					x = j + dx[k];
					y = i + dy[k];
					if (x < 0 || y < 0 || x >= arr.length || y >= arr.length)
						continue;
					sum += Math.abs(arr[i][j]-arr[x][y]);
				}
				sums[i][j] = sum;

			}
		}
		
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr.length; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}System.out.println();
		
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr.length; ++j) {
				System.out.print(sums[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
