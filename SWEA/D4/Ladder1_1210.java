import java.util.Scanner;

public class Ladder1_1210 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test_case=1; test_case<=10; test_case++) {
			int tc = sc.nextInt();
			int answer=0;
			int[][] map = new int[100][100];
			for(int i=0; i<100; ++i) {
				for(int j=0; j<100; ++j) {
					map[i][j] = sc.nextInt();
				}
			}
			
			int x = 0;
			for(int i=0; i<100; ++i) {
				if(map[99][i]==2) {
					x = i;
					break;
				}
			}
			int currentR = 99;
			int currentC = x;
			while(currentR!=0) {
				if(currentC>1 && map[currentR][currentC-1]==1) {
					while(currentC>=0 && map[currentR][currentC]!=0) {
						--currentC;
					}
					currentC++;
				}
				else if(currentC<99 && map[currentR][currentC+1]==1) {
					while(currentC<=99 && map[currentR][currentC]!=0) {
						++currentC;
					}
					currentC--;
				}
				
				currentR--;
			}
			answer = currentC;
			
			
			System.out.println("#"+test_case+" "+answer);
		}

	}

}
