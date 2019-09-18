

import java.util.ArrayList;

public class PowerSet {
	static int[] num = {-1, 3, -9, 6, 7, -6, 1, 5, 4, -2};
	static boolean[] visit = new boolean[num.length];
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		go(0, list);

	}
	private static void go(int n, ArrayList<Integer> list) {
		if(list.size()==6) {
			System.out.println(list);
//			print(list);
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
	
	private static void print(ArrayList<Integer> list) {
		if(check(list)) {
			for(int i=0; i<list.size(); ++i) {
				System.out.print(num[list.get(i)] + " ");
			}System.out.println();
		}		
	}
	private static boolean check(ArrayList<Integer> list) {
		int sum = 0;
		for(int i=0; i<list.size(); ++i) {
			sum += num[list.get(i)];
		}
		return sum==0;
	}
}
