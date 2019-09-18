import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nodeNum = Integer.parseInt(br.readLine());
		int[] node = new int[(int)Math.pow(2, nodeNum)];
		node[1] = 1;
		
		String[] s = br.readLine().split("\\s");
		int n1, n2;
		for(int i=0; i<s.length; i+=2) {
			n1 = Integer.parseInt(s[i]);	// 부모노드
			n2 = Integer.parseInt(s[i+1]);	// 자식노드
			for(int j=1; j<node.length; ++j) {
				if(node[j]==n1) {
					//부모노드의 왼쪽 자식이 없을경우 넣기
					if(node[j*2]==0) {
						node[j*2] = n2;
					}
					//부모노드의 왼쪽 자식이 있을경우 오른쪽에 넣기
					else {
						node[j*2+1] = n2;
					}
					break;
				}
			}
		}
		preOrder(node, 1);
	}
	
	private static void preOrder(int[] node, int level) {
		if(level>=node.length)
			return;
		if(node[level]==0)
			return;
		
		System.out.print(node[level] + " ");
		preOrder(node, level*2);
		preOrder(node, level*2+1);
	}

}
