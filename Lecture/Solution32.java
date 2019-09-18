package com.ssafy.algo;

import java.util.Scanner;

public class Solution32 {
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			int money=0;
			int r = sc.nextInt();	// 행 수
			int c = sc.nextInt();	// 열 수
			int n = sc.nextInt();	// 참가자 수
			int[][] board = new int[r+1][c+1];
			for(int i=1; i<=r; ++i) {
				for(int j=1; j<=c; ++j) {
					board[i][j] = sc.nextInt();
				}
			}
			int[][] person = new int[n][3];		// 참가자 정보 배열
			for(int i=0; i<n; ++i) {
				person[i][0] = sc.nextInt();	// 참가자 시작 행 위치
				person[i][1] = sc.nextInt();	// 참가자 시작 열 위치
				person[i][2] = sc.nextInt();	// 참가자 횟수
			}
			int fail = sc.nextInt();	//함정 수
			for(int i=0; i<fail; ++i) {	//함정 수만큼 함정의 좌표 받기
				int fail_r = sc.nextInt();
				int fail_c = sc.nextInt();
				board[fail_r][fail_c] = 0;
			}
//			for(int i=1; i<=r; ++i) {
//				for(int j=1; j<=c; ++j)
//					System.out.print(board[i][j] + "\t");
//				System.out.println();
//			}
			
			for(int i=0; i<n; ++i) {
				int tempMoney = 0;
//				System.out.println("==============사람"+(i+1)+"=============");
				for(int j=0; j<person[i][2]; ++j) {
					int x = person[i][0];	//참가자 현재 행 위치
					int y = person[i][1];	//참가자 현재 열 위치
//					System.out.println("x : " + x + " y : " + y);
					if(board[x][y]==0) {
						tempMoney = 0;
						break;
					}
					int temp = board[x][y];
//					System.out.println("temp : " + temp);
					int dirIdx = temp/10-1;	//참가자 방향
					int jumpNum = temp%10;	//참가자 점프칸수
//					System.out.println("dirIdx : " + dirIdx + " jumpNum : " + jumpNum);
					if(x+dy[dirIdx]*jumpNum<1 || x+dy[dirIdx]*jumpNum>c 
							|| y+dx[dirIdx]*jumpNum<1 || y+dx[dirIdx]*jumpNum>r) {
						tempMoney = 0;
						break;
					}
//					System.out.println("dx[dirIdx]*jumpNum : " + dx[dirIdx]*jumpNum + " dy[dirIdx]*jumpNum : " + dy[dirIdx]*jumpNum);
//					System.out.println("x : " + x + " y : " + y);
					person[i][0] = x+dy[dirIdx]*jumpNum; 
					person[i][1] = y+dx[dirIdx]*jumpNum;
//					System.out.println("변경 x : " + person[i][0] + " 변경 y : " + person[i][1]);
					tempMoney = board[person[i][0]][person[i][1]]*100;
				}
				money += tempMoney;
//				System.out.println("money : " + money);
			}
			money += (-1000*n);
			System.out.println("#" + test_case + " " + money);
		}
		
		
	}

}
