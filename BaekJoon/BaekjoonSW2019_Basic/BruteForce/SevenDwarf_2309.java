package bruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] h = new int[9];
		int total=0;
		for(int i=0; i<9; ++i) {
			h[i] = sc.nextInt();
			total += h[i];
		}
		Arrays.sort(h);
		
		int p1=0;
		int p2=0;
		for(int i=0; i<8; ++i) {
			for(int j=i+1; j<9; ++j) {
				if(total-h[i]-h[j]==100) {
					p1 = i;
					p2 = j;
					for(int k=0; k<9; ++k) {
						if(k==i || k==j)
							continue;
						System.out.println(h[k]);
					}
					return;
				}
			}
		}

		
		
	}

}
