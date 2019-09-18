

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BabyGin {
	static boolean flag;
	static int[] num = new int[6];
	static boolean[] visit = new boolean[6];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		for (int i = 0; i < 6; ++i) {
			num[i] = Integer.parseInt(s[i]);
		}

		ArrayList<Integer> list = new ArrayList<>();
		go(0, list);
		if(flag)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

	private static void go(int n, ArrayList<Integer> list) {
		if(flag)
			return;
		if(list.size()==6) {
			int check = 0;
			check += checkRun(list);
			check += checkTriplet(list);
			if(check==2) {
				flag = true;
			}
			return;
		}
		
			
		for(int i=n; i<6; ++i) {
			if(visit[i])
				continue;
			visit[i] = true;
			list.add(i);
			go(n, list);
			visit[i] = false;
			list.remove(list.size()-1);
		}
		
	}

	private static int checkTriplet(ArrayList<Integer> list) {
		int cnt = 0;
		if (num[list.get(0)] == num[list.get(1)] && num[list.get(1)] == num[list.get(2)])
			cnt++;
		if (num[list.get(3)] == num[list.get(4)] && num[list.get(4)] == num[list.get(5)])
			cnt++;
		return cnt;
	}

	private static int checkRun(ArrayList<Integer> list) {
		int cnt = 0;
		if (num[list.get(0)] + 1 == num[list.get(1)] && num[list.get(1)] + 1 == num[list.get(2)])
			cnt++;
		if (num[list.get(3)] + 1 == num[list.get(4)] && num[list.get(4)] + 1 == num[list.get(5)])
			cnt++;
		return cnt;
	}

}
