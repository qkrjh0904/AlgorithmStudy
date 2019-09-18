import java.util.Scanner;

public class DoubleDouble_2019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		for(int i=sc.nextInt(); i>=0; --i){
			System.out.print(n + " ");
			n *= 2;
		}
	}

}
