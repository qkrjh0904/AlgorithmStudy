package bruteForce;

import java.util.Scanner;

public class CalculatingDate_1476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();

		boolean flag = false;

		int temp_e = 1;
		int temp_s = 1;
		int temp_m = 1;
		int answer = 0;
		while (!flag) {
			if (e == temp_e && s == temp_s && m == temp_m) {
				flag = true;
			}

			temp_e++;
			temp_s++;
			temp_m++;
			if (temp_e > 15)
				temp_e = 1;
			if (temp_s > 28)
				temp_s = 1;
			if (temp_m > 19)
				temp_m = 1;
			answer++;

		}
		System.out.println(answer);

	}

}
