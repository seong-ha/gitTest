package co.edu.reference;

public class DataTypeExample {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = num1;
		num1 = 200;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "전성하";
		p1.age = 30;
		p2.name = "박서준";
		p2.age = 31;
		
		System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
		System.out.println("이름: " + p2.name + ", 나이: " + p2.age);
		
		p2 = p1;
		System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
		System.out.println("이름: " + p2.name + ", 나이: " + p2.age);
		
		p1.name = "윤석열";
		System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
		System.out.println("이름: " + p2.name + ", 나이: " + p2.age);
	
		p2.age = 80;
		System.out.println("이름: " + p1.name + ", 나이: " + p1.age);
		System.out.println("이름: " + p2.name + ", 나이: " + p2.age);
	}

}
