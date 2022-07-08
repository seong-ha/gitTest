package co.edu.interfaces;

public class FlyMain {

	public static void main(String[] args) {
		Flyer flyer = new Hellicopter();
		flyer.takeOff();
		flyer.fly();
		flyer.land();
		
		System.out.println();
		flyer = new Airplane();
		flyer.takeOff();
		flyer.fly();
		flyer.land();
	}

}
