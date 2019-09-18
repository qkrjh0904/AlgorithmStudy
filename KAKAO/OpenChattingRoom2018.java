package kakao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OpenChattingRoom2018 {

	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		solution(record);
	}

	private static void solution(String[] record) {
		String[] answer;

		// 유저 등록과 동시에 닉네임 변경시 변경해줌...
		int size = record.length;
		String[] temp;
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < record.length; ++i) {
			temp = record[i].split("\\s");
			if (temp[0].equals("Enter")) {
				map.put(temp[1], temp[2]);
			} else if (temp[0].equals("Change")) {
				map.put(temp[1], temp[2]);
				size--;
			}
		}

		// 출력
		answer = new String[size];
		int index = 0;
		for (int i = 0; i < record.length; ++i) {
			temp = record[i].split("\\s");
			if (temp[0].equals("Enter")) {
				answer[index++] = map.get(temp[1]) + "님이 들어왔습니다.";
			} else if (temp[0].equals("Leave")) {
				answer[index++] = map.get(temp[1]) + "님이 나갔습니다.";
			}
		}
		System.out.println(Arrays.toString(answer));
	}

}
