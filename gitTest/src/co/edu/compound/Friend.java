package co.edu.compound;

public class Friend {
	private String name;
	private String tel;
	private String email;
	private String birthDay;
	private double height;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height <= 0 ) {
			System.out.println("잘못된 값이 입력됐습니다.");
			return;
		}
		this.height = height;
	}

	public Friend() {}
	
	public Friend(String name, String tel, String email, String birthDay) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.birthDay = birthDay;
		this.height = 178.7;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s\n연락처: %s\n이메일: %s\n생일: %s\n키: %.1f\n", name, tel, email, birthDay, height);
		
	}
}
