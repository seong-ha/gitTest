package co.yedam;

import java.util.Arrays;

/*
 * 문제 4: 임의의 값 생성.
 * Math.random()을 사용하여 1 ~ 100 의 임의의 값을 생성하여 배열(크기 6)에 저장 후
 * 가장 큰 값과 가장 작은 값을 구해서 출력하는 기능을 작성하세요.
 * 출력 예 : 가장 큰 값 : 97, 가장 작은 값 : 3
 */
public class Exam04 {
	public static void main(String[] args) {
		int[] intArr = new int[6];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println(Arrays.toString(intArr)); // intArr 전체 보기용.

		int max = 0;
		int min = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if (max < intArr[i]) {
				max = intArr[i];
			}

			if (min > intArr[i]) {
				min = intArr[i];
			}
		}

		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d", max, min);
	}
}
