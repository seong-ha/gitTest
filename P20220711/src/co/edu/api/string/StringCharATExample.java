package co.edu.api.string;

public class StringCharATExample {

	public static void main(String[] args) {
		String ssn = "0106242230123";
		checkGender(ssn);
	}
	
	public static void checkGender(String ssn) {
		char sex = ssn.charAt(7);
		
		if (ssn.length() == 13) {
			sex = ssn.charAt(6);
		}
		
		switch (sex) {
		case '1': case '3':
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
