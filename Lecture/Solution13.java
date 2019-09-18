package com.ssafy.algo;

import java.util.Scanner;

public class Solution13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
		int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
		for(int test_case=1; test_case<=T; ++test_case) {
			int n = sc.nextInt();
			String[][] map = new String[n][n];
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					map[i][j] = sc.next();
				}
			}
			
			int[][] height = new int[n][n];
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					if(map[i][j].equals("G"))	//현재 위치가 G라면 뛰어넘음
						continue;
					boolean isThereG = false;	//주변에 G가 있는지 판단
					for(int k=0; k<dx.length; ++k) {
						if(i+dx[k]<0 || i+dx[k]>=n || j+dy[k]<0 || j+dy[k]>=n)	//범위를 벗어나면 뛰어넘음
							continue;
						if(map[i+dx[k]][j+dy[k]].equals("G")) {	//주변에 G가 있으면 체크해줌
							isThereG = true;
							break;
						}
					}
					if(isThereG)	//주변에 G가 있다면 2로 설정
						height[i][j] = 2;
					else {	//주변에 G가 하나도 없다면 가로 세로 B의 갯수를 세서 출력
						int cnt=0;
						for(int index=0; index<n; ++index) {
							if(map[i][index].equals("B"))
								cnt++;
							if(map[index][j].equals("B"))
								cnt++;
						}
						height[i][j] = cnt-1;
					}
				}
			}
			
			// 가장 높은 빌딩 출력
			int max=0;	
			for(int i=0; i<n; ++i) {
				for(int j=0; j<n; ++j) {
					if(max<height[i][j])
						max = height[i][j];
				}
			}
			System.out.println("#"+test_case+" "+max);
		}
	}

}
