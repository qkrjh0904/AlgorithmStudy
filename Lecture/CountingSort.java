import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; ++i) {
			data[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(countingSort(data)));
	}
	
	public static int[] countingSort(int[] data) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<data.length; ++i) {
			if(max<data[i])
				max = data[i];
		}
		int[] cnt = new int[max+1];
		for(int i=0; i<data.length; ++i) {
			cnt[data[i]]++;
		}
//		System.out.println(Arrays.toString(cnt));
		for(int i=1; i<cnt.length; ++i) {
			cnt[i] = cnt[i]+cnt[i-1];
		}
//		System.out.println(Arrays.toString(cnt));
		int[] newData = new int[data.length];
		for(int i=data.length-1; i>=0; --i) {
			newData[cnt[data[i]]-1] = data[i];
			cnt[data[i]]--;
//			System.out.println(Arrays.toString(cnt));
//			System.out.println(Arrays.toString(newData));
//			System.out.println();
		}
//		System.out.println(Arrays.toString(newData));
		return newData;
	}

}
