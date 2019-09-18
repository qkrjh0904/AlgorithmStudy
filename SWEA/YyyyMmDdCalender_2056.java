import java.util.Arrays;
import java.util.Scanner;

public class YyyyMmDdCalender_2056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case){
			String answer = "";
			String s = sc.next();
			char[] ss = s.toCharArray();
			
			String yyyy = "";
			String mm = "";
			String dd = "";
			for(int i=0; i<4; ++i)
				yyyy += ss[i];
			for(int i=4; i<6; ++i)
				mm += ss[i];
			for(int i=6; i<8; ++i)
				dd += ss[i];
			
			int y = Integer.parseInt(yyyy);
			int m = Integer.parseInt(mm);
			int d = Integer.parseInt(dd);
			
			if(m<1 || m>12 || d<1 || d>31){
				System.out.println("#" + test_case + " -1");
				continue;
			}
			
			if((m==4 || m==6 || m==9 || m==11) && d>30){
				System.out.println("#" + test_case + " -1");
				continue;
			}
			
			if(m==2 && d>28){
				System.out.println("#" + test_case + " -1");
				continue;
			}
			
			System.out.println("#" + test_case + " " + yyyy + "/" + mm + "/" + dd);
		}

	}

}
