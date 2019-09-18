import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PasswordGenerator_1225 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception{
		String answer = "";
		for(int test_case=1; test_case<=10; ++test_case) {
			answer = "";
			br.readLine();
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i=0; i<8; ++i) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			out:while(true) {
				for(int i=1; i<=5; ++i) {
					int temp = q.poll();
					if(temp-i<=0) {
						q.add(0);
						while(!q.isEmpty()) {
							answer += q.poll() + " ";
						}
						break out;
					}
					q.add(temp-i);
				}
			}			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
