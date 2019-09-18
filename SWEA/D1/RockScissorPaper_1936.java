import java.util.Scanner;

public class RockScissorPaper_1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if(n1==1 && n2==3 || n1==2 && n2==1|| n1==3 && n2==2)
			System.out.println("A");
		else
			System.out.println("B");

	}

}
