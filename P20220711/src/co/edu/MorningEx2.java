package co.edu;

import java.util.Arrays;

public class MorningEx2 {

	public static void main(String[] args) {
		int[] intArr = new int[6];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(intArr)); // intArr 전체 보기용.

		int max = intArr[0];
		int min = intArr[0];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (max < intArr[i]) {
				max = intArr[i];
			}

			if (min > intArr[i]) {
				min = intArr[i];
			}
			sum += intArr[i];
		}
		
		avg = (double) sum / intArr.length;
		
		System.out.printf("최대값: %d\n최소값: %d\n합계: %d\n평균: %.1f", max, min, sum, avg);
	}

}
