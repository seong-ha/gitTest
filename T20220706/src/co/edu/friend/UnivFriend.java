package co.edu.friend;

public class UnivFriend extends Friend{
	private String univ;
	private String major;
	
	public UnivFriend() {}
	
	public UnivFriend(String name, String tel, String univ, String major) {
		super(name, tel);
		this.univ = univ;
		this.major = major;
	}

	public String getSchool() {
		return univ;
	}

	public void setSchool(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [이름=" + getName() + ", 연락처=" + getTel() + ", 대학=" + univ + ", 전공=" + major
				+ "]";
	}

	@Override
	public void showInfo() {
		System.out.printf("이름: %s, 연락처: %s, 대학교: %s, 전공 %s"
				, super.getName(), super.getTel(), univ, major);
	}
	
}
