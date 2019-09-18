package com.ssafy.algo;

import java.util.Scanner;

public class Solution21 {
	static int[] dr = {1, 0};
	static int[] dc = {0, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int n = sc.nextInt();	// 연못 크기
			int saltNum = sc.nextInt();	// 소금쟁이 수
			int[][] map = new int[n][n];
			int[][] data = new int[saltNum][3];
			
			for(int i=0; i<saltNum; ++i) {
				data[i][0] = sc.nextInt();
				data[i][1] = sc.nextInt();
				data[i][2] = sc.nextInt();
				map[data[i][0]][data[i][1]] = data[i][2];
			}
			
			int answer=0;
			for(int i=0; i<saltNum; ++i) {
				int r = data[i][0];
				int c = data[i][1];
				int dir = data[i][2]-1;
				/*
				for(int k=0; k<n; ++k) {
					for(int j=0; j<n; ++j) {
						System.out.print(map[k][j] + " ");
					}System.out.println();
				}
				System.out.println();
				*/
				// 3칸 뛰었을 때 범위를 벗어나면 다음 소금쟁이로
				if(r+3*dr[dir]<0 || r+3*dr[dir]>=n || c+3*dc[dir]<0 || c+3*dc[dir]>=n)
					continue;
				// 3칸 뛰었을 때 소금쟁이가 있다면 출력
				if(map[r+3*dr[dir]][c+3*dc[dir]]!=0) {
					answer = i+1;
					break;
				}
				// 3칸 뛰어도 괜찮을 때 흔적남김
				map[r+3*dr[dir]][c+3*dc[dir]] = map[r][c];
				
				// 5칸 뛰었을 때 범위를 벗어나면 다음 소금쟁이로
				if(r+5*dr[dir]<0 || r+5*dr[dir]>=n || c+5*dc[dir]<0 || c+5*dc[dir]>=n)
					continue;
				// 5칸 뛰었을 때 소금쟁이가 있다면 출력
				if(map[r+5*dr[dir]][c+5*dc[dir]]!=0) {
					answer = i+1;
					break;
				}
				// 5칸 뛰어도 괜찮을 때 흔적남김
				map[r+5*dr[dir]][c+5*dc[dir]] = map[r][c];
				// 6칸 뛰었을 때 범위를 벗어나면 다음 소금쟁이로
				if(r+6*dr[dir]<0 || r+6*dr[dir]>=n || c+6*dc[dir]<0 || c+6*dc[dir]>=n)
					continue;
				// 6칸 뛰었을 때 소금쟁이가 있다면 출력
				if(map[r+6*dr[dir]][c+6*dc[dir]]!=0) {
					answer = i+1;
					break;
				}
				// 6칸 뛰어도 괜찮을 때 흔적남김
				map[r+6*dr[dir]][c+6*dc[dir]] = map[r][c];
				
			}
			
			System.out.println("#"+test_case+" "+answer);
			
			
		}
	}

}
