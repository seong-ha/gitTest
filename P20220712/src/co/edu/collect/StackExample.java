package co.edu.collect;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김인수");
		stack.push("박찬호");
		
		System.out.println("슬쩍보자 - " + stack.peek());
		String elem = stack.pop();
		System.out.println(elem);
		
		System.out.println("슬쩍보자 - " + stack.peek());
		elem = stack.pop();
		System.out.println(elem);
		
		System.out.println("슬쩍보자 - " + stack.peek());
		elem = stack.pop();
		System.out.println(elem);
		
		if (stack.isEmpty()) {
			System.out.println("stack에 더 요소가 없음.");
		}
	}

}
