package co.edu.reference;

public class MethodExample01 {

	public static void main(String[] args) {
//		int sum = sum(10);
//		showInfo("홍길동", 30);
//		showInfo("전성하", 19);
//		printShape(10, "♥");
		for (int i = 2; i <= 4; i++) {
			printGugudan(i);
		}
			printGugudanCross();
	}

	public static void printGugudanCross() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
	
	public static void printGugudan(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
		System.out.println();
	}
	
	public static void printShape(int times, String shape) {
		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}

		for (int i = 1; i <= times; i++) {
			for (int j = 1; j <= times; j++) {
				if (i + j <= times + 1) {
					System.out.print(shape);
				}
			}
			System.out.println();
		}
	}

	public static void showInfo(String name, int age) {
		System.out.println("반갑습니다. " + name + "입니다. 나이는 " + age + "살입니다.");
	}

	public static int sum(int num) {
		int result = num * 2;
		return result;
	}
}
