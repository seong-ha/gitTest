package co.edu;

public class StudentMain {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.setSno("22-001");
		kim.setName("김민수");
		kim.setScore(80);
		
		System.out.println("이름: " + kim.getName());
		kim.showInfo();

		Student jeon = new Student("22-002", "전성하", 88);
		jeon.showInfo();
		
		Student jeong = new Student("22-003", "정규완", 99);
		Student jing = new Student("22-004", "징징이", 97);
		
		Course course = new Course("김철수", "1-3", 25);
		System.out.println("선생님: " + course.getTname());
		System.out.println("반정보: " + course.getBname());
		
		course.addStudents(jeon);
		course.addStudents(kim);
		course.addStudents(jeong);
		course.addStudents(jing);
		course.getStudents();
		
		System.out.println();
		System.out.println("--- 최고 점수 학생 ---");
		Student maxStudent = course.getMaxScore();
		maxStudent.showInfo();
		System.out.println();
		
		System.out.printf("평균: %.1f\n", course.getScoreAvg());
	}

}