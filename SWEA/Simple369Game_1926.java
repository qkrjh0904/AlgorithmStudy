import java.util.Scanner;

public class Simple369Game_1926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("1");
		for(int i=2; i<=n; ++i){
			int temp = i;
			int cnt = 0;
			// 3, 6, 9가 몇개가 포함되어있는지 체크
			while(temp!=0){
				if(temp%10==3 || temp%10==6 || temp%10==9)
					cnt++;
				temp /= 10;
			}
			
			// 3, 6, 9중 하나 이상이 포함되면 -출력 아니면 숫자 출력
			System.out.print(" ");
			if(cnt>0){
				for(int j=0; j<cnt; ++j)
					System.out.print("-");
			}
			else
				System.out.print(i);
			
			
			
		}

	}

}
