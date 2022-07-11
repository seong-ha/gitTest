package co.edu.api;

public class StringText {

	public static void main(String[] args) {
		
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].indexOf("자바") != -1) {
				count++;
			}
		}
		System.out.println("==== 1번 ====");
		System.out.println("자바라는 글자가 들어간 단어의 수는 " + count + "개입니다.");

		String path = "c://images/hello.png";
		int point = path.indexOf(".");
		int filePoint = path.lastIndexOf("/");
		
		String fileName = path.substring(filePoint, point);
		String extender = path.substring(point + 1);
		
		System.out.println("==== 2번 ====");
		System.out.println("파일명: " + fileName + ", 확장자명: " + extender);
		
		String tel = "";
		String[] tels = { " 031", " 210 3", "34 78" };

		for (int i = 0; i < tels.length; i++) {
			tel += tels[i].trim();
			for (int j = 0; j < tel.length(); j++) {
				int blank = tel.indexOf(" ");
				if(blank != -1) {
					tel = tel.substring(0, blank) + tel.substring(blank + 1);
				}
			}
		}
		System.out.println("==== 3번 ====");
		System.out.println("tel: " + tel);
		
		System.out.println("==== 4번 ====");
		String[] ssn = { "970403-1234123", "010503 3456123", "980123/2412345", "0202023217891" };
		
		for (int i = 0; i < ssn.length; i++) {
			checkGender(ssn[i]);
		}
	}

	public static void checkGender(String ssn) {
		String[] str = ssn.split("");
		String replaceSsn = "";
		for (int i = 0; i < str.length; i++) {
			replaceSsn = ssn.replace("/", "").replace("-", "").replace(" ", "");
		}
		
		char gender = replaceSsn.charAt(6); 
		
		switch (gender) {
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
