import java.util.Arrays;
import java.util.Scanner;

public class EasyChanges_1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int n = sc.nextInt();
			int[] changes = new int[8];
			while (n >= 10) {
				if (n >= 50000) {
					++changes[0];
					n -= 50000;
				} else if (n >= 10000) {
					++changes[1];
					n -= 10000;
				} else if (n >= 5000) {
					++changes[2];
					n -= 5000;
				} else if (n >= 1000) {
					++changes[3];
					n -= 1000;
				} else if (n >= 500) {
					++changes[4];
					n -= 500;
				} else if (n >= 100) {
					++changes[5];
					n -= 100;
				} else if (n >= 50) {
					++changes[6];
					n -= 50;
				} else {
					++changes[7];
					n -= 10;
				}
			}

			System.out.println("#" + test_case);
			for(int i=0; i<changes.length; ++i)
				System.out.print(changes[i]+" ");
			System.out.println();
		}

	}

}
