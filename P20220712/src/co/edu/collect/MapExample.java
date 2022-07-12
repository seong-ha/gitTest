package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김민수", 80);
		map.put("황현익", 75);
		map.put("이현승", 88);

		Set<Entry<String, Integer>> set = map.entrySet();
		
		int sum = 0;
		double avg = 0;
		int max = 0;
		String maxStudent = "";
		
		for (Entry<String, Integer> entry : set) {
			
			if (max < entry.getValue()) {
				max = entry.getValue();
				maxStudent = entry.getKey();
			}
			
			sum += entry.getValue();
		}
		
		avg = (double) sum / set.size();
		
		System.out.printf("평균점수: %.0f\n최고점수: %d, 최고점수 학생의 이름: %s\n", avg, max, maxStudent);
		
//		Scanner sc = new Scanner(System.in);
//		boolean isFind = false;
//
//		System.out.print("학생 이름을 입력하세요.> ");
//		String input = sc.nextLine();
//
//		Set<Entry<String, Integer>> entrys = map.entrySet();
//
//		for (Entry<String, Integer> entry : entrys) {
//
//			if (entry.getKey().equals(input)) {
//				isFind = true;
//				System.out.println(entry.getKey() + " 학생의 점수는 " + entry.getValue() + "점입니다.");
//				break;
//			}
//
//		}
//
//		if (!isFind) {
//			System.out.println("찾는 학생이 없습니다.");
//		}
	}

}
