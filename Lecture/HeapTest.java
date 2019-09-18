import java.util.Arrays;

public class HeapTest {

	// heap(Ssafy Priority Queue)
	static class SPQ {
		int[] datas;
		int MAX_SIZE;
		int pointer;

		public SPQ() {
			this(100);
		}

		public SPQ(int max) {
			this.datas = new int[max + 1];
			this.MAX_SIZE = max;
			this.pointer = 0;
		}

		void swap(int i, int j) {
			datas[0] = datas[i];
			datas[i] = datas[j];
			datas[j] = datas[0];
		}

		void offer(int data) {
			if (!isFull()) {
				datas[++pointer] = data;
				int now = pointer;
				while (now > 1 && datas[now] > datas[now / 2]) {
					swap(now, now / 2);
					now /= 2;
				}
			}
		}

		int poll() {
			if (isEmpty())
				return -1;

			datas[1] = datas[pointer];
			datas[pointer--] = 0;
			heapify();

			return datas[1];
		}

		private void heapify() {
			int idx = 1;
			while (idx * 2 < pointer) {
				// 부모가 잴큼!
				if (datas[idx] >= datas[idx * 2] && datas[idx] >= datas[idx * 2 + 1])
					break;

				// 부모와 교환
				if (datas[idx * 2] > datas[idx * 2 + 1]) {
					swap(idx, idx * 2);
					idx = idx * 2;
				} else {
					swap(idx, idx * 2 + 1);
					idx = idx * 2 + 1;
				}
			}

		}

		int size() {
			return pointer;
		}

		boolean isFull() {
			return pointer == MAX_SIZE;
		}

		boolean isEmpty() {
			return pointer == 0;
		}

		void print() {
			System.out.println(Arrays.toString(datas));
		}

	}

	public static void main(String[] args) {
		SPQ spq = new SPQ();
		spq.offer(3);
		spq.offer(2);
		spq.offer(5);
		spq.offer(7);
		spq.offer(9);
		spq.offer(9);
		spq.offer(10);
//		spq.poll();
//		spq.poll();
		spq.print();
	}

}
