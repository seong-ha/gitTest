package co.edu.reference;

import java.util.Arrays;

public class ForExample01 {

	public static void main(String[] args) {
		int[] tempAry = new int[5];
		for (int i = 0; i < tempAry.length; i++) {
			tempAry[i] = (int) (Math.random() * 50) + 1;
		}

		int max = 0;
		for (int num : tempAry) {
			System.out.print(num + " ");

			if (num > max) {
				max = num;
			}
		}
		
		System.out.println();
		System.out.println("제일 큰 값: " + max);

		for (int i = 0; i < tempAry.length; i++) {
			for (int j = 0; j < tempAry.length - 1; j++)
				if (tempAry[j] > tempAry[j + 1]) {
					int temp = tempAry[j];
					tempAry[j] = tempAry[j + 1];
					tempAry[j + 1] = temp;
				}
		}
		System.out.println(Arrays.toString(tempAry));
	}

}
