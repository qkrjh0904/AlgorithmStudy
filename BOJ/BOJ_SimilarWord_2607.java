import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_SimilarWord_2607 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] alpha = new int[26];	// 첫번 째 단어 알파벳 카운트
		char[] s = br.readLine().toCharArray();
		
		int wSize = s.length;	// 첫번째 단어의 길이 저장
		for(int i=0; i<s.length; ++i) {
			alpha[s[i]-'A']++;
		}
		int[] temp = new int[26];	// 비교할 단어 알파벳 저장
		int answer=0;
		for(int i=0; i<n-1; ++i) {
			s = br.readLine().toCharArray();
			//단어 길이 차이가 2 이상이면 검사할 필요 없음
			if(Math.abs(wSize-s.length)>=2)	
				continue;
			// 입력받은 단어 알파벳 카운트
			for(int j=0; j<s.length; ++j) {
				temp[s[j]-'A']++;
			}
			// 입력받은 단어와 첫번째 단어와 카운트 비교
			for(int j=0; j<26; ++j) {
				temp[j]  = Math.abs(alpha[j]-temp[j]);
			}
			// 비교한 단어의 수가 1 이하이면 비슷한 단어로 추가
			int cnt=0;
			for(int j=0; j<26; ++j) {
				cnt += temp[j];
			}
			if(cnt<=2)
				answer++;
			Arrays.fill(temp, 0);
		}
		System.out.println(answer);
	}

}
