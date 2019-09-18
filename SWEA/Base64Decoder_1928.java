import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class Base64Decoder_1928 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case<=T; ++test_case){
			String answer="";
			String s = sc.next();
			byte[] sByte = s.getBytes();
			
			Decoder decoder = Base64.getDecoder();
			byte[] decodeByte = decoder.decode(sByte);
			answer = new String(decodeByte);
			System.out.println("#" + test_case + " " + answer);
		}

	}

}
