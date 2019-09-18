import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Cryptogram1_1228 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int test_case=1; test_case<=10; ++test_case) {
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split("\\s");
			
			Queue<String> q = new LinkedList<String>();
			if(n>10)
				n = 10;
			for(int i=0; i<n; ++i) {
				q.add(s[i]);
			}
			n = Integer.parseInt(br.readLine());
			s = br.readLine().split("\\s");
			int index = 1;
			int start = 0;
			int num = 0;
			for(int i=0; i<n; ++i) {
				start = Integer.parseInt(s[index++]);
				num = Integer.parseInt(s[index++]);
//				System.out.println("start : " + start + " , num : " + num);
				for(int j=0; j<start; ++j) {	//유지할 개수만큼 큐 맨뒤로 채우기
					q.add(q.poll());
				}
				if(start+num>=10) {	//유지할 개수+새로들어올 개수가 10보다 커지면
					for(int j=0; j<10-start; ++j) {	//10-유지할개수 만큼 새로 넣고, 앞부분은 그만큼 빼기
						q.add(s[index++]);
						q.poll();
					}
				}else {
					for(int j=0; j<num; ++j) {
						q.add(s[index++]);
					}
					for(int j=0; j<10-start-num; ++j) {
						q.add(q.poll());
					}
					for(int j=0; j<num; ++j) {
						q.poll();
					}
				}
				
				while(index<s.length && !s[index++].equals("I")) {
				}
			}
			sb.append("#"+test_case);
			while(!q.isEmpty()) {
				sb.append(" " + q.poll());
			}
			System.out.println(sb);
		}
		

	}

}
