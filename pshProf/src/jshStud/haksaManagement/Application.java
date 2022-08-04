package jshStud.haksaManagement;

public class Application {

	public Application() {
		Member m = MemberManagement.getInstance().findMember("admin", "1234");
		System.out.println(m.toString());
	}
}
