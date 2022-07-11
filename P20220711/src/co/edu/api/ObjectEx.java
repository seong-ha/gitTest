package co.edu.api;

public class ObjectEx {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println("=========================");
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");

		System.out.println(name1.equals(name2));
		System.out.println(name1.toString());
		System.out.println(name2.toString());
		System.out.println("=========================");
		
		Member m1 = new Member();
		m1.id = "user";
		m1.age = 10;

		Member m2 = new Member();
		m2.id = "user";
		m2.age = 10;

		System.out.println(m1.equals(m2));
		System.out.println("m1 = " + m1.toString());
		System.out.println("m2 = " + m2.toString());
		System.out.println("=========================");
	}

}

class Member {
	String id;
	int age;
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			boolean b1 = this.id.equals(member.id);
			boolean b2 = this.age == member.age;
			return b1 && b2;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "[id: " + id + ", age: " + age + "]";
	}
	
}