package co.edu.compound;

public class ClassExam {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 30;

		String[] names = { "홍길동", "박민수", "김익수" };
		int[] scores = { 80, 58, 79 };
		int[] ages = { 19, 20, 19 };

		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 19;
		s1.score = 80;
		s1.height = 180.1;

		Student s2 = new Student();
		s2.name = "박민수";
		s2.age = 20;
		s2.score = 58;
		s2.height = 170.2;

		Student s3 = new Student();
		s3.name = "김익수";
		s3.age = 19;
		s3.score = 79;
		s3.height = 178.6;

		Student[] students = { s1, s2, s3 };

		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals("김익수")) {
				System.out.printf("이름: %s, 나이: %d, 점수: %d, 키: %.1f\n", students[i].name, students[i].age,
						students[i].score, students[i].height);
			}
		}

		Car c1 = new Car();

		c1.model = "제네시스";
		c1.price = 20_000_000;
		System.out.println(c1.maxSpeed);
		c1.start();
		c1.run();
		c1.stop();

		Car c2 = new Car("K5",200);

		c2.price = 22_000_000;
		System.out.println(c1.maxSpeed);

		c2.start();
		c2.run();
		c2.stop();
		c2.setSpeed(80);
		c2.showSpeed();
	}

}
