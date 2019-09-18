import java.util.Scanner;

public class AlphaToNum_2050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] alpha = s.toCharArray();
		for(int i=0; i<alpha.length; ++i){
			System.out.print((alpha[i] - 'A' + 1) + " ");
		}
		System.out.println();

	}

}
