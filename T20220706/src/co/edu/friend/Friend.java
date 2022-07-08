package co.edu.friend;

public class Friend {
	private String name;
	private String tel;
	
	Friend() {}
	
	public Friend(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

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

	@Override
	public String toString() {
		return "Friend [이름=" + name + ", 연락처=" + tel + "]";
	}

	public void showInfo() {
		System.out.printf("이름: %s, 연락처: %s", name, tel);
	}
}
