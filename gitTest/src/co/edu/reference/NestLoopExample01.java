package co.edu.reference;

public class NestLoopExample01 {

	public static void main(String[] args) {
//		for (int j = 1; j <= 3; j++) {
//			System.out.printf("j의 값: %d\n", j);
//
//			for (int i = 1; i <= 5; i++) {
//				System.out.printf("\ti의 값: %d\n", i);
//			}
//			System.out.println();
//		}

//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5; j >= 1; j--) {
//				if (j > i) {
//					System.out.print(" ");
//				} else if (j <= i) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i + j < 6) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
