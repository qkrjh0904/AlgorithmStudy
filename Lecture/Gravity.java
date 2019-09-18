
public class Gravity {

	public static void main(String[] args) {
		int[] data = {2,3,6,2,1,0,0,0,0};
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<data.length-1; ++i) {
			int cnt=(data.length-1)-i;
			for(int j=i+1; j<data.length; ++j) {
				if(data[i]>data[j])
					continue;
				else
					cnt--;				
			}
			if(max<cnt)
				max = cnt;
		}
		System.out.println(max);
	}

}
