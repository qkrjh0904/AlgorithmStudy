import java.util.Arrays;
import java.util.Scanner;

public class TimeSense_7732 {
	static String answer = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			String now_string = sc.next();
			String appo_string = sc.next();
			char[] now = now_string.toCharArray();
			char[] appo = appo_string.toCharArray();

			int now_h = Integer.parseInt(String.valueOf(now[0]) + String.valueOf(now[1]));
			int now_m = Integer.parseInt(String.valueOf(now[3]) + String.valueOf(now[4]));
			int now_s = Integer.parseInt(String.valueOf(now[6]) + String.valueOf(now[7]));
			int appo_h = Integer.parseInt(String.valueOf(appo[0]) + String.valueOf(appo[1]));
			int appo_m = Integer.parseInt(String.valueOf(appo[3]) + String.valueOf(appo[4]));
			int appo_s = Integer.parseInt(String.valueOf(appo[6]) + String.valueOf(appo[7]));
			if (appo_h < now_h)
				appo_h += 24;
			
			int ans_h = appo_h - now_h;
			int ans_m = 0;
			int ans_s = 0;
			if (appo_m >= now_m)
				ans_m = appo_m - now_m;
			else {
				ans_m = 60 + appo_m - now_m;
				ans_h--;
				if(ans_h<0)
					ans_h += 24;
			}
			if (appo_s >= now_s)
				ans_s = appo_s - now_s;
			else {
				ans_s = 60 + appo_s - now_s;
				if (ans_m > 0) {
					ans_m--;
				} else {
					ans_h--;
					ans_m = 59;
					if(ans_h<0)
						ans_h += 24;
				}

			}
			String hh = "";
			String mm = "";
			String ss = "";
			if (ans_h > 9)
				hh = String.valueOf(ans_h);
			else
				hh = "0" + String.valueOf(ans_h);
			if (ans_m > 9)
				mm = String.valueOf(ans_m);
			else
				mm = "0" + String.valueOf(ans_m);
			if (ans_s > 9)
				ss = String.valueOf(ans_s);
			else
				ss = "0" + String.valueOf(ans_s);

			System.out.println("#" + test_case + " " + hh + ":" + mm + ":" + ss);

		}

	}

}
