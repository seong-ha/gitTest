package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("100");

		for (int i = 0; i < list.size(); i++) {
			String result = list.get(i);
			System.out.println(result);
		}

		// List 컬렉션.
		List<String> sList = new ArrayList<String>();
		sList.add("홍길동");
		sList.add("김민기");
		String result = sList.get(1);
		sList.remove(0);
		sList.set(0, "황길동");
		sList.add("홍길동");
		sList.add("홍길동");
		sList.add("홍길동");
		Iterator<String> it = sList.iterator();

		System.out.println("=== iterator===");
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		
		System.out.println("=== for문 ===");
			// index 기반으로 요소를 저장한다.
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}

		System.out.println("=== 향상된 for문 ===");
			// 그러니 향상 for문도 가능
		for (String val : sList) {
			System.out.println(val);
		}
	}

}
