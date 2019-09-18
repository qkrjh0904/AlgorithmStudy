import java.util.Scanner;

public class Flatten_1208 {
	static int answer=0;
	static int max=0;
	static int min=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case=1; test_case<=10; ++test_case) {
			int limit = sc.nextInt();
			int[] data = new int[101];
			for(int i=1; i<=100; ++i) {
				data[i] = sc.nextInt();
			}
			
			for(int loop=0; loop<limit; ++loop) {
				max = Integer.MIN_VALUE;
				min = Integer.MAX_VALUE;
				int max_loc=0;
				int min_loc=0;
				for(int i=1; i<=100; ++i) {
					if(max<data[i]) {
						max = data[i];
						max_loc = i;
					}
					if(min>data[i]) {
						min = data[i];
						min_loc = i;
					}
				}
				data[max_loc]--;
				data[min_loc]++;
			}
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			for(int i=1; i<=100; ++i) {
				
				if(max<data[i]) {
					max = data[i];
				}
				if(min>data[i]) {
					min = data[i];
				}
			}
			answer = max-min;
			System.out.println("#"+test_case+" "+answer);
			
		}

	}

}
