import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Cryptogram3_1229 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<>();
		
		for(int test_case=1; test_case<=10; ++test_case) {
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split("\\s");
			for(int i=0; i<s.length; ++i)
				list.add(s[i]);
			
			n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int index, num;
			for(int i=0; i<n; ++i) {
				String command = st.nextToken();
				
				if(command.equals("I")) {		
					index = Integer.parseInt(st.nextToken());
					num = Integer.parseInt(st.nextToken());
					for(int j=0; j<num; ++j)
						list.add(index++, st.nextToken());
				}
				else if(command.equals("D")){
					index = Integer.parseInt(st.nextToken());
					num = Integer.parseInt(st.nextToken());
					for(int j=0; j<num; ++j)
						list.remove(index);
				}else {
					num = Integer.parseInt(st.nextToken());
					for(int j=0; j<num; ++j)
						list.add(st.nextToken());
				}
				
			}
			
			System.out.print("#"+test_case);
			for(int i=0; i<10; ++i) {
				System.out.print(" "+list.get(i));
			}
			System.out.println();
			
			list.clear();
		}
		

	}

}
