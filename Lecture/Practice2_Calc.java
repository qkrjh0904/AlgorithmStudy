import java.util.Stack;

public class Practice2_Calc {

	public static void main(String[] args) {
		
		String s = "62 51 12 28 - * 12 / +";
		String[] data = s.split(" ");
		Stack<Integer> num = new Stack<>();
		int answer = 0;
		int temp1 = 0;
		int temp2 = 0;
		for(int i=0; i<data.length; ++i) {
			if(data[i].equals("/") || data[i].equals("*") || data[i].equals("+") || data[i].equals("-")) {
				temp2 = num.pop();
				temp1 = num.pop();
				if(data[i].equals("*")) {
					num.push(temp1*temp2);
				}else if(data[i].equals("/")) {
					num.push(temp1/temp2);
				}else if(data[i].equals("+")) {
					num.push(temp1+temp2);
				}else {
					num.push(temp1-temp2);
				}
				continue;
			}
			num.push(Integer.parseInt(data[i]));
		}
		answer = num.pop();
		System.out.println(answer);

	}

}
