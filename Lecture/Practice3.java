import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practice3 {
	// 0~F까지 16진수 -> 4자리 2진수
	static HashMap<String, String> map = new HashMap<>();
	public static void main(String[] args) throws Exception {
		map.put("0", "0000");
		map.put("1", "0001");
		map.put("2", "0010");
		map.put("3", "0011");
		map.put("4", "0100");
		map.put("5", "0101");
		map.put("6", "0110");
		map.put("7", "0111");
		map.put("8", "1000");
		map.put("9", "1001");
		map.put("A", "1010");
		map.put("B", "1011");
		map.put("C", "1100");
		map.put("D", "1101");
		map.put("E", "1110");
		map.put("F", "1111");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length; ++i) {
			sb.append(map.get(s[i]));
		}
		System.out.println(sb);
		String num = sb.toString();
		int start=0;
		int end=7;
		int idx=0;
		String temp;
		while(true) {
			if(end+idx>num.length()) {
				System.out.println(Integer.parseInt(num.substring(start+idx, num.length()), 2));
				break;
			}
			System.out.print(Integer.parseInt(num.substring(start+idx, end+idx), 2) + " ");
			idx += 7;
		}
		
		
	}

}
