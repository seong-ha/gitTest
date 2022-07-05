package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;

		int[] intArr = { 34, 23, 56, 22, 99, 28 };

		sum = sumArr(intArr);
		avg = avgArr(intArr);

		System.out.printf("intArr의 총합은 %d이고, 평균은 %.1f입니다.\n", sum, avg);
		System.out.println("-------------------------------------");
		System.out.println();
		sum = 0;
		avg = 0;

		int[] intArr2 = new int[6];
		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i] = (int) (Math.random() * 100) + 1;
		}

		sum = sumArr(intArr2);
		avg = avgArr(intArr2);

		System.out.printf("intArr2의 총합은 %d이고, 평균은 %.1f입니다.\n", sum, avg);
		System.out.println("-------------------------------------");
		System.out.println();
		sum = 0;
		avg = 0;

		int[] scanArr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scanArr.length; i++) {
			System.out.println("임의의 수를 입력 >>>");
			scanArr[i] = sc.nextInt();
		}

		sum = sumArr(scanArr);
		avg = avgArr(scanArr);

		System.out.printf("scanArr의 총합은 %d이고, 평균은 %.1f입니다.\n", sum, avg);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.printf("intArr의 총합은 %d이고, 평균은 %.1f입니다.\n", sumArr(intArr), avgArr(intArr));
		System.out.printf("intArr2의 총합은 %d이고, 평균은 %.1f입니다.\n", sumArr(intArr2), avgArr(intArr2));
		System.out.printf("scanArr의 총합은 %d이고, 평균은 %.1f입니다.\n", sumArr(scanArr), avgArr(scanArr));
		
		sc.close();
	}

	static int sumArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static double avgArr(int[] arr) {
		return (double) sumArr(arr) / arr.length;
	}

}
