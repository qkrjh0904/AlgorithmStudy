package com.ssafy.algo;

import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			// 소금쟁이 방향 : 상하좌우 순으로 1,2,3,4
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			int[] r = new int[n];
			int[] c = new int[n];
			int saltNum = sc.nextInt();
			for (int i = 0; i < saltNum; ++i) {
				r[i] = sc.nextInt();
				c[i] = sc.nextInt();
				int dir = sc.nextInt();
				map[r[i]][c[i]] = dir;
			}
			
			
			
			
			
			for(int i=0; i<saltNum; ++i) {
				boolean check = false;
				// 방향 1인 소금쟁이
				if(map[r[i]][c[i]]==1) {
					if(r[i]-6<0) {
						map[r[i]][c[i]] = 0;	//연못을 벗어난 경우 죽음
						continue;
					}
					if(map[r[i]-3][c[i]] != 0)	check = true;
					else if(map[r[i]-5][c[i]] != 0)	check = true;
					else if(map[r[i]-6][c[i]] != 0)	check = true;
					
					if(!check)
						map[r[i]-6][c[i]] = map[r[i]][c[i]];	//다른 소금쟁이를 안만나면 이동
					map[r[i]][c[i]] = 0;	//원래위치 제거 혹은 다른 소금쟁이를 만난경우 죽음
				}
				// 방향 2인 소금쟁이
				else if(map[r[i]][c[i]]==2) {
					if(r[i]+6>=n) {
						map[r[i]][c[i]] = 0;
						continue;
					}
					if(map[r[i]+3][c[i]] != 0)	check = true;
					else if(map[r[i]+5][c[i]] != 0)	check = true;
					else if(map[r[i]+6][c[i]] != 0)	check = true;
					
					if(!check)
						map[r[i]+6][c[i]] = map[r[i]][c[i]];	//다른 소금쟁이를 안만나면 이동
					map[r[i]][c[i]] = 0;	//원래위치 제거 혹은 다른 소금쟁이를 만난경우 죽음
				}
				// 방향 3인 소금쟁이
				else if(map[r[i]][c[i]]==3) {
					if(c[i]-6<0) {
						map[r[i]][c[i]] = 0;
						continue;
					}
					if(map[r[i]][c[i]-3] != 0)	check = true;
					else if(map[r[i]][c[i]-5] != 0)	check = true;
					else if(map[r[i]][c[i]-6] != 0)	check = true;
					
					if(!check)
						map[r[i]][c[i]-6] = map[r[i]][c[i]];	//다른 소금쟁이를 안만나면 이동
					map[r[i]][c[i]] = 0;	//원래위치 제거 혹은 다른 소금쟁이를 만난경우 죽음
				}
				// 방향 4인 소금쟁이
				else if(map[r[i]][c[i]]==4) {
					if(c[i]+6>=n) {
						map[r[i]][c[i]] = 0;
						continue;
					}
					if(map[r[i]][c[i]+3] != 0)	check = true;
					else if(map[r[i]][c[i]+5] != 0)	check = true;
					else if(map[r[i]][c[i]+6] != 0)	check = true;
					
					if(!check)
						map[r[i]][c[i]+6] = map[r[i]][c[i]];	//다른 소금쟁이를 안만나면 이동
					map[r[i]][c[i]] = 0;	//원래위치 제거 혹은 다른 소금쟁이를 만난경우 죽음
				}
				
			}

			
			int cnt = 0;
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j) {
					if (map[i][j] != 0)
						cnt++;
				}
			}

			System.out.println("#" + test_case + " " + cnt);
		}

	}

}
