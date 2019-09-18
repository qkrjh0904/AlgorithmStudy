import java.util.Scanner;

public class PrintBackwards_1545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=sc.nextInt(); i>=0; --i)
			System.out.print(i + " ");
		System.out.println();
	}

}
