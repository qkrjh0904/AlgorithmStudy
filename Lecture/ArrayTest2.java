/*
 * 기본 2차원 배열 출력
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		int[][]	arr = new int[5][5];
		int n = 5;
		//행 우선 1~25까지 입력
		int cnt=1;
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				arr[i][j] = cnt++;
			}
		}
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
	}
}
