package co.edu.api;

public class BoxingUnboxingEx {

	public static void main(String[] args) {
		int[] lotto = new int [6];

//		내가 한 버전
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random()* 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i = i - 1;
				}
			}
		}
		
//		교수님이 하시려던 버전으로 해봄.
//		for (int i = 0; i < lotto.length; i++) {
//			int temp = (int) (Math.random()* 45) + 1;
//			System.out.println(temp + ", " + i);
//			for (int j = 0; j < i + 1; j++) {
//				if (lotto[j] != temp) {
//					lotto[i] = temp;
//					break;
//				} else {
//					i = i - 1;
//				}
//			}
//		}
		
		for (int num : lotto) {
			System.out.println(num);
		}
		
//		HashSet<Integer> set = new HashSet<Integer>();
//		
//		for (int i = 0; set.size() < 6; i++) {
//			int rand = (int) (Math.random()* 45) + 1; 
//			set.add(rand);
//		}
//		
//		for (int num : set) {
//			System.out.println(num);
//		}
	}

}
