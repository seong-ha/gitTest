package jshStud.haksaManagement;

public class ExeApp {

	public static void main(String[] args) {
		new Application();
		
		MemberManagement mm1 = MemberManagement.getInstance();
		MemberManagement mm2 = MemberManagement.getInstance();
		
		System.out.println(mm1 == mm2);
	}

}
