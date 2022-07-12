package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("사과");
		set.add("딸기");
		set.add("수박");
		set.add("딸기");
		System.out.println("크기: " + set.size());

		set.remove("딸기");
		System.out.println(set.contains("딸기"));
		
		if (set.isEmpty()) {
			System.out.println("컬렉션이 비어있음");
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}
		
		it = set.iterator();
		while(it.hasNext()) {
			String val = it.next();
			System.out.println(val);
		}
		
		// 순서(인덱스)가 없으니 향상된 for문만 가능.
		for (String val : set) {
			System.out.println(val);
		}
	}

}
