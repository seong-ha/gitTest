package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 80);
		map.put("김민수", 85);
		map.put("최기동", 92);
		map.put("홍길동", 89);
		
		int score = map.get("홍길동");
		System.out.println(score);
		
		map.remove("홍길동");
		
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			Integer val = map.get(key);
			System.out.println("키: " + key +", 값: " + val);
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("키: " + key +", 값: " + val);
		}
		
	}

}
