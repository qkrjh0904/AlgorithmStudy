

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BabyGin2 {
	static boolean flag;
	static int[] num = new int[6];
	static boolean[] visit = new boolean[6];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		for (int i = 0; i < 6; ++i) {
			num[i] = Integer.parseInt(s[i]);
		}

		int[] cnt = new int[10];
		for (int i = 0; i < num.length; ++i) {
			cnt[num[i]]++;
		}

		int check = 0;
		check += checkRun(cnt);
		check += checkTriplet(cnt);
		if (check == 2)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");

	}

	private static int checkTriplet(int[] cnt) {
		int check = 0;
		for (int i = 0; i < cnt.length - 2; ++i) {
			if (cnt[i] >= 1) {
				if (cnt[i + 1] >= 1 && cnt[i + 2] >= 1) {
					check++;
					cnt[i] -= 1;
					cnt[i + 1] -= 1;
					cnt[i + 2] -= 1;
					i -= 1;
				} else {
					break;
				}
			}
		}
		return check;
	}

	private static int checkRun(int[] cnt) {
		int check = 0;
		for (int i = 0; i < cnt.length; ++i) {
			if (cnt[i] >= 3) {
				cnt[i] -= 3;
				check++;
				i--;
			}
		}
		return check;
	}

}
