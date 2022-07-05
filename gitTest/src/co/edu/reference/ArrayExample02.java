package co.edu.reference;

public class ArrayExample02 {

	public static void main(String[] args) {
		int[] intArr = {20, 27, 15, 33, 29};
		intArr[2] = 30;
		
		int j = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = j;
		
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		System.out.println("합계: " + sum);
	}

}
