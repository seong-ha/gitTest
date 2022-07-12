package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		que.offer("홍길동");
		que.offer("김민수");
		que.offer("황순호");

		String elem = "";
		while (!que.isEmpty()) {

			System.out.println("슬쩍보자 - " + que.peek());
			elem = que.poll();
			System.out.println(elem);

			if (que.isEmpty()) {
				System.out.println("Queue에 요소가 비어 있음.");
			}
		}

	}

}
