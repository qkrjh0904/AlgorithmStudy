import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] data = new int[n];
		for(int i=0; i<n; ++i) {
			data[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(data));
		bubbleSort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public static void bubbleSort(int[] data) {
		for(int j=0; j<data.length-1; ++j) {
			for(int i=0; i<data.length-1-j; ++i) {
				if(data[i]>data[i+1]) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
				}
			}
		}
	}

}
