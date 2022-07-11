package co.edu.exception;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {

		int[] intArr = new int[5];

		intArr[0] = 20;
		intArr[1] = 30;
//		intArr[5] = 50;

		for (int i = 0; i <= intArr.length; i++) {

			try {
				intArr[i] = (int) (Math.random() * 100) + 1;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 벗어났습니다.\n");
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

		System.out.println("프로그램 종료.");
	}

}
