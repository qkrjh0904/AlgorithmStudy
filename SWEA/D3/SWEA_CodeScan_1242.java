import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SWEA_CodeScan_1242 {
	// 0~9의 암호문 저장
	static String[] comp = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; ++test_case) {
			int answer = 0;
			String[] rc = br.readLine().split("\\s");
			int r = Integer.parseInt(rc[0]);
			int c = Integer.parseInt(rc[1]);
			
			// 1이 포함된 암호문 라인만 선택해 map 배열에 저장
			String[] map = null;
			for(int i=0; i<r; ++i) {
				String s = br.readLine();
				if(s.contains("1")) {
					map = s.split("");
				}
			}
			
			// 뒤에서 가장 처음으로 1이 나오는 index검색
			int index = 0;
			for(int i=map.length-1; i>=0; --i) {
				if(map[i].equals("1")) {
					index = i;
					break;
				}
			}
			// 암호문의 처음위치 설정
			index -= 55;
			
			
			// 뒤에서부터 암호문 숫자 파악
			ArrayList<Integer> list = new ArrayList<>();
			String temp = "";
			for(int i=0; i<8; ++i) {	// 총 암호문 길이 8
				for(int j=0; j<7; ++j) {// 한 숫자당 암호 7자리
					temp += map[index++];
				}
				for(int j=0; j<10; ++j) {
					if(comp[j].equals(temp)) {
						list.add(j);
						break;
					}
				}
				temp = "";
			}
			
//			System.out.println(list);
			int check = (list.get(0)+list.get(2)+list.get(4) + list.get(6))*3 + list.get(1) + list.get(3) + list.get(5) + list.get(7);
			if(check%10==0) {
				answer = 0;
				for(int i=0; i<8; ++i) {
					answer += list.get(i);
				}
			}
			else {
				answer = 0;
			}
			
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
