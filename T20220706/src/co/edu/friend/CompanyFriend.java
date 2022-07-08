package co.edu.friend;

public class CompanyFriend extends Friend {
	private String company;
	private String department;
	
	public CompanyFriend() {}
	
	public CompanyFriend(String name, String tel, String company, String job) {
		super(name, tel);
		this.company = company;
		this.department = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJob() {
		return department;
	}

	public void setJob(String job) {
		this.department = job;
	}

	@Override
	public String toString() {
		return "CompanyFriend [이름=" + getName() + ", 연락처=" + getTel() + ", 회사=" + company + ", 부서="
				+ department + "]";
	}

	@Override
	public void showInfo() {
		System.out.printf("이름: %s, 연락처: %s, 회사: %s, 부서 %s"
				, super.getName(), super.getTel(), company, department);
	}
	
}
