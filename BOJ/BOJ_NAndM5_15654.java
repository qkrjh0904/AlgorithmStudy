import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NandM5_15654 {
	static boolean[] visited;
	static int[] num;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		StringTokenizer st2 = new StringTokenizer(s2);
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		num = new int[n];
		for(int i=0; i<n; ++i) {
			num[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(num);
		ArrayList<Integer> a = new ArrayList<>();
		visited = new boolean[n];
		go(n, m, a);
	}

	private static void go(int n, int m, ArrayList<Integer> a) {
		if(a.size()==m) {
			for(int i : a)
				System.out.print(i + " ");
			System.out.println();
			return;
		}
		
		for(int i=0; i<n; ++i) {
			if(visited[i])
				continue;
			visited[i] = true;
			a.add(num[i]);
			go(n, m, a);
			visited[i] = false;
			a.remove(a.size()-1);
		}
		
	}

}
