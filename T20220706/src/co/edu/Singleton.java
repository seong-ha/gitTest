package co.edu;

// 정적필드 정적메섣. 싱글톤. private로 필드랑 생성자 막아놓고 public static메서드로
// 객체를 하나만 생성하게 제한.

public class Singleton {
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
