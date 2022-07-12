package co.edu.collect.generic;

public class BoxExample2 {

	public static void main(String[] args) {
		Box<String> strBox = new Box<String>();
		strBox.set(new String("문자열"));
		String result = strBox.get();
		System.out.println(result);
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100);	// Boxing
		int result1 = intBox.get();		// UnBoxing
		System.out.println(result1);
	}

}
