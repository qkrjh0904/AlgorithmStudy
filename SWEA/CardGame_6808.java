import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CardGame_6808 {
	static boolean[] visited;
	static int[] kyu = new int[9];
	static int[] inn = new int[9];
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; ++test_case) {
			visited = new boolean[9];
			boolean[] check = new boolean[18];
			answer = 0;
			for(int i=0; i<9; ++i) {
				kyu[i] = sc.nextInt();
				check[kyu[i]-1] = true;
			}
			int index=0;
			for(int i=0; i<18; ++i) {
				if(!check[i])
					inn[index++] = i+1;
			}
			Arrays.sort(inn);
			ArrayList<Integer> list = new ArrayList<>();
			go(list);
			
			
			System.out.println("#" + test_case + " " + answer + " " + (362880-answer));
		}
	}
	private static void go(ArrayList<Integer> list) {
		if(list.size()==9) {
			calc(list);
			return;
		}
		
		for(int i=0; i<9; ++i) {
			if(visited[i])
				continue;
			visited[i] = true;
			list.add(i);
			go(list);
			visited[i] = false;
			list.remove(list.size()-1);
			
		}
	}
	private static void calc(ArrayList<Integer> list) {
		int s1 = 0;
		int s2 = 0;
		for(int i=0; i<9; ++i) {
			if(kyu[i]>inn[list.get(i)])
				s1 += (kyu[i]+inn[list.get(i)]);
			else
				s2 += (kyu[i]+inn[list.get(i)]);
		}
		if(s1>s2)
			answer++;
		
	}

}
