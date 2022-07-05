package co.edu.reference;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		int[] intAry = new int[10];
		intAry[0] = 10;
		intAry[4] = 50;

		System.out.println(intAry.length);

		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		System.out.println();

		double[] dblAry = new double[5];
		for (int i = 0; i < dblAry.length; i++) {
			System.out.println(dblAry[i]);
		}
		System.out.println();

		boolean[] boolAry = new boolean[3];
		boolAry[1] = true;
		boolAry[2] = true;
		for (int i = 0; i < boolAry.length; i++) {
			System.out.print(boolAry[i] + " ");
		}
		System.out.println();
		System.out.println();

		String[] strAry = { "홍길동", "김민수", "허민기" };
		strAry[2] = "황경영";
		for (int i = 0; i < strAry.length; i++) {
			System.out.print(strAry[i] + " ");
		}
		System.out.println();
		System.out.println();

	}

}
