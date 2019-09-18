import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NandM2_15650 {
	static int n1;
	static int n2;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		n1 = Integer.parseInt(st.nextToken());
		n2 = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		go(1, list);
	}
	private static void go(int n, ArrayList<Integer> list) {
		if(list.size()==n2){
			for(int i : list)
				System.out.print(i+" ");
			System.out.println();
			return;
		}
		
		for(int i=n; i<=n1; ++i){
			list.add(i);
			go(i+1, list);
			list.remove(list.size()-1);
		}
	}	

}
