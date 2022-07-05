package co.edu.reference;

import java.util.Arrays;

public class ArrayExample03 {

	public static void main(String[] args) {
		int[] intArr = { 22, 33 };
		intArr = new int[] { 24, 56, 77, 43, 99 };

		int sum = 0;

		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}

		double avg = (double) sum / intArr.length;

		System.out.printf("합계는 %d, 평균은 %.1f입니다. ", sum, avg);
		System.out.printf("\n\n");

		int[][] nestArr = new int[2][3];
		nestArr[0][0] = 10;
		nestArr[0][2] = 30;
		nestArr[1][1] = 40;

		System.out.println("nestArr 첫번째 배열");
		for (int i = 0; i < nestArr[0].length; i++) {
			System.out.print(nestArr[0][i] + " ");
		}
		System.out.printf("\n\n");

		System.out.println("nestArr 두번째 배열");
		for (int i = 0; i < nestArr[1].length; i++) {
			System.out.print(nestArr[1][i] + " ");
		}
		System.out.printf("\n\n");

		nestArr = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		System.out.println("nestArr 중첩 배열");
		for (int i = 0; i < nestArr.length; i++) {
			for (int j = 0; j < nestArr[i].length; j++) {
				System.out.print(nestArr[i][j] + " ");
			}
			System.out.println();
		}

//		System.out.println(Arrays.deepToString(nestArr));
	}

}
