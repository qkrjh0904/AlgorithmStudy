/*
 * 서로 다른 크기의 2차원 배열
 */
public class ArrayTest1 {

	public static void main(String[] args) {
		int[][] arr = new int[4][];
		arr[0] = new int[4];
		arr[1] = new int[3];
		arr[2] = new int[2];
		arr[3] = new int[1];
		
		
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr[i].length; ++j)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}

}
