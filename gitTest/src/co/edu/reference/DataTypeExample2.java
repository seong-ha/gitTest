package co.edu.reference;

public class DataTypeExample2 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 100;
		
		System.out.println("num1 == num2 ? " + (num1 == num2));
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println("p1 == p2 ? " + (p1 == p2));
		System.out.println();
		
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		
		int result = 0;
//		str1 = null;
//		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
	}

}
