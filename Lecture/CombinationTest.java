

import java.util.Arrays;

public class CombinationTest {

	public static void main(String[] args) {
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		int n = arr.length;
		int r = 2;
		
		char[] tr = new char[r];
		combi(1, 1, n, r, arr, tr);

	}

	private static void combi(int idx1, int idx2, int n, int r, char[] arr, char[] tr) {
		if(idx1-1==r) {
			System.out.println(Arrays.toString(tr));
			return;
		}
		if(idx2>arr.length)
			return;
		tr[idx1-1] = arr[idx2-1];
		combi(idx1+1, idx2+1, n, r, arr, tr);
		combi(idx1, idx2+1, n, r, arr, tr);
		
	}

}
