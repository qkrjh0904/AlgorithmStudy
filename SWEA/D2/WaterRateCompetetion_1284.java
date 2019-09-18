import java.util.Scanner;

public class WaterRateCompetetion_1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			int answer=0;
			int p = sc.nextInt();	// A사의 리터당 요금
			int q = sc.nextInt();	// B사의 기본요금
			int r = sc.nextInt();	// B사의 기본 사용량
			int s = sc.nextInt();	// B사의 리터당 요금
			int w = sc.nextInt();	// 한달 수도 사용량
			
			int a = p*w;
			int b = 0;
			if(w<=r)
				b = q;
			else
				b = q + s*(w-r);
			answer = Math.min(a, b);
			
			
			System.out.println("#" + test_case + " " + answer);
		}


	}

}
