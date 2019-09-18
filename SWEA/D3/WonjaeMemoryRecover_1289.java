import java.util.Arrays;
import java.util.Scanner;

public class WonjaeMemoryRecover {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int c=0; c<T; ++c) {
			String original_temp = sc.next();
			String temp = "";
			for(int i=0; i<original_temp.length(); ++i)
				temp+="0";
			
			char[] original = original_temp.toCharArray();
			char[] init = temp.toCharArray();
			
			int answer = 0;
			for(int i=0; i<original.length; ++i) {
				if(original[i]==init[i])
					continue;
				for(int j=i; j<init.length; ++j)
					init[j] = original[i];
				
				answer++;
			}
			System.out.println("#" + (c+1) + " " + answer);
		}

	}

}
