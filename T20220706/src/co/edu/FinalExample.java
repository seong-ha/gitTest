package co.edu;

// 상수 vs 변수

final class Person {
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}

public class FinalExample /* extends Person*/  {
	
	public static void main(String[] args) {
		String name = "홍길동";
		name = "김민수";
		
		final int num = 10;
		final String str = "마지막";
		
//		num = 111;
//		str = "마지막 + 1";
		
		Person person = new Person("010101-1234567", "김길동");
		person.name = "홍길동";
		System.out.println("ssn : " + person.ssn);
		System.out.println("name : " + person.name);
//		p.ssn = ""020202-1234567"";
	}
}
