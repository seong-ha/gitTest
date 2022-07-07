package co.edu;

public class MethodExample01 {

	public static void main(String[] args) {
//		sum(10, 20);
//
//		int result = sum2(5, 10);
//		System.out.println("sum2 결과: " + result);
//
		
		sum2(sum2(1, 1), sum2(2, 2));
		System.out.printf("sum2(1,1)의 결과값: %d\nsum2(2,2)의 결과값: %d\nsum2(sum2(1,1), sum2(2,2))의 결과값: %d\n"
						, sum2(1, 1), sum2(2, 2), sum2(sum2(1, 1), sum2(2, 2)));
//		double height = 172.8;
//		double weight = standardWeight(height);
//		System.out.printf("%.1fcm 키의 표준 몸무게는 %.1fkg입니다.", height, weight);
		
//		double bottom = 23.4;
//		double height = 12.2;
//		double triangleArea = getTriangle(bottom, height);
//		System.out.printf("밑변 %.1fcm, 높이 %.1fcm인\n이등변삼각병의 넓이는 %.1f제곱cm입니다.", bottom, height, triangleArea);
		
	}

	public static void sum(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("sum 결과: " + result);
	}

	public static int sum2(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		return result;
	}
	
	public static double standardWeight(double height) {
		double calculate = (height - 100) * 0.9;
		return calculate;
	}
	
	public static double getTriangle(double bottom, double height) {
		double calculate = (bottom * height) / 2;
		return calculate;
	}
}