package kakao;

import java.util.LinkedList;
import java.util.Queue;

public class EatingLive0218 {

	public static void main(String[] args) {

		int[] food_times = { 3, 1, 2 };
		long k = 5;
		solution(food_times, k);
	}

	private static void solution(int[] food_times, long k) {
		int leng = food_times.length;
		Queue<Food> q = new LinkedList<Food>();
		for (int i = 0; i < leng; ++i) {
			q.add(new Food(food_times[i], i + 1));
		}
		Food food;
		for (int i = 0; i < k; ++i) {
			if(q.isEmpty()) {
				System.out.println("-1");
				return;
			}
			food = q.poll();
			food.quantity -= 1;
			if(food.quantity>0)
				q.add(food);			
		}
		food = q.poll();
		System.out.println(food.num);
	}

}

class Food {
	int quantity;
	int num;
	public Food(int quantity, int num) {
		super();
		this.quantity = quantity;
		this.num = num;
	}

}