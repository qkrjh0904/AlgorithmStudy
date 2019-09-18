import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		permutation(arr, 0);
		
	}

	private static void permutation(int[] arr, int depth) {
		if(depth == arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=depth; i<arr.length; ++i) {
			swap(arr, depth, i);
			permutation(arr, depth+1);
			swap(arr, depth, i);
		}
	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]  = temp;
	}

}
