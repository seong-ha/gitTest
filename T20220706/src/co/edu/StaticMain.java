package co.edu;

public class StaticMain {

	public static void main(String[] args) {
		System.out.println(Calculator.pi);
		int result = Calculator.sum(10,20);
		System.out.println(result);
		
//		Singleton sing1 = new Singleton();
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		System.out.println(sing1 == sing2);
	}

}