import java.util.Scanner;

public class NewInsomiaCure_1288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			int answer=1;
			boolean[] check = new boolean[10];
			int n = sc.nextInt();
			boolean flag = false;
			int cnt=1;
			while(!flag){
				int temp = n*cnt;
				answer = temp;
				while(temp!=0){
					check[temp%10] = true;
					temp /= 10;
				}
				
				for(int i=0; i<10; ++i){
					if(!check[i]){
						flag = false;
						break;
					}
					else
						flag = true;
				}
				cnt++;
			}
			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
