package co.edu.interfaces;

public class Hellicopter implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("헬리콥터가 이륙합니다.");
	}

	@Override
	public void fly() {
		System.out.println("헬리콥터가 비행합니다.");
	}

	@Override
	public void land() {
		System.out.println("헬리콥터가 착륙합니다.");
	}

}