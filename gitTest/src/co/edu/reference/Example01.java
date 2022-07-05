package co.edu.reference;

public class Example01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<= 100; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("sum(짝수누적합): " + sum);
	}

}
