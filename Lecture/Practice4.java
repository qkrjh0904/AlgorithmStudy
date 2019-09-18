import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Practice4 {
	// 0~F까지 16진수 -> 4자리 2진수
	static HashMap<String, String> map = new HashMap<>();
	static HashMap<String, Integer> map2 = new HashMap<>();
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
		
		map2.put("001101", 0);
		map2.put("010011", 1);
		map2.put("111011", 2);
		map2.put("110001", 3);
		map2.put("100011", 4);
		map2.put("110111", 5);
		map2.put("001011", 6);
		map2.put("111101", 7);
		map2.put("011001", 8);
		map2.put("101111", 9);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split("");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length; ++i) {
			sb.append(map.get(s[i]));
		}
		System.out.println(sb);
		String num = sb.toString();
		String[] spNum = num.split("");
		int start=0;
		int end=0;
		for(int i=spNum.length-1; i>=0; --i) {
			if(spNum[i].equals("1")) {
				start = i;
				end = i;
				break;
			}
		}
		start -= 5;
		end += 1;
		int idx=0;
		String temp;
		while(true) {
			if(start<0 || end<6)
				break;
			System.out.print(map2.get(num.substring(start-idx, end-idx)) + " ");
			System.out.println(num.substring(start-idx, end-idx));
			idx += 6;
		}
		
		
	}

}
