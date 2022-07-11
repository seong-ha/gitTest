package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		System.out.println("=== HashSet ===");
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");

		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("=== ArrayList ===");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

	}

}
