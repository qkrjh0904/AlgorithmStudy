import java.util.ArrayList;
import java.util.Scanner;

public class AllPermutation_10974 {
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> picked = new ArrayList<>();
		int n = sc.nextInt();
		visited = new boolean[n+1];

		// n: 전체 원소의 수
		// picked: 지금까지 고른 원소들의 번호
		permutation(n, picked);
	}
	private static void permutation(int n, ArrayList<Integer> picked) {
		// base case
		// List가 전체 원소 개수만큼 차면 출력후 리턴
		if(picked.size()==n) {
			print(picked);
			return;
		}
		
		for(int i=1; i<=n; ++i){
			if(visited[i])	//방문 했었다면 다음으로
				continue;
			visited[i] = true;	// 방문 안했다면 방문 체크
			picked.add(i);		// list에 추가
			permutation(n, picked);	
			picked.remove(picked.size()-1);
			visited[i] = false;
		}

	}
	private static void print(ArrayList<Integer> picked) {
		for (int n : picked)
			System.out.print(n + " ");
		System.out.println();
	}

}
