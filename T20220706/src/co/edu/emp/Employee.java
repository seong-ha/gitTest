package co.edu.emp;

//사원번호, 이름, 부서번호, 부서명, 급여, 이메일
public class Employee {
	private int    employeeId;		// 사번
	private String name;			// 이름
	private int    departmentId;	// 부서번호: 10:인사 20:개발 30:영업(기본값)
	private String departmentName;	// 부서명
	private int    salary;			// 급여
	private String email;			// 이메일
	
	public Employee() {}

	public Employee(int employeeId, String name) {
		this(employeeId, name, 100, 30);
	}
	
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}
	
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		switch (departmentId) {
			case 10:
				departmentName = "인사";
				break;
			case 20:
				departmentName = "개발";
				break;
			default:
				departmentName = "영업";
		}
	}
	
	public String getDetailInfo() {
		String Info = "사원번호: " + employeeId + ", 이름: " + name + ", 급여: " + salary + ", 부서명: " + departmentName; 
		return Info;
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
