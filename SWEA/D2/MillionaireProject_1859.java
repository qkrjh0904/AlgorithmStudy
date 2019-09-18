import java.util.Scanner;

public class MillionaireProject_1859 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			int n = sc.nextInt();
			int[] price = new int[n];
			for(int i=0; i<n; ++i)
				price[i] = sc.nextInt();
			
			long answer=0;
			int index=0;
			
			while(index<n){
				int max = 0;
				int maxDay = 0;
				for(int i=index; i<n; ++i){
					if(max<price[i]){
						max = price[i];
						maxDay = i;
					}
				}
				
				for(int i=index; i<maxDay; ++i)
					answer -= price[i];
				answer += max*(maxDay-index);
				index = maxDay+1;
			}
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
