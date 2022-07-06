package co.edu.compound;

public class FriendMain {

	public static void main(String[] args) {
		Friend f1 = new Friend("전성하", "010-3649-7455", "ss03050@naver.com", "93.03.05");
		f1.showInfo();
		f1.setName("정규완");
//		System.out.println(f1.name);
		System.out.println(f1.getName());
		f1.setHeight(0);
		System.out.println(f1.getHeight());
	}

}
