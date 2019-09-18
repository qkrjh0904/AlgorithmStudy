import java.util.Scanner;

/*
 * arr배열을 90도 회전시킨 결과
 */
public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		int[][] brr = new int[arr.length][arr.length];

		int cnt = 0;
		for(int i=0; i<arr.length; ++i) {
			for(int j=0; j<arr.length; ++j) {
				arr[i][j] = cnt++;
			}
		}
		
		for (int i = 0; i < brr.length; ++i) {
			for (int j = 0; j < brr.length; ++j) {
				brr[j][brr.length-i-1] = arr[i][j];
			}
		}
		
		

		for (int i = 0; i < brr.length; ++i) {
			for (int j = 0; j < brr.length; ++j) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < brr.length; ++i) {
			for (int j = 0; j < brr.length; ++j) {
				System.out.print(brr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
